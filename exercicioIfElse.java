package exerciciosJailson;
import java.util.Scanner;

public class exercicioIfElse {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite sua Idade:");
		
		int idade = sc.nextInt();
		
		if  (idade<18){
			System.out.println("Não pode consumir bebida alcoólica:");
		}
		else if (idade>=18){
				System.out.println("Pode consumir bebida alcoólica");
				
			}
		}
		

	}


