/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author wellington
 */
public class Caneta {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	
	void status() {
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga + "%");
		System.out.println("Tampada: " + this.tampada);
	}
	
	public void rabiscar() {
		if (this.tampada) {
			System.out.println("ERRO! Não posso rabiscar.");
		} else {
			System.out.println("Estou Rabiscando!");
		}
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
}
