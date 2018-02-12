/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio02;

/**
 *
 * @author wellington
 */
public class Oculos {
	String cor;
	String marca;
	float grau;
	boolean quebrado;
	
	void ver() {
		if (this.quebrado) {
			System.out.println("ERRO! Não é possivel ver");
		} else {
			System.out.println("Você está vendo");
		}
	}
}
