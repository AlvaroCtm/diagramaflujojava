package Main;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("////Calculadora solo division con numeros naturales////");
			int numerador , denominador , Resultado;
			System.out.println("ingrese el numerador");
			numerador = sc.nextInt();
			System.out.println("ingrese el denominador");
			denominador = sc.nextInt();
			Resultado = numerador/denominador;
			
			if(denominador == Resultado) {
				System.out.println("El resultado es igual a :" +Resultado);
					
			}else{
				System.out.println("no es posible dividir denominador es 0 o mayor al numerador ");
				System.out.println("introdusca otro numero ...");
				
			}

	}

}
