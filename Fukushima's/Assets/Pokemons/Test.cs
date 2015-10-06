using UnityEngine;
using System.Collections;

public class Test : MonoBehaviour {

	public Pokemon pkm;

	// Use this for initialization
	void Start () {
		pkm.Attack();
		PokemonManager.Instance.ShowPokemons();
	}
	
	// Update is called once per frame
	void Update () {
	
	}
}
