using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;
using UnityEngine.UI;

public enum ButtonType
{
	PLAYAGAIN,
	NEXTKATA,
	QUIT,
	YES,
	NO,
	OK,
	BACKTOMAINMENU,
	WHITEBELT,
	GOLDBELT,
	ORANGEBELT,
	PURPLEBELT,
	GREENBELT,
	BLUEBELT0,
	BLUEBELT1,
	REDBELT0,
	REDBELT1,
	BROWNBELT0,
	BROWNBELT1,
	BROWNBELT2,
	BLACKBELT
}

public class MainMenuButtons : MonoBehaviour
{
	public ButtonType bt = ButtonType.QUIT; // Default to quit button. The program will close unexpectedly if the button is screwed up.

	private Button theButton;

	private void Start()
	{
		theButton = GetComponent<Button>();

		if (theButton == null)
		{
			return;
		}

		switch (bt)
		{
			case ButtonType.QUIT:
				theButton.onClick.AddListener(Quit);
				break;
			case ButtonType.WHITEBELT:
				theButton.onClick.AddListener(LoadKata1);
				break;
			case ButtonType.GOLDBELT:
				theButton.onClick.AddListener(LoadKata2);
				break;
			case ButtonType.ORANGEBELT:
				theButton.onClick.AddListener(LoadKata3);
				break;
			case ButtonType.PURPLEBELT:
				theButton.onClick.AddListener(LoadKata4);
				break;
			case ButtonType.GREENBELT:
				theButton.onClick.AddListener(LoadKata5);
				break;
			case ButtonType.BLUEBELT0:
				theButton.onClick.AddListener(LoadKata6);
				break;
			case ButtonType.BLUEBELT1:
				theButton.onClick.AddListener(LoadKata7);
				break;
			case ButtonType.REDBELT0:
				theButton.onClick.AddListener(LoadKata8);
				break;
			case ButtonType.REDBELT1:
				theButton.onClick.AddListener(LoadKata9);
				break;
			case ButtonType.BROWNBELT0:
				theButton.onClick.AddListener(LoadKata10);
				break;
			case ButtonType.BROWNBELT1:
				theButton.onClick.AddListener(LoadKata11);
				break;
			case ButtonType.BROWNBELT2:
				theButton.onClick.AddListener(LoadKata12);
				break;
			case ButtonType.BLACKBELT:
				theButton.onClick.AddListener(LoadKata13);
				break;
		}
	}

	public void LoadKata1() // Load the scene for the white belt kata
	{
		SceneManager.LoadScene(1);
	}

	public void LoadKata2() // Load the scene for the gold belt kata
	{
		SceneManager.LoadScene(2);
	}

	public void LoadKata3() // Load the scene for the orange belt kata
	{
		SceneManager.LoadScene(3);
	}

	public void LoadKata4() // Load the scene for the purple belt kata
	{
		SceneManager.LoadScene(4);
	}

	public void LoadKata5() // Load the scene for the green belt kata
	{
		SceneManager.LoadScene(5);
	}

	public void LoadKata6() // Load the scene for the first blue belt kata
	{
		SceneManager.LoadScene(6);
	}

	public void LoadKata7() // Load the scene for the second blue belt kata
	{
		SceneManager.LoadScene(7);
	}

	public void LoadKata8() // Load the scene for the first red belt kata
	{
		SceneManager.LoadScene(8);
	}

	public void LoadKata9() // Load the scene for the second red belt kata
	{
		SceneManager.LoadScene(9);
	}

	public void LoadKata10() // Load the scene for the brown belt kata
	{
		SceneManager.LoadScene(10);
	}

	public void LoadKata11() // Load bo form 1
	{
		SceneManager.LoadScene(11);
	}

	public void LoadKata12() // Load bo form 2
	{
		SceneManager.LoadScene(12);
	}

	public void LoadKata13() // Load the scene for the black belt kata
	{
		SceneManager.LoadScene(13);
	}

	public void Quit()
	{
		Debug.Log("User Exited Game.");
		Application.Quit();
	}
}
