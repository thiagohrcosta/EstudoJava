package introducao;

import java.util.Scanner;

public class OperadoresIgualdadeRelacionais {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro qualquer");
		int numeroQualquer = sc.nextInt();
		
		if (numeroQualquer % 2 == 0) {
			System.out.println("O n�mero " + numeroQualquer + " � um n�mero par;");
		}
		else {
			System.out.println("O n�mero " + numeroQualquer + " � �mpar;");
		}

	}

}
