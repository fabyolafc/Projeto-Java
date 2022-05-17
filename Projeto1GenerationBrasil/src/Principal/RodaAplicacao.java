package Principal;

import java.util.Scanner;
import Conteudo.*;
import exibicao.*;


public class RodaAplicacao {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
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
					break;		
				case 2:
					ilustracoes.ilustracaoLogin();
					break;					
				case 3:
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nAguarde...\nEncerrando o programa...");
					System.out.println("\n\nPrograma Encerrado !");
					break;
				default:
					System.out.println("Opção inválida. Escolha a opção 1 ou 2.");
					break;
			}
		} while(opcao != 1 && opcao != 2 && opcao != 3);
		
	}
	
}