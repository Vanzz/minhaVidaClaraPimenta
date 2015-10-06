using UnityEngine;
using System.Collections;

[System.Serializable]
public class Stats {

	private string name;


	public int health;
	public int damage;

	public void Name(string pName) {
		if(pName == "Hitler"){
			name = "PikaJesus";
		}
		else {
			name = pName;
		}
	}

	// Use this for initialization
	void Start () {
	
	}
	
	// Update is called once per frame
	void Update () {
	
	}
}
