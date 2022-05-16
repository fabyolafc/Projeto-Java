package Conteudo;

import java.util.Scanner;

public class ConteudoAluno {

	
		Scanner leia = new Scanner(System.in);
		int op;
		public void exibiMenu () {
			System.out.println("\t\tEscolha uma op��o!");
			System.out.println("\n1-Exibir conte�do...");
			System.out.println("\n2-Exibir Quiz...");
			op=leia.nextInt();
			
			if(op==1) 
			{
				System.out.println("\tOl�! Seja bem vinde a nossa plataforma.");
				System.out.println("\nVoc� sabe o que � Java?");
				System.out.println("Java � uma linguagem de programa��o e plataforma computacional lan�ada pela primeira vez pela Sun Microsystems em 1995. \n"
						+ "De laptops a datacenters, consoles de games a supercomputadores cient�ficos, telefones celulares � Internet, o Java est� em todos os lugares!");
				System.out.println("\nO que s�o vari�veis?");
				System.out.println("As vari�veis s�o posi��es na mem�ria do computador que podem armazenar dados."
						+ "\nAlguns tipos de vari�veis: \nString = Permite voc� armazenar qualquer tipo de caracteres seja numero ou texto. "
						+ "\nint = Permite voc� armazenar s� n�meros do tipo inteiro. "
						+ "\nfloat = Armazena n�meros com ponto flutuante (reais) com precis�o simples. "
						+ "\ndouble = Armazena n�meros com ponto flutuante, com precis�o dupla, ou seja possui o dobro da capacidade de uma vari�vel do tipo float.");
				System.out.println("\nO que s�o operadores?");
				System.out.println("Operador em java � um s�mbolo que � usado para executar opera��es. Por exemplo: +, -, *, / "
						+ "\nPara somar usamos o operador de + "
						+ "\nPara subtrair usamos o operador de - "
						+ "\nPara multiplicar usamos o operador de * "
						+ "\nPara dividir usamos o operador de / ");
				System.out.println("\nPara exibir uma mensagem na tela usamos o comando 'System.out.println'.");
			}else if (op==2)
			{
				System.out.println("\n\n\tAgora � hora de colocar tudo que aprendeu em pr�tica! Responda o QUIZ.");
				
				do
				{
					System.out.println("\n1-Qual � a sintaxe correta para gerar 'Hello World' em Java?");
					System.out.println("\n[1]System.out.println('Hello world');");
					System.out.println("\n[2]print('Hello world');");
					System.out.println("\n[3]System('Hello world');");
					System.out.println("\n[4]out('Hello world');");
					
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
					System.out.println("\n2-Qual tipo de dados � usado para criar uma vari�vel que deve armazenar texto?");
					System.out.println("\n[1]string");
					System.out.println("\n[2]myString");
					System.out.println("\n[3]String");
					System.out.println("\n[4]Txt");
					
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
					System.out.println("\n3-Qual tipo de dados � usado para criar uma vari�vel que deve armazenar n�mero do tipo inteiro?");
					System.out.println("\n[1]double");
					System.out.println("\n[2]float");
					System.out.println("\n[3]String");
					System.out.println("\n[4]int");
					
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
					System.out.println("\n4-Qual operador pode ser usado para somar dois valores?");
					System.out.println("\n[1]Sinal de *");
					System.out.println("\n[2]Sinal de +");
					System.out.println("\n[3]Sinal de -");
					System.out.println("\n[4]Sinal de /");
					
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
					System.out.println("\n5-Qual operador pode ser usado para subtrair dois valores?");
					System.out.println("\n[1]Sinal de *");
					System.out.println("\n[2]Sinal de +");
					System.out.println("\n[3]Sinal de -");
					System.out.println("\n[4]Sinal de /");
					
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
				System.out.println("Op��o inv�lida!!!");
			}			
			
		}			

}
