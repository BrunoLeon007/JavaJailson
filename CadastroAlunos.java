package exerciciosJailson;
import java.util.Scanner;

public class CadastroAlunos {
	

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println ("Digite seu primeiro nome");
		String nomeAluno = sc.nextLine();
		
		System.out.println ("Digite seu sobrenome");
		String sobrenomeAluno = sc.nextLine();
		
		System.out.println ("Digite idade do aluno");
		int idadeAluno = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println ("Digite seu periodo de estudo:");
		String periodoAluno = sc.nextLine();
		
		System.out.println ("Digite a turma que esta matriculado:");
		String turmaAluno = sc.nextLine();
		
		System.out.println ("Digite o CPF do aluno:");
		String cpfAluno = sc.nextLine();
		
		System.out.println ("Digite seu logradouro:");
		String logradouroAluno = sc.nextLine();
				
		System.out.println ("Digite seu CEP:");
		String cepAluno = sc.next();
		
		System.out.println ("Digite o seu telefone sem DDD:");
		String telefoneAluno = sc.next();
		
		System.out.println ("Digite o seu RG:");
		String rgAluno = sc.next();
		
		System.out.println("O nome do aluno é:" + nomeAluno);
		System.out.println("A sobrenome do aluno é:" + sobrenomeAluno);
		System.out.println("A idade do aluno é:" + idadeAluno);
		System.out.println("O periodo de estudo do aluno é:" + periodoAluno);
		System.out.println("A turma do aluno é:" + turmaAluno);
		System.out.println("O CPF do aluno é:" + cpfAluno);
		System.out.println("O logradouro do aluno é:" + logradouroAluno);
		System.out.println("O Cep do aluno é:" + cepAluno);
		System.out.println("O telefone do aluno é:" +telefoneAluno);
		System.out.println("O RG do aluno é:" + rgAluno);
		
		sc.close();
		

	
	}

}
