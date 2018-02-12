/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolivro;

/**
 *
 * @author wellington
 */
public class ProjetoLivro {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		Pessoa pessoas[] = new Pessoa[2];
		Livro livros[] = new Livro[3];
		
		pessoas[0] = new Pessoa("Pedro", 22, "M");
		pessoas[1] = new Pessoa("Maria", 25, "F");
		
		livros[0] = new Livro("Aprendendo Java", "José da Silva", 300, pessoas[0]);
		livros[1] = new Livro("POO para Iniciantes", "Pedro Paulo", 500, pessoas[1]);
		livros[2] = new Livro("Java Avançado", "Maria Candido", 800, pessoas[0]);
	
		livros[0].abrir();
		livros[0].folhear(300);
		livros[0].avancarPag();
		livros[0].detalhes();
	}
	
}
