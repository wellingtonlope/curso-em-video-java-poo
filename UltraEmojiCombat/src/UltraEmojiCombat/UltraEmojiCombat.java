/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UltraEmojiCombat;

/**
 *
 * @author wellington
 */
public class UltraEmojiCombat {

	//String nome, String nacionalidade, int idade, float altura, 
	//float peso, int vitorias, int derrotas, int empates
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		Lutador lutadores[] = new Lutador[6];
		lutadores[0] = new Lutador(
				"Pretty Boy",
				"França",
				31, 1.75f, 68.9f,
				11, 3, 1
		);
		lutadores[1] = new Lutador(
				"Putscript",
				"Brasil",
				29, 1.68f, 57.8f,
				14, 2, 3
		);
		lutadores[2] = new Lutador(
				"Snapshadow",
				"EUA",
				35, 1.65f, 80.9f,
				12, 2, 1
		);
		lutadores[3] = new Lutador(
				"Dead Code",
				"Austrália",
				28, 1.93f, 81.6f,
				13, 0, 2
		);
		lutadores[4] = new Lutador(
				"UFOCobol",
				"Brasil",
				37, 1.70f, 119.3f,
				5, 4, 3
		);
		lutadores[5] = new Lutador(
				"Nerdaart",
				"EUA",
				30, 1.81f, 105.7f,
				12, 2, 4
		);

		//mostrar lutadores
		for (Lutador lutador : lutadores) {
			lutador.status();
		}

		//marcar luta
		Luta UEC01 = new Luta();
		UEC01.marcarLuta(lutadores[0], lutadores[1]);
		UEC01.lutar();
		
		lutadores[0].status();
		lutadores[1].status();
	}
}
