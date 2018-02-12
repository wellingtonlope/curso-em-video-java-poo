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
public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
			this.setAprovada(true);
			this.setDesafiado(l1);
			this.setDesafiante(l2);
		} else {
			this.setAprovada(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
		}
	}
	
	public void lutar() {
		if (this.isAprovada()) {
			this.getDesafiado().apresentar();
			this.getDesafiante().apresentar();
			int vencedor = (int) (0 + Math.random() * (3-0));
			System.out.println("-----LUTA-----");
			switch (vencedor) {
				case 0: //Empate
					System.out.println("Empatou");
					this.getDesafiado().empatarLuta();
					this.getDesafiante().empatarLuta();
					break;
				case 1: //Ganhou Desafiado
					System.out.println(this.getDesafiado().getNome() + " ganhou");
					this.getDesafiado().ganharLuta();
					this.getDesafiante().perderLuta();
					break;
				case 2: //Ganhou Desafiante
					System.out.println(this.getDesafiante().getNome() + " ganhou");
					this.getDesafiado().perderLuta();
					this.getDesafiante().ganharLuta();
					break;
			}
		} else {
			System.out.println("Luta não pode acontecer");
		}
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

	
}
