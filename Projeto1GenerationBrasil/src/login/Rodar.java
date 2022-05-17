package login;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import login.Login;

import cadastroUsuario.Professor;

public class Rodar {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		List<Professor> professores = new ArrayList();
		
		Professor carlos = new Professor(1, "Carlos", "João", " da Silva", 
				"102344",1995, "Rua Machado", "948758347", "carlos@gmail.com", 
				27, 2, "1234", 3500.00, "123.654.789-34");
		
		professores.add(carlos);
		System.out.println(professores);
		System.out.println("Qual o seu email?");
		String email = ler.next();
		System.out.println("Digite sua senha:");
		String senha = ler.next();
		Login login = new Login();
		Professor autenticado = login.autenticacaoProfessor(email,senha, professores);
		login.logarProfessor(autenticado);
		
	}

}
