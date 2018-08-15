package exercicio3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio {
    // EXERCICIO 3
    public static void main(String[] args){
        int v[] = new int[5];
        Scanner read = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o Numero %d: ", i+1);
            v[i]= read.nextInt();
        }
        Arrays.sort(v);
        System.out.printf("Maior: %d\nMenor: %d", (v[0]), v[v.length-1]);
    }
}
