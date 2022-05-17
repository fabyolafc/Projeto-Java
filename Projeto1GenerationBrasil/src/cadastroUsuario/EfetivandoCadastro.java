package cadastroUsuario;

import java.util.List;
import java.util.Scanner;

public class EfetivandoCadastro {
	
	public void Cadastro(List<Aluno> listAlunos, List<Professor> listProfessor, List<Investidor> Investidor) {
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
		case 1:
			this.cadastroAluno(listAlunos);
			break;
		case 2:
			this.cadastroProfessor(listProfessor);
			break;
		}	
	}
	public void cadastroAluno(List<Aluno> alunos){
			Scanner input = new Scanner(System.in);
			System.out.println("\nVamos iniciar agora o cadastro do aluno.");
			System.out.println("\nInsira as informa��es solicitadas no cadastro.");
			int id, anoEscolar,idade;
			double mediaGeral_anoAnterior, mediaMatematica_anoAnterior,mediaMatematica_anoAtual,mediaGeral_anoAtual;
			String nome, sobrenomesDoMeio, ultimoSobrenome, rg, endereco, celular, email;
			int dataDeNascimento;
			String senha;
			System.out.println("\nId do aluno: ");
			id = input.nextInt();
			System.out.println("\nPrimeiro Nome: ");
			nome = input.next();
			System.out.println("\nSobrenome(s) do meio: ");
			sobrenomesDoMeio = input.next();
			System.out.println("\nÚltimo Sobrenome: ");
			ultimoSobrenome = input.next();
			System.out.println("");
			dataDeNascimento = input.nextInt();
			System.out.println("\nRG do aluno: ");
			rg = input.next();
			System.out.println("\nEndere�o: ");
			endereco = input.next();
			System.out.println("\nCelular: ");
			celular = input.next();
			System.out.println("\nE-mail: ");
			email = input.next();
			System.out.println("\nsenha:");
			senha = input.next();
			System.out.println("\nAno Escolar atual (exemplo: digite 6 para 6� ano = 5� s�rie ...): ");
			anoEscolar = input.nextInt();
			System.out.println("\nMédia Geral do aluno no ano passado: ");
			mediaGeral_anoAnterior = input.nextDouble();
			System.out.println("\nMédia de Matemática no ano passado: ");
			mediaMatematica_anoAnterior = input.nextDouble();
			System.out.println("\nM�dia Geral do aluno no ano passado: ");
			mediaGeral_anoAtual = input.nextDouble();
			System.out.println("\nM�dia de Matem�tica no ano passado: ");
			mediaMatematica_anoAtual = input.nextDouble();
			System.out.println("\nidade: ");
			idade = input.nextInt();
			
			Aluno aluno = new Aluno(id,nome,sobrenomesDoMeio, ultimoSobrenome, rg,
					dataDeNascimento,endereco, celular,email, senha, anoEscolar,
					mediaGeral_anoAnterior, mediaGeral_anoAtual, mediaMatematica_anoAnterior,
					 mediaMatematica_anoAtual,idade);
			alunos.add(aluno);
		}		
	
		public void cadastroProfessor(List<Professor> listProfessores) {
			Scanner input = new Scanner(System.in);
			int id,quantidadeTurmas,dataDeNascimento,idade;
			String nome,sobrenomesDoMeio,ultimoSobrenome, rg, endereco,celular,email,senha,cpf;
			double salario;
			
			System.out.println("\nId do professor: ");
			id = input.nextInt();
			System.out.println("\nPrimeiro Nome: ");
			nome = input.next();
			System.out.println("\nSobrenome(s) do meio: ");
			sobrenomesDoMeio = input.next();
			System.out.println("\n�ltimo Sobrenome: ");
			ultimoSobrenome = input.next();
			System.out.println("");
			dataDeNascimento = input.nextInt();
			System.out.println("\nRG do aluno: ");
			rg = input.next();
			System.out.println("\nCpf:");
			cpf = input.next();
			System.out.println("\nEndere�o: ");
			endereco = input.next();
			System.out.println("\nCelular: ");
			celular = input.next();
			System.out.println("\nE-mail: ");
			email = input.next();
			System.out.println("\nsenha:");
			senha = input.next();
			System.out.println("\nSalario:");
			salario = input.nextDouble();
			System.out.println("\nidade:");
			idade = input.nextInt();
			System.out.println("Quantidade de turmas:");
			quantidadeTurmas = input.nextInt();
			
			Professor professor = new Professor(id,nome,sobrenomesDoMeio,ultimoSobrenome, 
					rg,dataDeNascimento, endereco, celular, email, 
					idade,quantidadeTurmas,senha, salario, cpf);
			listProfessores.add(professor);
		}
	
		public void cadastrarInvestidor(List<Investidor> listInvestidor) {
			Scanner input = new Scanner(System.in);
			int id; 
			String nome,sobrenomesDoMeio,ultimoSobrenome,
			 email,cpf;
			 double quantiaDoada;
			 
			 System.out.println("\nId do professor: ");
				id = input.nextInt();
				System.out.println("\nPrimeiro Nome: ");
				nome = input.next();
				System.out.println("\nSobrenome(s) do meio: ");
				sobrenomesDoMeio = input.next();
				System.out.println("\n�ltimo Sobrenome: ");
				ultimoSobrenome = input.next();
				System.out.println("");
				System.out.println("\nCpf:");
				cpf = input.next();
				System.out.println("\nE-mail: ");
				email = input.next();
				System.out.println("Quanto você deseja doar: ");
				quantiaDoada = input.nextDouble();
				
				Investidor investidor = new Investidor(id,nome, sobrenomesDoMeio, ultimoSobrenome,
						email, cpf, quantiaDoada);
				listInvestidor.add(investidor);
		}
}
