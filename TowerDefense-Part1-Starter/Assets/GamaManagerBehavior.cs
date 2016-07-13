using UnityEngine;
using System.Collections;
using UnityEngine.UI;

public class GamaManagerBehavior : MonoBehaviour {

	public Text goldLabel;
	public Text waveLabel;
	public GameObject[] nextWaveLabels;
	public bool gameOver = false;

	private int wave;
	public int Wave {
		get { return wave; }
		set {
			wave = value;
			if (!gameOver) {
				for (int i = 0; i < nextWaveLabels.Length; i++) {
					nextWaveLabels[i].GetComponent<Animator>().SetTrigger("nextWave");
				}
			}
			waveLabel.text = "WAVE: " + (wave + 1);
		}
	}

	private int gold;
	public int Gold {
		get { return gold; }
		set {
			gold = value;
			goldLabel.GetComponent<Text>().text = "GOLD: " + gold;
		}
	}

	void Start(){
		Wave = 0;
		Gold = 1000;
	}
}
