package exercicios.loops.e.arrays;
/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
 */

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tabuada;

        System.out.println("Digite o número da Tabuada que você quer: ");
        tabuada = scan.nextInt();

        System.out.println("Tabuada de: " +  tabuada);

        for (int count = 1; count <=10; count++) {
            System.out.println(tabuada + " X " + count + " = " + (tabuada * count));
        }

    }

}

