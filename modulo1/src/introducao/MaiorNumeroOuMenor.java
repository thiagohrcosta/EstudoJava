package introducao;

import java.util.Scanner;

public class MaiorNumeroOuMenor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número inteiro:");
		int num1 = sc.nextInt();
		
		System.out.println("Você digitou o número " + num1 + " .");
		System.out.print("Agora digite um segundo número inteiro para efetuar a comparação:");
		int num2 = sc.nextInt();
		
		if (num1 < num2) {
			System.out.println("O número " + num1 + " é menor que " + num2 + " .");
		}
		else if (num1 == num2) {
			System.out.println("Ambos os números são iguais. Você digitou para as duas opções o número " + num1 + " .");
		}
		else {
			System.out.println("O número " + num2 + " é menor que " + num1 + " .");
		}
	}

}
