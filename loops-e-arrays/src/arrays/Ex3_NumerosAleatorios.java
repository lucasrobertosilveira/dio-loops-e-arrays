package arrays;

import java.util.Random;

/*Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final, mostre os números e seus sucessores. */

public class Ex3_NumerosAleatorios {
  public static void main(String[] args) {
    Random random = new Random();
    int[] numerosAleatorios = new int[20];

    int contador = 0;
    while(contador < numerosAleatorios.length) {
      int numero = random.nextInt(100);
      numerosAleatorios[contador] = numero;

      contador++;
    }

    System.out.println("Números Aleatórios: ");
    for (int numero : numerosAleatorios) {
      System.out.print(numero + " ");
    }

    System.out.println("\nSucessores números aleatórios: ");
    for (int numero : numerosAleatorios) {
      System.out.print((numero+1) + " ");
    }
  }
}
