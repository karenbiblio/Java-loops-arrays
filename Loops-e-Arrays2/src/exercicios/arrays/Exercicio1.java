package exercicios.arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
 */

public class Exercicio1 {
    public static void main(String[] args) {

        int[] vetor = {3, 5, 14, 17, 25, 9};
        //Ele guarda os dados na posição que foram inseridos para sempre.

        System.out.println(vetor);
        //Ele mostra a posição do vetor na memória da máquina e não os elementos do array.

        System.out.println(vetor.length);
        //Aqui ele imprime o número de elementos que cabe nesse vetor. length significa tamanho.

        int count = 0;

        System.out.println("Vetor na posição normal: ");

        while(count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.println("\nVetor na posição inversa: ");

        for (int i = (vetor.length-1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");

        }

    }


}
