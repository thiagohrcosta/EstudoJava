package introducao;
import java.util.Scanner;

public class Inteiros {

	public static void main(String[] args) {
		
		// Criar um Scanner para obter entrada a partir de um comando
		Scanner sc = new Scanner(System.in);
		
		int number1;
		int number2;
		int sum;
		
		System.out.print("Digite o primeiro inteiro:");
		number1 = sc.nextInt();
		
		System.out.print("Digite o segundo inteiro:");
		number2 = sc.nextInt();
		
		sum = number1 + number2;
		
		System.out.printf("O resultado da soma � %d%n ", sum);
		

		

	}

}
