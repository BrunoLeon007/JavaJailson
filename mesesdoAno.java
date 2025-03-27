package exerciciosJailson;

import java.util.Scanner;

public class mesesdoAno {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);

		System.out.println("Digite um numero correspondente aos meses do ano:");

		int diadaSemana = sc.nextInt();

		if(diadaSemana==1) {
			System.out.println("Janeiro");
		}else if(diadaSemana ==2) {
			System.out.println("Fevereiro");
			
		}else if(diadaSemana ==3) {
			System.out.println("Março");
			
		}else if(diadaSemana ==4) {
			System.out.println("Abril");
			
		}else if(diadaSemana ==5) {
			System.out.println("Maio");
			
		}else if(diadaSemana ==6) {
			System.out.println("Junho");
			
		}else if(diadaSemana ==7) {
			System.out.println("Julho");
			
		}else if(diadaSemana ==8) {
			System.out.println("Agosto");
			
		}else if(diadaSemana ==9) {
			System.out.println("Setembro");
			
		}else if(diadaSemana ==10) {
			System.out.println("Outubro");
			
		}else if(diadaSemana ==11) {
			System.out.println("Novembro");
			
		}else if(diadaSemana ==12) {
			System.out.println("Dezembro");
		}else {
			System.out.println("Não há dia correspondente a esta numeração:");
		}
sc.close();
}
}
