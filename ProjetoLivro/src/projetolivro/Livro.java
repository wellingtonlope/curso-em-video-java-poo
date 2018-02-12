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
public class Livro implements Publicacao {

	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;

	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.aberto = false;
		this.pagAtual = 0;
		this.leitor = leitor;
	}

	public void detalhes() {
		System.out.println("-----LIVRO-----");
		System.out.println("Titulo: " + this.titulo);
		System.out.println("Autor: " + this.autor);
		System.out.println("Total de Paginas: " + this.totPaginas);
		System.out.println("Aberto: " + this.aberto);
		System.out.println("Pagina Atual: " + this.pagAtual);
		System.out.println("--LEITOR--");
		System.out.println("Nome: " + this.leitor.getNome());
		System.out.println("Idade: " + this.leitor.getIdade());
		System.out.println("Sexo: " + this.leitor.getSexo());
	}

	@Override
	public void abrir() {
		this.setAberto(true);
	}

	@Override
	public void fechar() {
		this.setAberto(false);
	}

	@Override
	public void folhear(int pagina) {
		if (pagina <= this.totPaginas) {
			this.setPagAtual(pagina);
		} else {
			this.setPagAtual(0);
		}
	}

	@Override
	public void avancarPag() {
		if (this.pagAtual > this.totPaginas) {
			this.setPagAtual(this.getPagAtual() + 1);
		}
		
	}

	@Override
	public void voltarPag() {
		if (this.pagAtual > 0) {
			this.setPagAtual(this.getPagAtual() - 1);
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotPaginas() {
		return totPaginas;
	}

	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

}
