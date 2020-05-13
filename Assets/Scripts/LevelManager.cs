using System;
using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;
using UnityEngine.Video;

public class LevelManager : MonoBehaviour
{
    public int levelNumber;
    public Button[] buttons;
    public Image[] fillAreas;
    public Text[] textFields;
    public GameObject[] steps;
    public VideoPlayer video;
    public GameObject winPopupBox;
    public RenderTexture videoPanel;
    private int selection; // Variable that holds the player's response
    private int currentBlank; // The blank the game is currently waiting on the player to fill out
    private int step; // The step the player is currently solving
    private int[] correctAnswers; // Correct answers list in integer form
    private int[] transitions; // The blanks at which we should hide the previous step and display the next
    private string[] options; // The valid response options for this level
    private float[] videoSegmentLengths; // The video segment lengths corresponding to the steps the player is supposed to solve
    // Start is called before the first frame update
    void Start()
    {
        selection = -1;
        currentBlank = 0;
        step = 0;
        videoPanel.Release(); // Reset the render texture that serves as the video panel
        // Assign the right set of correct answers in integer form
        switch (levelNumber)
        {
            case 1:
                correctAnswers = new int[] { 1, 3, 0, 2, 0, 1, 0, 2, 0, 3, 1, 5, 0, 2, 5, 0, 1, 5, 0, 2, 4, 0, 1, 4, 0, 2, 3 };
                transitions = new int[] { 3, 5, 7, 9, 10, 13, 16, 19, 22, 25, 27 };
                options = new string[] { "Reverse", "Left", "Right", "Kia", "Slide-Up", "Front" };
                videoSegmentLengths = new float[] { 3.75f, 1.4f, 1.65f, 1.125f, 0.375f, 2.6f, 2.4f, 2.5f, 3.5f, 3.35f, 1.55f };
                break;
            case 2:
                correctAnswers = new int[] { 0, 1, 0, 3, 5, 0, 2, 0, 5, 0, 1, 0, 5, 0, 2, 0, 5, 3, 4, 1, 5, 4, 2, 5, 4, 1, 5, 4, 2, 5, 6, 5, 7, 5, 7, 5, 3 };
                transitions = new int[] { 4, 5, 8, 9, 12, 13, 16, 18, 21, 24, 27, 30, 32, 34, 37 };
                options = new string[] { "Low", "Left", "Right", "Kia", "Scoop", "Punch", "Forward", "Backward" };
                videoSegmentLengths = new float[] { 4.15f, 1.05f, 1.5f, 1.1f, 1.2f, 1.1f, 1.6f, 1.4f, 2.4f, 2.6f, 2.5f, 2.5f, 1.2f, 1.2f, 2.2f };
                break;
            case 3:
                correctAnswers = new int[] { 3, 0, 0, 2, 7, 3, 1, 1, 7, 4, 0, 8, 7, 8, 7, 8, 7, 2, 6, 6, 1, 7, 6, 6, 0, 7, 4, 0, 5, 8, 5, 8, 5, 8, 5, 0, 9, 7, 1, 1, 9, 7, 0, 2 };
                transitions = new int[] { 4, 5, 8, 9, 11, 13, 15, 18, 20, 22, 24, 26, 28, 29, 31, 33, 35, 37, 39, 41, 44 };
                options = new string[] { "Left", "Right", "Kia", "Sudo", "Low", "High", "Box", "Punch", "Forward", "Horse" };
                videoSegmentLengths = new float[] { 4.9f, 1.1f, 1.2f, 1.1f, 1.2f, 1.2f, 1.2f, 1.6f, 1.6f, 1.2f, 1.5f, 1.2f, 1.3f, 0.8f, 1.3f, 1.3f, 1.2f, 1.7f, 1.2f, 1.5f, 2.2f};
                break;
            default:
                Debug.Log("Not A Valid Level Number!");
                break;
        }

        // Assign the button listeners
        for (int i = 0; i < buttons.Length; i++)
        {
            int buttonSignal = i;
            buttons[i].onClick.AddListener(() => { selection = buttonSignal; Debug.Log("Button Was Pressed"); /*Debug.Log(selection);*/ }); // Each button sends a unique integer signal to the level manager
        }
    }

    // Update is called once per frame
    void Update()
    {
        //Debug.Log(selection);
        if (currentBlank == correctAnswers.Length || selection == -1)
        {
            // Do nothing. This prevents the player from breaking the game after the level has finished.
        }
        else if (selection == correctAnswers[currentBlank]) // The player was correct, so let's move on
        {
            textFields[currentBlank].text = options[selection];
            fillAreas[currentBlank].color = Color.green;
            currentBlank++; // Point to the next blank

            if (currentBlank == transitions[step]) // If we finished a step, play the video clip, then move onto the next step
                StartCoroutine(PlayVideoSegment(videoSegmentLengths[step])); // Play the video clip and manage the text boxes containing the information for the kata's steps
            else
                fillAreas[currentBlank].gameObject.SetActive(true); // Display the next blank's fill area
            selection = -1; // Reset selection
        }
        else // The player was incorrect
        {
            textFields[currentBlank].text = options[selection];
            fillAreas[currentBlank].color = Color.red;
        }
    }

    IEnumerator PlayVideoSegment(float duration)
    {
        video.Play();
        yield return new WaitForSeconds(duration);
        video.Pause();

        if (currentBlank == correctAnswers.Length) // The player completed the level 
            winPopupBox.SetActive(true); // Display the congratulatory message and ask the player what they want to do next
        else
        {
            steps[step].SetActive(false);
            step++;
            steps[step].SetActive(true);
        }
        selection = -1; // Reset selection for idiots spamming buttons while the video is playing
    }
}
