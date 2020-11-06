using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.Events;


[RequireComponent(typeof(Collider))]
public class ClickHandler : MonoBehaviour
{

    public UnityEvent upEvent;
    public UnityEvent downEvent;

    void OnMouseUp()
    {
        Debug.Log("Up");
        upEvent?.Invoke();
    }

    void OnMouseDown()
    {
        Debug.Log("Down");
        downEvent?.Invoke();
    }
}
