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
public class Tempo {
	int dia;
	int mes;
	int ano;
	int hora;
	int minuto;
	int segundo;
	
	void status() {
		System.out.println("Dia " + dia + "/" + mes + "/" + ano + " às " + hora + ":" + minuto + ":" + segundo);
	}
}
