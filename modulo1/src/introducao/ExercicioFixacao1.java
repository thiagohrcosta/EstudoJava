package introducao;

import java.util.Scanner;

public class ExercicioFixacao1 {

	//  Exercício 2.6: Product.Java
	// Calcula o produto de três inteiros.
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.print("Digite o primeiro inteiro para calcular o produto de três inteiros: ");
		num1 = sc.nextInt();
		System.out.print("Digite o segundo inteiro para calcular o produto de três inteiros: ");
		num2 = sc.nextInt();
		System.out.print("Digite o terceiro inteiro para calcular o produto de três inteiros: ");
		num3 = sc.nextInt();
		
		int calculoProduto = num1 * num2 * num3;
		
		System.out.println("O produto dos números " + num1 + ", " + num2 + ", " + num3 + " é :" + calculoProduto);

	}

}
