using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class PopupText : MonoBehaviour
{
    private Animator textAnimator;

    void Start()
    {
        textAnimator = GetComponent<Animator>();
        textAnimator.Play("Expand");
    }
}
