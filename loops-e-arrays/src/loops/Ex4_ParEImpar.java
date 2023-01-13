package loops;

import java.util.Scanner;

/*Faça um programa que peça N números inteiros.
Calcule e mostre a quantidade de números pares e
a quantidade de números impares. */

public class Ex4_ParEImpar {
  public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);

   int quantidadeNumeros;
   int numero;
   int quantidadePares = 0;
   int quantidadeImpares = 0;

   System.out.println("Informe a quantidade de números: ");
   quantidadeNumeros = scan.nextInt();

   int contador = 0;
   do {
    System.out.println("Digite o número: ");
    numero = scan.nextInt();

    if (numero % 2 == 0){
      quantidadePares++;
    } else {
      quantidadeImpares++;
    }

    contador++;
   } while (contador < quantidadeNumeros);

   System.out.println("Quantidade de números par: " + quantidadePares);
   System.out.println("Quantidade de números impar: " + quantidadeImpares);
  }
}
