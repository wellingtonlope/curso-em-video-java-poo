/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

/**
 *
 * @author wellington
 */
public class Aula12 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
//		Animal n = new Animal();
//		Mamifero m = new Mamifero();
//		Reptil r = new Reptil();
//		Peixe p = new Peixe();
//		Ave a = new Ave();
//		
//		m.setPeso(35.3f);
//		m.setCorPelo("Marrom");
//		m.alimentar();
//		m.locomover();
//		m.emitirSom();
//		
//		r.locomover();
//		p.locomover();
//		a.locomover();
		
		Canguru c = new Canguru();
		Cachorro k = new Cachorro();
		
		c.locomover();
		k.locomover();
		c.emitirSom();
		k.emitirSom();
	}
	
}
