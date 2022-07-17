package exercicios.loops.e.arrays;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido.
Cotinue pedindo até que o usuário informe um valor válido.
 */

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Digite uma nota: ");
        nota = scan.nextInt();

        while (nota < 0 | nota >10) {
            System.out.println("Nota Inválida. Digite novamente: ");
            nota = scan.nextInt();
        }

        System.out.println("Você digitou a nota: " + nota + " e essa é uma nota válida.");

    }


}
