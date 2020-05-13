using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;
using UnityEngine.UI;

public class PopupMenuButtons : MonoBehaviour
{
	public ButtonType bt = ButtonType.QUIT; // Default to quit button. The program will close unexpectedly if the button is screwed up.

	private Button theButton;

	public GameObject popupBox;
	public GameObject popupBox2;

	private void Start()
	{
		theButton = GetComponent<Button>();

		if (theButton == null)
		{
			return;
		}

		switch (bt)
		{
			case ButtonType.BACKTOMAINMENU:
				theButton.onClick.AddListener(PopUpBox);
				break;

			case ButtonType.YES:
				theButton.onClick.AddListener(ReturnToMainMenu);
				break;

			case ButtonType.NO:
				theButton.onClick.AddListener(Resume);
				break;

			case ButtonType.OK:
				theButton.onClick.AddListener(Acknowledged);
				break;

			case ButtonType.NEXTKATA:
				theButton.onClick.AddListener(NextKata);
				break;

			case ButtonType.QUIT:
				theButton.onClick.AddListener(Quit);
				break;
		}
	}

	public void PopUpBox() // Shows the popup message box
	{
		popupBox.SetActive(true);
	}

	public void ReturnToMainMenu() // Loads the main menu
	{
		SceneManager.LoadScene(0);
	}

	public void Resume() // Resumes the current session
	{
		popupBox.SetActive(false);
	}

	public void Acknowledged() // Hides the popup box and displays the next one
	{
		popupBox.SetActive(false);
		popupBox2.SetActive(true);
	}

	public void NextKata() // Go to the next kata
	{
		SceneManager.LoadScene(SceneManager.GetActiveScene().buildIndex + 1);
	}

	public void Quit()
	{
		Debug.Log("User Exited Game.");
		Application.Quit();
	}
}