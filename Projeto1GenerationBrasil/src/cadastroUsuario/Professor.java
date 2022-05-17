package cadastroUsuario;

public class Professor extends Pessoa {

	private int quantidadeTurmas;
	private String senha;
	private double salario;
	private String cpf;
	
	public Professor (int id, String nome, String sobrenomesDoMeio, String ultimoSobrenome, 
			String rg, int anoDeNascimento, String endereco, String celular, String email, 
			int idade, int quantidadeTurmas, String senha, double salario, String cpf) {
		super(id, nome, sobrenomesDoMeio, ultimoSobrenome, rg, anoDeNascimento, endereco, 
				celular, email);
		this.quantidadeTurmas = quantidadeTurmas;
		this.senha = senha;
		this.salario = salario;
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getQuantidadeTurmas() {
		return quantidadeTurmas;
	}

	public void setQuantidadeTurmas(int quantidadeTurmas) {
		this.quantidadeTurmas = quantidadeTurmas;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
