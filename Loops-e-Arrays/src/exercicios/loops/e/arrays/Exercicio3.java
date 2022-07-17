package exercicios.loops.e.arrays;
/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
 */

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       int numero;
       int maior = 0;
       int soma = 0;
       float media;
       int count = 0;

        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;

            count = count + 1;

        } while(count < 5);

        System.out.println("Esse é o maior número: " + maior);

        media = soma / 5;

        System.out.println("Essa é a Média: " + media);

    }


}
