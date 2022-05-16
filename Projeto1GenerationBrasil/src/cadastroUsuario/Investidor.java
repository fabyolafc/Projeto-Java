package cadastroUsuario;

public class Investidor extends Pessoa {
	
	private String cpf;
	private double quantiaDoada = 0;
	
	public Investidor(int id, String nome, String sobrenomesDoMeio, String ultimoSobrenome,
			String email, String cpf, double quantiaDoada) {
		super(id, nome, sobrenomesDoMeio, ultimoSobrenome, email);
		this.cpf = cpf;
		this.quantiaDoada = quantiaDoada;
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
	
}
