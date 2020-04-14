package introducao;

import java.text.DecimalFormat;

public class ExercicioFixacao3 {

	public static void main(String[] args) {
		// (Calculadora de crescimento demogr�fico mundial) Utilize a internet para descobrir a popula��o mundial atual e 
		// a taxa de crescimento demogr�fico mundial anual. Escreva um aplicativo que introduza esses valores e, ent�o, 
		// que exiba a popula��o mundial estimada depois de um, dois, tr�s, quatro e cinco anos

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
			
			System.out.println("A expectativa � que a popula��o mundial alcance em " + anoAtual + " o total de " + resultado + " bilh�es de habitantes.");
		}
		
		}
		
		
	}


