package cadastroUsuario;

public class Investidor extends Pessoa {
	
	private String cpf;
	private double quantiaDoada = 0;
	private String senha;
	
	public Investidor(int id, String nome, String sobrenomesDoMeio, String ultimoSobrenome,
			String email, String cpf, double quantiaDoada,String senha) {
		super(id, nome, sobrenomesDoMeio, ultimoSobrenome, email);
		this.cpf = cpf;
		this.quantiaDoada = quantiaDoada;
		this.setSenha(senha);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getQuantiaDoada() {
		return quantiaDoada;
	}

	public void setQuantiaDoada(double quantiaDoada) {
		this.quantiaDoada = quantiaDoada;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
