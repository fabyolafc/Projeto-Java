package cadastroUsuario;

import java.time.LocalDate;

public class Professor extends Funcionario {

	private String moduloQueLeciona;
	private int quantidadeTurmas;
	private String senha;
	
	public Professor(int id, String nome, String sobrenomesDoMeio, String ultimoSobrenome, String rg,
			LocalDate dataDeNascimento, String endereco, String celular, String email,String senha, double salario, String cpf,
			String cargoAtual, int tempoDeEmpresa, String moduloQueLeciona, int quantidadeTurmas) {
		super(id, nome, sobrenomesDoMeio, ultimoSobrenome, rg, dataDeNascimento, endereco, celular, email, salario, cpf,
				cargoAtual, tempoDeEmpresa);
		this.moduloQueLeciona = moduloQueLeciona;
		this.quantidadeTurmas = quantidadeTurmas;
		this.senha = senha;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getModuloQueLeciona() {
		return moduloQueLeciona;
	}

	public void setModuloQueLeciona(String moduloQueLeciona) {
		this.moduloQueLeciona = moduloQueLeciona;
	}

	public int getQuantidadeTurmas() {
		return quantidadeTurmas;
	}

	public void setQuantidadeTurmas(int quantidadeTurmas) {
		this.quantidadeTurmas = quantidadeTurmas;
	}
		
}
