using UnityEngine;
using System.Collections;

public class Pokemon : MonoBehaviour {

	public Stats stats = new Stats();

	public int countAtk;

	private bool isShiny;

	public bool IsShiny {
		get {
			return isShiny;
		}
	}

	public virtual void Attack()
	{
		Debug.Log("Pokemon Attack!");
		countAtk++;
	}
	
	public virtual void Defend()
	{
		Debug.Log("Pokemon Defend!");
	}
	
	public virtual void Jump()
	{
		Debug.Log("Pokemon Jump!");
	}

	protected virtual void Start()
	{
		PokemonManager.Instance.AddPokemon(this);
	}
}
