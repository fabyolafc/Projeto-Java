package cadastroUsuario;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
	
	private int id;
	private String nome;
	private String sobrenomesDoMeio;
	private String ultimoSobrenome;
	private String rg;
	private LocalDate dataDeNascimento;
	private String endereco;
	private String celular;	
	private String email;
	private int idade;
	
	public Pessoa(int id, String nome, String sobrenomesDoMeio, String ultimoSobrenome, String rg,
			LocalDate dataDeNascimento, String endereco, String celular, String email) {
		this.id = id;
		this.nome = nome;
		this.sobrenomesDoMeio = sobrenomesDoMeio;
		this.ultimoSobrenome = ultimoSobrenome;
		this.rg = rg;
		this.dataDeNascimento = dataDeNascimento;
		this.endereco = endereco;
		this.celular = celular;
		this.email = email;
		this.idade = calculaIdade(dataDeNascimento);
	}
	
	public Pessoa(int id, String nome, String sobrenomesDoMeio, 
			String ultimoSobrenome, String email) {
		this.id = id;
		this.nome = nome;
		this.sobrenomesDoMeio = sobrenomesDoMeio;
		this.ultimoSobrenome = ultimoSobrenome;
		this.email = email;	
	}

	// https://www.javatpoint.com/java-calculate-age
	public static int calculaIdade(LocalDate dataDeNascimento){
			
		LocalDate dataAtual = LocalDate.now();
		
		if ((dataDeNascimento != null) && (dataAtual != null)) {  
			return Period.between(dataDeNascimento, dataAtual).getYears();  
		}  
		else {  
			return 0;  
		}  	   
				
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenomesDoMeio() {
		return sobrenomesDoMeio;
	}

	public void setSobrenomesDoMeio(String sobrenomesDoMeio) {
		this.sobrenomesDoMeio = sobrenomesDoMeio;
	}

	public String getUltimoSobrenome() {
		return ultimoSobrenome;
	}

	public void setUltimoSobrenome(String ultimoSobrenome) {
		this.ultimoSobrenome = ultimoSobrenome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}	
	
}
