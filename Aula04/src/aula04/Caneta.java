/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

/**
 *
 * @author wellington
 */
public class Caneta {
	private String modelo;
	private float ponta;
	private boolean tampada;
	private String cor;
	
	//método construtor
	public Caneta() {
		this.tampar();
		this.setCor("Azul");
	}
	
	public Caneta(String modelo, String cor, float ponta) {
		this.setModelo(modelo);
		this.setCor(cor);
		this.setPonta(ponta);
		this.tampar();
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public float getPonta() {
		return this.ponta;
	}
	
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
	public boolean getTampada() {
		return this.tampada;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	} 
	
	public void status() {
		System.out.println("SOBRE A CANETA:");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Tampada: " + this.getTampada());
	}
}
