package Conteudo;

import java.util.Scanner;

public class ConteudoAluno {

	
		Scanner leia = new Scanner(System.in);
		int op;
		public void exibiMenu () {
			System.out.println("\t\tEscolha uma opção!");
			System.out.println("\n1 - Exibir conteúdo...");
			System.out.println("\n2 - Exibir Quiz...");
			op=leia.nextInt();
			
			if(op==1) 
			{
				System.out.println("\tOlá! Seja bem vinde a nossa plataforma.");
				System.out.println("\nVocê sabe o que é Java?");
				System.out.println("Java é uma linguagem de programação e plataforma computacional lançada pela primeira vez pela Sun Microsystems em 1995. \n"
						+ "De laptops a datacenters, consoles de games a supercomputadores científicos, telefones celulares e Internet, o Java está em todos os lugares!");
				System.out.println("\nO que são variáveis?");
				System.out.println("As variáveis são posições na memória do computador que podem armazenar dados."
						+ "\nAlguns tipos de variáveis: \nString = Permite você armazenar qualquer tipo de caracteres seja número ou texto. "
						+ "\nint = Permite você armazenar só números do tipo inteiro. "
						+ "\nfloat = Armazena números com ponto flutuante (reais) com precisão simples. "
						+ "\ndouble = Armazena números com ponto flutuante, com precisão dupla, ou seja possui o dobro da capacidade de uma variável do tipo float.");
				System.out.println("\nO que são operadores?");
				System.out.println("Operador em java é um símbolo que é usado para executar operadores. Por exemplo: +, -, *, / "
						+ "\nPara somar usamos o operador de + "
						+ "\nPara subtrair usamos o operador de - "
						+ "\nPara multiplicar usamos o operador de * "
						+ "\nPara dividir usamos o operador de / ");
				System.out.println("\nPara exibir uma mensagem na tela usamos o comando 'System.out.println'.");
			}else if (op==2)
			{
				System.out.println("\n\n\tAgora é hora de colocar tudo que aprendeu em prática! Responda o QUIZ.");
				
				do
				{
					System.out.println("\n1 - Qual é a sintaxe correta para gerar 'Hello World' em Java?");
					System.out.println("\n[1] System.out.println('Hello world');");
					System.out.println("\n[2] print('Hello world');");
					System.out.println("\n[3] System('Hello world');");
					System.out.println("\n[4] out('Hello world');");
					
					System.out.println("\nDigite sua resposta: ");
					op=leia.nextInt();
					
					if (op==1)
					{
						System.out.println("Resposta correta! ");
					}else {
						System.out.println("Resposta errada! Tente novamente ");
					}
					
				} while(op!=1);
				
				do
				{
					System.out.println("\n2 - Qual tipo de dados é usado para criar uma variável que deve armazenar texto?");
					System.out.println("\n[1] string");
					System.out.println("\n[2] myString");
					System.out.println("\n[3] String");
					System.out.println("\n[4] Txt");
					
					System.out.println("\nDigite sua resposta: ");
					op=leia.nextInt();
					
					if (op==3)
					{
						System.out.println("Resposta correta! ");
					}else {
						System.out.println("Resposta errada! Tente novamente ");
					}
					
				} while(op!=3);
				
				do
				{
					System.out.println("\n3 - Qual tipo de dados é usado para criar uma variável que deve armazenar número do tipo inteiro?");
					System.out.println("\n[1] double");
					System.out.println("\n[2] float");
					System.out.println("\n[3] String");
					System.out.println("\n[4] int");
					
					System.out.println("\nDigite sua resposta: ");
					op=leia.nextInt();
					
					if (op==4)
					{
						System.out.println("Resposta correta! ");
					}else {
						System.out.println("Resposta errada! Tente novamente ");
					}
					
				} while(op!=4);

				
				do
				{
					System.out.println("\n4 - Qual operador pode ser usado para somar dois valores?");
					System.out.println("\n[1] Sinal de *");
					System.out.println("\n[2] Sinal de +");
					System.out.println("\n[3] Sinal de -");
					System.out.println("\n[4] Sinal de /");
					
					System.out.println("\nDigite sua resposta: ");
					op=leia.nextInt();
					
					if (op==2)
					{
						System.out.println("Resposta correta! ");
					}else {
						System.out.println("Resposta errada! Tente novamente ");
					}
					
				} while(op!=2);
				
				do
				{
					System.out.println("\n5 - Qual operador pode ser usado para subtrair dois valores?");
					System.out.println("\n[1] Sinal de *");
					System.out.println("\n[2] Sinal de +");
					System.out.println("\n[3] Sinal de -");
					System.out.println("\n[4] Sinal de /");
					
					System.out.println("\nDigite sua resposta: ");
					op=leia.nextInt();
					
					if (op==3)
					{
						System.out.println("Resposta correta! ");
					}else {
						System.out.println("Resposta errada! Tente novamente ");
					}
					
				} while(op!=3);
				
				System.out.println("\n\t\tObrigado(a) por participar!");
			}else 
			{
				System.out.println("Opção inválida!!!");
			}			
			
		}			

}
