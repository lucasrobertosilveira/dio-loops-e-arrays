package loops;

import java.util.Scanner;

/*Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120 */

public class Ex6_Fatorial {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Fatorial de: ");
    int fatorial = scan.nextInt();

    int multiplicacao = 1;

    System.out.println(fatorial + "! = ");
    for(int contador = fatorial; contador >= 1; contador--) {
      multiplicacao*= contador;
    }

    System.out.println(multiplicacao);

  }
}
