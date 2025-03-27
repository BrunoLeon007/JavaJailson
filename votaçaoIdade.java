package exerciciosJailson;

import java.util.Scanner;

public class votaçaoIdade {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		//ctrl shif + o para importar 
		System.out.println ("Digite sua idade, para confirmação se pode ou não votar:");
		int idade=sc.nextInt();
		
		if (idade<16){
			System.out.println("Você não esta autorizado a votar!:");
		
		}else if(idade <18) {
			System.out.println("Você esta autorizado a votar, mas não tem obrigatoriedade!:");
			
		}else {
			System.out.println("Você é obrigado a votar por obrigatoriedade!:");
		}
		
sc.close();
	}

}
