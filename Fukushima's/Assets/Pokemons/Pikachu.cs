using UnityEngine;
using System.Collections;

public class Pikachu : Pokemon {

	public override void Attack ()
	{
		Debug.Log("Pikachu Attack!");
		base.Attack();
	}
}