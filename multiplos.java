package Main;

import java.util.Scanner;

public class multiplos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese 2 numeros");
		int resto;
		System.out.println("ingrese numero1 numeros");
		int num1 = 0;
		num1= sc.nextInt();
		System.out.println("ingrese numero2 numeros");
		int num2 = 0;
		num2= sc.nextInt();
		resto = num1%num2;

		if (resto==0) {
		  System.out.println(num1 + " es múltiplo de " + num2);
		
	}else
		  System.out.println(num1 + " NO es múltiplo de " + num2);

}
}
	
