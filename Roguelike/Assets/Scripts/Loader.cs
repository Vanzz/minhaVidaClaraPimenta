using UnityEngine;
using System.Collections;

public class Loader : MonoBehaviour {

	public GameObject gameManager;

	void Start () {
		if(GameManager.instance == null)
			Instantiate(gameManager);
	}
}
