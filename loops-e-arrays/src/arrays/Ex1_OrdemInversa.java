package arrays;

/*Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa. */

public class Ex1_OrdemInversa {
  public static void main(String[] args) {
    int[] vetor = {7, 12, 9, -5, 1};
    
    System.out.println("Vetor: ");
    for(int contador = 0; contador < (vetor.length); contador++){
      System.out.print(vetor[contador] + " ");
    }
    
    int count = (vetor.length-1);
    System.out.println("\nVetor Inverso: ");
    while(count >= 0) {
      System.out.println(vetor[count] + " ");
      count--;
    }
  }
}
