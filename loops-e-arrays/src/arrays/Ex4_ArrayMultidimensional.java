package arrays;

import java.util.Random;

/* Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
Após isso determine o menor número da matriz e a sua posição(linha, coluna). */

public class Ex4_ArrayMultidimensional {
  public static void main(String[] args) {
    Random random = new Random();
    int[][] M = new int[4][4];

    for(int linha = 0; linha < M.length; linha++) {
      for(int coluna = 0; coluna < M[linha].length; coluna++){
        M[linha][coluna] = random.nextInt(9);
      }
    }

    System.out.println("Matriz: ");
    for (int[] elementoLinha : M) {
      for (int elementoColuna : elementoLinha) {
        System.out.print(elementoColuna + " ");
      }   
      System.out.println();
    }
  }
}
