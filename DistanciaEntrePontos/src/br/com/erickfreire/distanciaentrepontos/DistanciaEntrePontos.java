package br.com.erickfreire.distanciaentrepontos;

import java.util.Scanner;

/**
 * Programa em Java que informa dois pontos e informa a distancia entre eles.
 * @author erick freire
 * @version 1 - Criado em 11-05-2021 as 13:45
 */

public class DistanciaEntrePontos {

	public static void main(String[] args) {
		
		double x1;
		double y1;
		double x2;
		double y2;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que calcula a distância entre dois pontos: ");
		
		System.out.print("Digite o x do primeiro ponto: ");
		x1 = entrada.nextDouble();
		System.out.print("Digite o y do primeiro ponto: ");
		y1 = entrada.nextDouble();
		
		System.out.print("Digite o x do segundo ponto: ");
		x2 = entrada.nextDouble();
		System.out.print("Digite o y do segundo ponto: ");
		y2 = entrada.nextDouble();
		
		calculaDistancia(x1,y1,x2,y2);

	}
	
	public static void calculaDistancia(double x1, double y1, double x2, double y2) {
		double res1 = (x2 - x1);
		double res11 = Math.pow(res1, 2);
		double res2 = (y2 - y1);
		double res21 = Math.pow(res2, 2);
		double res3 = res11 + res21;
		double resFinal = Math.sqrt(res3);
		
		System.out.printf("%n%nA distância é de: %f%n", resFinal);
	}

}
