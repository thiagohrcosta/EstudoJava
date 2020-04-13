package introducao;

import java.util.Scanner;

public class ExercicioFixacao2 {

		// (Calculadora de �ndice de massa corporal) Introduzimos a calculadora de �ndice de massa corporal (IMC)
		// no Exerc�cio 1.10. As f�rmulas para calcular o IMC s�o
		// peso / altura * altura;
		// Valores: Underweight: less than 18.5
		//			Normal: between 18.5 and 24.9
		//			Overweight: between 25 and 29.9
		//			Obese: 30 or greater
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int peso, altura;
		
		System.out.println("Digite o seu peso (valor inteiro):");
		peso = sc.nextInt();
		
		System.out.println("Digite a sua altura (valor inteiro em cent�metros):");
		altura = sc.nextInt();
		
		int calculoImc = peso / (( altura * altura)/ 10000);
		
		System.out.println(calculoImc);
		if (calculoImc < 18.5) {
			System.out.println("Abaixo do peso");
		}
		else if (calculoImc >= 18.5 && calculoImc <= 24.9) {
			System.out.println("Peso normal");
		}
		else if (calculoImc >= 25 && calculoImc <= 29.9) {
			System.out.println("Acima do peso");
		}
		else {
			System.out.println("Obeso");
		}
		
		
		

	}

}
