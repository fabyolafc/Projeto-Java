package Principal;

import java.util.*;
import Conteudo.*;
import cadastroUsuario.*;
import exibicao.*;
import login.*;

public class RodaAplicacao {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList();
		List<Professor> professores = new ArrayList();
		List<Investidor> investidores = new ArrayList();
		
		Introducao Introducao = new Introducao();
		Introducao.TextoIntroducao();
		String start;
		Scanner input = new Scanner(System.in);		
		
		do {			
			start = input.next();							
		} while(!start.equalsIgnoreCase("START"));
		
		System.out.println("\n\n\n\n\nO que você gostaria de fazer agora ?"
				+ "\n\nDigite 1 para Cadastro"
				+ "\nDigite 2 para Login"
				+ "\nDigite 3 caso queira encerrar o programa\n\n");
		System.out.println("Digite a opção que deseja: ");
		int opcao;				
		Ilustracoes ilustracoes = new Ilustracoes();
		
		do {
			opcao = input.nextInt();
			switch (opcao) {
				case 1: 		
					ilustracoes.ilustracaoCadastro();
					System.out.println("\n\n\n\n\nQuem será cadastrade ?"
							+ "\n\n1 - Professore"
							+ "\n2 - Alune"
							+ "\n3 - Investidore\n\n");
					System.out.println("Digite a opção que deseja: ");
					EfetivandoCadastro Cadastro = new EfetivandoCadastro();
					do {
						opcao = input.nextInt();
						switch (opcao) {
							case 1: 		
								System.out.println("\n\nCadastrando professore...\n\n");								
								Cadastro.cadastroProfessor(professores);
								System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
										+ "Professore cadastrado com sucesso !");
								break;		
							case 2:
								System.out.println("\n\nCadastrando alune...\n\n");								
								Cadastro.cadastroAluno(alunos);
								System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
										+ "Alune cadastrado com sucesso !");
								break;					
							case 3:
								System.out.println("\n\nCadastrando investidore...\n\n");								
								Cadastro.cadastrarInvestidor(investidores);
								System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
										+ "Investidore cadastrado com sucesso !"
										+ "\nMuito obrigado pela doação !"
										+ "\nSua contribuição transforma a Educação.");
			
								break;								
							default:
								System.out.println("Opção inválida. Escolha a opção 1, 2 ou 3.");
								break;
						}
					} while(opcao != 1 && opcao != 2 && opcao != 3);						
				case 2:
					ilustracoes.ilustracaoLogin();
					System.out.println("\n\n\n\n\nQuem irá logar ?"
							+ "\n\n1 - Professore"
							+ "\n2 - Alune"
							+ "\n3 - Investidore\n\n");	
					System.out.println("Digite a opção que deseja: ");
					Login login = new Login();
					do {
						opcao = input.nextInt();
						switch (opcao) {
							case 1: 		
								System.out.println("\n\nLogando professore...\n\n");							
								break;		
							case 2:
								System.out.println("\n\nLogando alune...\n\n");
								for (Aluno i : alunos) {
									System.out.println("Email: " + i.getEmail() + "\nSenha: " + i.getSenha());
								}
								String email, senha;
								System.out.println("Digite o seu e-mail: ");
								email = input.next();
								System.out.println("\nDigite a sua senha: ");	
								senha = input.next();
								boolean autenticacao = login.AutenticacaoAluno(email, senha, alunos);
								login.logarAluno(autenticacao);
								break;					
							case 3:
								System.out.println("\n\nLogando investidore...\n\n");								
								break;								
							default:
								System.out.println("Opção inválida. Escolha a opção 1, 2 ou 3.");
								break;
						}
					} while(opcao != 1 && opcao != 2 && opcao != 3);
					break;					
				case 3:
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nAguarde...\nEncerrando o programa...");
					System.out.println("\n\nPrograma Encerrado !");
					break;
				default:
					System.out.println("Opção inválida. Escolha a opção 1, 2 ou 3.");
					break;
			}
		} while(opcao != 1 && opcao != 2 && opcao != 3);
		
	}
	
}
