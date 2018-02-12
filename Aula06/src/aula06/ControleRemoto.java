/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

/**
 *
 * @author wellington
 */
public class ControleRemoto implements Controlador{
	
	//Atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;

	//metodo construtor
	public ControleRemoto() {
		this.setVolume(50);
		this.setLigado(false);
		this.setTocando(false);
	}
	
	//Metodos Abstratos
	@Override
	public void ligar() {
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		if (this.isLigado()) {
			System.out.println("-----MENU-----");
		System.out.println("Ligado: " + this.isLigado());
		System.out.println("Tocando: " + this.isTocando());
		System.out.print("Volume: " + this.getVolume() + " ");
		for (int i = 0; i <= this.getVolume(); i += 10) {
			System.out.print("|");
		}
		System.out.println("");
		}
	}

	@Override
	public void fecharMenu() {
		if (ligado) {
			System.out.println("Fechando menu...");
		}
	}

	@Override
	public void maisVoulume() {
		if (this.isLigado()) {
			this.setVolume(this.getVolume() + 5);
		}
	}

	@Override
	public void menosVolume() {
		if (this.isLigado()) {
			this.setVolume(this.getVolume() - 5);
		}
	}

	@Override
	public void ligarMudo() {
		if (this.isLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
	}

	@Override
	public void desligarMudo() {
		if (this.isLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}

	@Override
	public void play() {
		if (this.isLigado() && !this.isTocando()) {
			this.setTocando(true);
		}
	}

	@Override
	public void pause() {
		if (this.isLigado() && this.isTocando()) {
			this.setTocando(false);
		}
	}

	//metodos especiais
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean isTocando() {
		return tocando;
	}

	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
}
