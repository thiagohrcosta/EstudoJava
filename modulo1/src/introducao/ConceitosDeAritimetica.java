package introducao;

import java.util.Scanner;

public class ConceitosDeAritimetica {

	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Adi��o + ;
		// Subtra��o - ;
		// Multiplica��o * ;
		// Divis�o / ;
		// Resto % ;
		
		int numA = 10;
		int numB = 2;
		int numC = 5;
		
		int number1, number2, number3;
		
		int multiplicacao = numA * numB;
		int divisao = numA / numB;
		int soma = numA + numB;
		int subtracao = numA - numB;
		int resto = numA % numB;
		
		int aritimetica1 = ((numA + numB) * numC);
		
		System.out.println("Valor A = 10; Valor B = 2");
		System.out.println(" O resultado da multiplicacao � : " + multiplicacao);
		System.out.println(" O resultado da divisao � : " + divisao);
		System.out.println(" O resultado da soma � : " + soma);
		System.out.println(" O resultado da subtracao � : " + subtracao);
		System.out.println(" O resultado do resto � : " + resto);
		System.out.println(" ==================================== ");
		System.out.println(" ====== Express�es Aritim�ticas =====");
		System.out.println("O resultado de ((numA = 10 + numB = 2 ) * numC = 5) � : " + aritimetica1 );
		
		

	}

}
