package PaginaProfessor;

import java.text.NumberFormat;
import java.util.List;
import java.util.Scanner;
import cadastroUsuario.*;


public class AcessoProfessor extends Professor {

	Scanner leia = new Scanner(System.in);

	public AcessoProfessor(int id, String nome, String sobrenomesDoMeio, String ultimoSobrenome, String rg,
			int anoDeNascimento, String endereco, String celular, String email, int idade, int quantidadeTurmas,
			String senha, double salario, String cpf) {
		super(id, nome, sobrenomesDoMeio, ultimoSobrenome, rg, anoDeNascimento, endereco, celular, email, idade,
				quantidadeTurmas, senha, salario, cpf);
	}

	private int op;
	private int cont = 1;
	
	public void ListaDeAlunos (List<Aluno> turma) {
		for (Aluno aluno: turma) {
			System.out.println("\n" + cont + " - " + aluno.getNome() + " " + 
		aluno.getSobrenomesDoMeio() + " " + aluno.getUltimoSobrenome() + 
		" - Email: " + aluno.getEmail() );
			cont++;
		}
		
	}
	
	public void ControleDosAlunos (List<Aluno> turma) {
		for (Aluno aluno: turma) {
			System.out.println("\n" + cont + " - " + aluno.getNome() + " " + 
					aluno.getSobrenomesDoMeio() + " " + aluno.getUltimoSobrenome());
			System.out.println("\n\tMédia anterior: " + aluno.getMediaGeral_anoAnterior()
					+ "\n\tMédia atual: ");
			cont++;
		}
		
	}

	public void inicio (List<Aluno> turma) {
			
			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMinimumFractionDigits(2);
			
			do {
				System.out.println("\nSeja Bem vindo " + getNome() + getSobrenomesDoMeio() + getUltimoSobrenome());
				System.out.println("\nEscolha uma opção:");
				System.out.println("\n1 - Ver suas informações.");
				System.out.println("\n2 - Ver a quantidade de turmas.");
				System.out.println("\n3 - Seus alunos.");
				System.out.println("\n4 - Acompanhamento dos alunos.");
				System.out.println("\n5 - Sair");
				op = leia.nextInt();
				switch (op){
				case 1: 
					System.out.println("\nID: " + getId());
					System.out.println("\nNome: " + getNome() + " " + getSobrenomesDoMeio() + " " + getUltimoSobrenome());
					System.out.println("\nRG: " + getRg());
					System.out.println("\nAno de Nascimento: " + getAnoDeNascimento());
					System.out.println("\nEndereço: " + getEndereco());
					System.out.println("\nTelefone: " + getCelular());
					System.out.println("\nEmail: " + getEmail());
					System.out.println("\nIdade: " + getIdade());
					System.out.println("\nQuantidade de turmas é: " + getQuantidadeTurmas());
					System.out.println("\nSenha: " + getSenha());
					System.out.println("\nSalario: " + nf.format(getSalario()));
					System.out.println("\nCPF: " + getCpf());
					break;
				case 2:
					System.out.println("\nO total de turmas é: " + getQuantidadeTurmas() );
					break;
				case 3:
					System.out.println("\nSeus alunos são: " );
					ListaDeAlunos (turma);
					break;
				case 4:
					System.out.println("\nProgressão dos alunos:");
					ControleDosAlunos(turma);
					break;
				case 5:
					System.out.println("\nObrigado por fazer parte desse projeto!");
					break;
				default:
					System.out.println("\nOpção inválida, escolha uma das 5 opções mencionadas.");
				}
			}while (op != 5);
	}
	
	
}
