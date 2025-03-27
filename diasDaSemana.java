package exerciciosJailson;

import java.util.Scanner;

public class diasDaSemana {

	public static void main(String[] args) {
		
Scanner sc= new Scanner(System.in);

System.out.println("Digite um numero correspondente ao dia da semana:");

int diadaSemana = sc.nextInt();

if(diadaSemana==1) {
	System.out.println("Domingo");
}else if(diadaSemana ==2) {
	System.out.println("Segunda Feira");
	
}else if(diadaSemana ==3) {
	System.out.println("Terça Feira");
	
}else if(diadaSemana ==4) {
	System.out.println("Quarta Feira");
	
}else if(diadaSemana ==5) {
	System.out.println("Quinta Feira");
	
}else if(diadaSemana ==6) {
	System.out.println("Sexta Feira");
	
}else if(diadaSemana ==7) {
	System.out.println("Sabado");
	
}else {
	System.out.println("Não ha dia correspondente a este numero:");
}
}
	}


