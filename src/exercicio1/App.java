package exercicio1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int a,b;
		Scanner read = new Scanner(System.in);
		System.out.print("Digite o primeiro numero: ");
		a = read.nextInt();
		System.out.print("Digite o Segundo Numero: ");
		b = read.nextInt();
		// Exercicio 1 LISTA 2
		System.out.printf("SOMA: %d \nSUBTR: %d \nMULTI: %d \nDIVIS: %.2f",(a+b), (a-b), (a*b), ((float) a/b));
		// EXERCICIO 2 LISTA 2
		System.out.printf("SOMA: %d \nMEDIA: %d\n",(a+b), (a+b)/2);
		if (a > b) {
			System.out.printf("%d, %d", a, b);
		} else {
			System.out.printf("%d, %d", b, a);
		}
	}

}
