package exercicios.loops.e.arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeio representando o nome do aluno e o segundo representando a idade.
(Pare o programa inserindo o valor "0" no campo nome.)
 */

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {
            System.out.println("Digite o Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;
            System.out.println("Digite a Idade: ");
            idade = scan.nextInt();
        }

        System.out.println("Você digitou o Zero e o programa foi finalizado.");

    }


}
