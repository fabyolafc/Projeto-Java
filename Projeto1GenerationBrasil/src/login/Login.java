package login;

import java.util.List;

import cadastroUsuario.Aluno;
import cadastroUsuario.Professor;
import conteudo.ConteudoAluno;

public class Login {
	public boolean AutenticacaoAluno(String email, String senha,List<Aluno> turma ) {
		for ( Aluno aluno:turma) {
			if(aluno.getEmail()==email && aluno.getSenha()==senha) {
				return true;
			}
		}
		return false;
	}
	
	public void logarAluno(boolean autenticado) {
		if(autenticado) {
			//puxa o conteudo da classe conteudoAluno
			ConteudoAluno conteudo = new ConteudoAluno();
			conteudo.exibiMenu();
		}
		else {
			System.out.println("email ou senha inválidos");
		}
	}
	
	public boolean autenticacaoProfessor(String email, String senha,List<Professor> turma) {
		for ( Professor professor:turma) {
			if(professor.getEmail()==email && professor.getSenha()==senha) {
				return true;
			}
		}
		return false;
	}
}
