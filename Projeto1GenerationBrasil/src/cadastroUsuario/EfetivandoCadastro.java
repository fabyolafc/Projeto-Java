package cadastroUsuario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import cadastroUsuario.Aluno;

public class EfetivandoCadastro {
	
	public static void main(String[] args) {
	
		System.out.println("Vamos iniciar o cadastro... "
				+ "\nQual a categoria que o cadastro atual se enquadra ?\n");
		System.out.println("1 - Aluno"
							+ "\n2 - Professor"
							+ "\n3 - Investidor");
		System.out.println("\nDigite a opção desejada: ");
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int opcao;
		opcao = input.nextInt();
		
		switch (opcao) {
		case 1: {
			System.out.println("\nVamos iniciar agora o cadastro do aluno.");
			System.out.println("\nInsira as informações solicitadas no cadastro.");
			int id, anoEscolar;
			double mediaGeral_anoAnterior, mediaMatematica_anoAnterior;
			String nome, sobrenomesDoMeio, ultimoSobrenome, rg, endereco, celular, email;
			LocalDate dataDeNascimento;
			System.out.println("\nId do aluno: ");
			id = input.nextInt();
			System.out.println("\nPrimeiro Nome: ");
			nome = input.next();
			System.out.println("\nSobrenome(s) do meio: ");
			sobrenomesDoMeio = input.next();
			System.out.println("\nÚltimo Sobrenome: ");
			ultimoSobrenome = input.next();
			System.out.println("");
			LocalDate datadeNascimento = dateInput(stringInput("\nData de Nascimento: "));
			System.out.println("\nRG do aluno: ");
			rg = input.next();
			System.out.println("\nEndereço: ");
			rg = input.next();
			System.out.println("\nCelular: ");
			rg = input.next();
			System.out.println("\nE-mail: ");
			email = input.next();
			System.out.println("\nAno Escolar atual (exemplo: digite 6 para 6º ano = 5ª série ...): ");
			anoEscolar = input.nextInt();
			System.out.println("\nMédia Geral do aluno no ano passado: ");
			mediaGeral_anoAnterior = input.nextDouble();
			System.out.println("\nMédia de Matemática no ano passado: ");
			mediaMatematica_anoAnterior = input.nextDouble();
			public Aluno(int id, String nome, String sobrenomesDoMeio, String ultimoSobrenome, String rg,
					LocalDate dataDeNascimento, String endereco, String celular, String email, int anoEscolar,
					double mediaGeral_anoAnterior, double mediaMatematica_anoAnterior) {
				super(id, nome, sobrenomesDoMeio, ultimoSobrenome, rg, dataDeNascimento, endereco, celular, email);
				this.anoEscolar = anoEscolar;
				this.mediaGeral_anoAnterior = mediaGeral_anoAnterior;
				this.mediaMatematica_anoAnterior = mediaMatematica_anoAnterior;
			}
			

			
			
			
		}
		case 2:{
			
		}
		case 3:{
			
		}
		default:{
			//throw new IllegalArgumentException("Unexpected value: " + key);
		}
		}
		
		public static LocalDate dateInput(String userInput) {

		   
		}
				
	}

	private static LocalDate dateInput(Object stringInput) {
		 DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
		    LocalDate date = LocalDate.parse(userInput, dateFormat);


		    System.out.println(date);
		    return date ;
	}

}
