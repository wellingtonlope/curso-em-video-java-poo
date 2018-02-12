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
public class ContaBanco {
	public int numeroConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	public ContaBanco() {
		this.setStatus(false);
		this.setSaldo(0);
	}
	
	public void abrirConta(String dono, int numeroConta, String tipo) {
		this.setStatus(true);
		this.setTipo(tipo);
		this.setDono(dono);
		this.setNumeroConta(numeroConta);
		if (tipo.equals("CC")) {
			this.depositar(50);
		} else {
			this.depositar(150);
		}
	}
	
	public void fecharConta() {
		if(this.getSaldo() != 0) {
			System.out.println("Erro ao fechar a conta, verifique o seu saldo");
		} else {
			this.setStatus(false);
		}
	}
	
	public void depositar(float valor) {
		if(this.getStatus()) {
			this.setSaldo(this.getSaldo() + valor);
		}
	}
	
	public void sacar(float valor) {
		if(this.getSaldo() >= valor && this.getStatus()) {
			this.setSaldo(this.getSaldo() - valor);
		}
	}
	
	public void pagarMensal() {
		if(this.getTipo() == "CC") {
			this.setSaldo(this.getSaldo() - 12);
		} else {
			this.setSaldo(this.getSaldo() - 20);
		}
	}
	
	public void status() {
		System.out.println("INFORMAÇÕES DA CONTA:");
		System.out.println("Numero conta: " + this.getNumeroConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
