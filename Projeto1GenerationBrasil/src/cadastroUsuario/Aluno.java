package cadastroUsuario;

import java.time.LocalDate;

public class Aluno extends Pessoa {
		
	private int anoEscolar;
	private int mediaGeral_anoAnterior;
	private int mediaGeral_anoAtual;
	private int mediaMatematica_anoAnterior;
	private int mediaMatematica_anoAtual;
	private String senha;
	
	public Aluno(int id, String nome, String sobrenomesDoMeio, String ultimoSobrenome, String rg,
			LocalDate dataDeNascimento, String endereco, String celular, String email,String senha, int anoEscolar,
			int mediaGeral_anoAnterior, int mediaGeral_anoAtual, int mediaMatematica_anoAnterior,
			int mediaMatematica_anoAtual) {
		super(id, nome, sobrenomesDoMeio, ultimoSobrenome, rg, dataDeNascimento, endereco, celular, email);
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

	public int getMediaGeral_anoAnterior() {
		return mediaGeral_anoAnterior;
	}

	public void setMediaGeral_anoAnterior(int mediaGeral_anoAnterior) {
		this.mediaGeral_anoAnterior = mediaGeral_anoAnterior;
	}

	public int getMediaGeral_anoAtual() {
		return mediaGeral_anoAtual;
	}

	public void setMediaGeral_anoAtual(int mediaGeral_anoAtual) {
		this.mediaGeral_anoAtual = mediaGeral_anoAtual;
	}

	public int getMediaMatematica_anoAnterior() {
		return mediaMatematica_anoAnterior;
	}

	public void setMediaMatematica_anoAnterior(int mediaMatematica_anoAnterior) {
		this.mediaMatematica_anoAnterior = mediaMatematica_anoAnterior;
	}

	public int getMediaMatematica_anoAtual() {
		return mediaMatematica_anoAtual;
	}

	public void setMediaMatematica_anoAtual(int mediaMatematica_anoAtual) {
		this.mediaMatematica_anoAtual = mediaMatematica_anoAtual;
	}
			
}
