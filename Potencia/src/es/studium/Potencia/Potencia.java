package es.studium.Potencia;

import java.util.Scanner;

public class Potencia { 

	public static void main(String[] args) 
	{
		int base, exponente, i, resultado;
		resultado=1;
		base=0;
		exponente=0;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce la base:");
		base= teclado.nextInt();

		System.out.println("Introduce el exponente:");
		exponente=teclado.nextInt();

		for(i=1; i<=exponente;i++) 
		{
			resultado= resultado*base;
		}
		System.out.println(base+" " + "elevado a"+" " + exponente +" "+"vale="+" "+ resultado);
		teclado.close();
	}

}
