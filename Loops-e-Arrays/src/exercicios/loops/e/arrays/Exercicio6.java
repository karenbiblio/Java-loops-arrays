package exercicios.loops.e.arrays;
/*
Faça um programa que exiba o fatorial fornecido pelo usuário.
ex. de exibição: 5! = 120
 */

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.print(fatorial + "! = ");

        for (int count = fatorial; count >= 1; count--) {
            multiplicacao = multiplicacao * count;
        }

        System.out.println(multiplicacao);
    }


}
