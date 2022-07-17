package exercicios.loops.e.arrays;
/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números ímpares.
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qntnumero;
        int numero;
        int count = 0;
        int pares = 0;
        int impares = 0;

        System.out.println("Digite a quantidade de números: ");
        qntnumero = scan.nextInt();

        do {

            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) pares++;
            else impares++;

            count++;

        }while(count < qntnumero);

        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de ímpares: " + impares);

    }

}
