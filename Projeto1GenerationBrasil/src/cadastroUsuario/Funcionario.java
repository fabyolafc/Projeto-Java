package cadastroUsuario;

public class Funcionario extends Pessoa {

	private double salario;
	private String cpf;
	private String cargoAtual;
	private int tempoDeEmpresa;
	
	public Funcionario(int id, String nome, String sobrenomesDoMeio, String ultimoSobrenome, String rg,
			int anoDeNascimento, String endereco, String celular, String email,
			double salario, String cpf, String cargoAtual, int tempoDeEmpresa) {
		super(id, nome, sobrenomesDoMeio, ultimoSobrenome, rg, anoDeNascimento, endereco, celular, email);
		this.salario = salario;
		this.cpf = cpf;
		this.cargoAtual = cargoAtual;
		this.tempoDeEmpresa = tempoDeEmpresa;
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

	public String getCargoAtual() {
		return cargoAtual;
	}

	public void setCargoAtual(String cargoAtual) {
		this.cargoAtual = cargoAtual;
	}

	public int getTempoDeEmpresa() {
		return tempoDeEmpresa;
	}

	public void setTempoDeEmpresa(int tempoDeEmpresa) {
		this.tempoDeEmpresa = tempoDeEmpresa;
	}
			
}
