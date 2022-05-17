package cadastroUsuario;

public class Aluno extends Pessoa {
		
	private int anoEscolar;
	private double mediaGeral_anoAnterior;
	private double mediaGeral_anoAtual;
	private double mediaMatematica_anoAnterior;
	private double mediaMatematica_anoAtual;
	private String senha;
	
	public Aluno(int id, String nome, String sobrenomesDoMeio, String ultimoSobrenome, 
			String rg, int dataDeNascimento, String endereco, String celular, 
			String email,String senha, int anoEscolar, double mediaGeral_anoAnterior, 
			double mediaGeral_anoAtual, double mediaMatematica_anoAnterior,
			double mediaMatematica_anoAtual, int idade) {
		super(id, nome, sobrenomesDoMeio, ultimoSobrenome, rg, dataDeNascimento, endereco,
				celular, email, idade);
		this.anoEscolar = anoEscolar;
		this.mediaGeral_anoAnterior = mediaGeral_anoAnterior;
		this.mediaGeral_anoAtual = mediaGeral_anoAtual;
		this.mediaMatematica_anoAnterior = mediaMatematica_anoAnterior;
		this.mediaMatematica_anoAtual = mediaMatematica_anoAtual;
		this.senha = senha;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getAnoEscolar() {
		return anoEscolar;
	}

	public void setAnoEscolar(int anoEscolar) {
		this.anoEscolar = anoEscolar;
	}

	public double getMediaGeral_anoAnterior() {
		return mediaGeral_anoAnterior;
	}

	public void setMediaGeral_anoAnterior(int mediaGeral_anoAnterior) {
		this.mediaGeral_anoAnterior = mediaGeral_anoAnterior;
	}

	public double getMediaGeral_anoAtual() {
		return mediaGeral_anoAtual;
	}

	public void setMediaGeral_anoAtual(int mediaGeral_anoAtual) {
		this.mediaGeral_anoAtual = mediaGeral_anoAtual;
	}

	public double getMediaMatematica_anoAnterior() {
		return mediaMatematica_anoAnterior;
	}

	public void setMediaMatematica_anoAnterior(int mediaMatematica_anoAnterior) {
		this.mediaMatematica_anoAnterior = mediaMatematica_anoAnterior;
	}

	public double getMediaMatematica_anoAtual() {
		return mediaMatematica_anoAtual;
	}

	public void setMediaMatematica_anoAtual(int mediaMatematica_anoAtual) {
		this.mediaMatematica_anoAtual = mediaMatematica_anoAtual;
	}
			
}
