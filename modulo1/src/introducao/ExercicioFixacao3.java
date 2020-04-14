package introducao;

import java.text.DecimalFormat;

public class ExercicioFixacao3 {

	public static void main(String[] args) {
		// (Calculadora de crescimento demográfico mundial) Utilize a internet para descobrir a população mundial atual e 
		// a taxa de crescimento demográfico mundial anual. Escreva um aplicativo que introduza esses valores e, então, 
		// que exiba a população mundial estimada depois de um, dois, três, quatro e cinco anos

		DecimalFormat f = new DecimalFormat("##");


		double taxaCrescimento = 0.11;
		double popMundial = 7.7;
		
		double ano;
		
		int anoAtual = 2020;
		
		for (ano = 1; ano <= 5; ano++) {
			double expectativaMundial = (popMundial * taxaCrescimento) * 10;
			popMundial = expectativaMundial;
			String resultado = String.format("%.2f", expectativaMundial);

			anoAtual = anoAtual + 1;
			
			System.out.println("A expectativa é que a população mundial alcance em " + anoAtual + " o total de " + resultado + " bilhões de habitantes.");
		}
		
		}
		
		
	}


