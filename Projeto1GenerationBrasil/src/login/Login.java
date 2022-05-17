package login;

import java.util.List;

import cadastroUsuario.Aluno;
import cadastroUsuario.Professor;
import cadastroUsuario.Investidor;
import Conteudo.ConteudoAluno;
import PaginaProfessor.AcessoProfessor;

public class Login {
	public boolean AutenticacaoAluno(String email, String senha,List<Aluno> turma ) {
		for ( Aluno aluno:turma) {
			if(aluno.getEmail().equals(email) && aluno.getSenha().equals(senha)) {
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
			System.out.println("email ou senha inv�lidos");
		}
	}
	
	public Professor autenticacaoProfessor(String email, String senha,List<Professor> turma) {
		for ( Professor professor:turma) {
			if(professor.getEmail().equals(email) && professor.getSenha().equals(senha)) {
				return professor;
			}
		}
		return null;
	}
	
	public void logarProfessor(Professor professor) {
		if(professor!=null) {
	
			int id,quantidadeTurmas,anoDeNascimento,idade;
			String nome,sobrenomesDoMeio,ultimoSobrenome, rg, endereco,celular,email,senha,cpf;
			double salario;
			id = professor.getId();
			quantidadeTurmas = professor.getQuantidadeTurmas();
			anoDeNascimento = professor.getAnoDeNascimento();
			idade = professor.getIdade();
			nome = professor.getNome();
			sobrenomesDoMeio = professor.getSobrenomesDoMeio();
			ultimoSobrenome= professor.getUltimoSobrenome();
			rg = professor.getRg();
			endereco = professor.getEndereco();
			celular = professor.getCelular();
			email = professor.getEmail();
			senha = professor.getSenha();
			cpf = professor.getCpf();
			salario = professor.getSalario();
			
			AcessoProfessor pagina = new AcessoProfessor(id,nome, sobrenomesDoMeio, ultimoSobrenome, rg,
					anoDeNascimento, endereco,  celular, email, idade,  quantidadeTurmas,
					 senha, salario, cpf);
			pagina.inicio();
		}
		else {
			System.out.println("email ou senha inv�lidos");
		}
	}
		public Investidor autenticacaoInvestidor(String email, String senha,List<Investidor> investidores) {
			for ( Investidor investidor:investidores) {
				if(investidor.getEmail().equals(email) && investidor.getSenha().equals(senha)) {
					 professor;
				}
			}
			return null;
		}
}
