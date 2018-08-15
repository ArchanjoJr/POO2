package exercicio1;

import java.util.Scanner;

public class App {
    //Exercicio 1
    public static int Soma(int a, int b){
        return a+b;
    }
    public static int Subtr(int a, int b){
        return a-b;
    }
    public static int Multp(int a, int b){
        return a*b;
    }
    public static float Divis(int a, int b){
        return (float) a/b;
    }
    // Exercicio 2
    public static float Media(int a, int b) {
        return (float) (a + b) / 2;
    }
    public static void MaiorouMenor(int a, int b){
        if (a > b) {
            System.out.printf("%d, %d", a, b);
        } else {
            System.out.printf("%d, %d", b, a);
        }
    }
    // Exercicio4
    public static void Primos(int a, int b){
        if(a%b == 0){
            System.out.printf("%d e %d são primos.", a, b);
        }else{
            System.out.printf("%d e %d Não são primos.", a, b);
        }
    }
	public static void main(String[] args) {
		int a,b;
		Scanner read = new Scanner(System.in);
		System.out.print("Digite o primeiro numero: ");
		a = read.nextInt();
		System.out.print("Digite o Segundo Numero: ");
		b = read.nextInt();

		System.out.printf("SOMA: %d \nSUBTR: %d \nMULTI: %d \nDIVIS: %.2f", Soma(a,b), Subtr(a, b), Multp(a, b), Divis(a, b));

		System.out.printf("SOMA: %d \nMEDIA: %d\n", Soma(a, b), Media(a, b));
		App.MaiorouMenor(a, b);
        App.Primos(a, b);
	}

}
