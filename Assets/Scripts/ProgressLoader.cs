using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using System.IO;
using System;

public class ProgressLoader : MonoBehaviour
{
    public GameObject[] katas; // The katas
    void Start()
    {
        Debug.Log(Application.persistentDataPath);
        string path = Application.persistentDataPath + "/save.txt";

        try
        {
            StreamReader read = new StreamReader(path);
            int katasToShow = Int32.Parse(read.ReadLine()); // Show all katas from the first one to the number specified here
            read.Close();
            LoadKatas(katasToShow);
            Debug.Log("Loaded Progress.");
        }
        catch (Exception e) // If the save file doesn't exist, create it
        {
            StreamWriter write = new StreamWriter(path);
            write.WriteLine("0");
            write.Close();
            LoadKatas(0);
            Debug.Log("Created New Save File.");
        }
    }

    void LoadKatas(int numKatas) // Show the katas specified by the save file
    {
        for (int i = 0; i <= numKatas; i++)
        {
            katas[i].SetActive(true);
        }
    }
}
