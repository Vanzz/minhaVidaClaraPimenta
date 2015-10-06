using UnityEngine;
using System.Collections;
using System.Collections.Generic;

public class PokemonManager : MonoBehaviour {

	public List<Pokemon> pokemonList = new List<Pokemon>();

	private static PokemonManager instance;

	public static PokemonManager Instance {
		get {
			if(instance == null)
			{
				instance = FindObjectOfType<PokemonManager>() as PokemonManager;
			}
			return instance;
		}
	}

	public void AddPokemon(Pokemon p)
	{
		pokemonList.Add(p);
	}

	public void ShowPokemons()
	{
		foreach(Pokemon p in pokemonList)
		{
			Debug.Log(p.name);
		}
	}
}
