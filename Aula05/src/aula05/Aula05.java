/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

/**
 *
 * @author wellington
 */
public class Aula05 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		ContaBanco conta = new ContaBanco();
		conta.abrirConta("Wellington", 1, "CP");
		conta.sacar(150);
		conta.status();
		conta.fecharConta();
		conta.status();
	}
	
}
