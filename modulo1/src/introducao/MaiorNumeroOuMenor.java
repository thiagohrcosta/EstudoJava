package introducao;

import java.util.Scanner;

public class MaiorNumeroOuMenor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero inteiro:");
		int num1 = sc.nextInt();
		
		System.out.println("Voc� digitou o n�mero " + num1 + " .");
		System.out.print("Agora digite um segundo n�mero inteiro para efetuar a compara��o:");
		int num2 = sc.nextInt();
		
		if (num1 < num2) {
			System.out.println("O n�mero " + num1 + " � menor que " + num2 + " .");
		}
		else if (num1 == num2) {
			System.out.println("Ambos os n�meros s�o iguais. Voc� digitou para as duas op��es o n�mero " + num1 + " .");
		}
		else {
			System.out.println("O n�mero " + num2 + " � menor que " + num1 + " .");
		}
	}

}
