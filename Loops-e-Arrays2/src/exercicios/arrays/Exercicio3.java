package exercicios.arrays;

/*
Faça um programa que leia 15 números inteiros aleatórios (entre 0 e 25)
e que armazene num vetor.
Ao fina mostre os números e seus sucessores.
 */

import java.util.Random;

public class Exercicio3 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[15];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(25);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Números Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.println("\nSucessores dos Números Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero + 1) + " ");
        }

    }

}
