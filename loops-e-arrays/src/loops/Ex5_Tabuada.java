package loops;

import java.util.Scanner;

/*Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50 */

public class Ex5_Tabuada {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite qual tabuada deseja ver: ");
    int tabuada = scan.nextInt();

    System.out.println("Tabuada de " + tabuada);

    for(int contador = 1; contador <= 10; contador++) {
      System.out.println(tabuada + " x " + contador + " = " + (tabuada*contador));
    }
  }
}
