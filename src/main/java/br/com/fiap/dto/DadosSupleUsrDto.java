package br.com.fiap.dto;

public class DadosSupleUsrDto {
	private Long id;
	private Double altura;
	private Double peso;
	private char sexo;
	private int idade;
	private Double imc;
	private String habitosSaude;
	private String nome;

	private String alimentacaoSaude;

	private String tempoSono;

	public DadosSupleUsrDto() {
		super();
	}

	

	public DadosSupleUsrDto(Long id, Double altura, Double peso, char sexo, int idade, Double imc, String habitosSaude,
			String nome, String alimentacaoSaude, String tempoSono) {
		super();
		this.id = id;
		this.altura = altura;
		this.peso = peso;
		this.sexo = sexo;
		this.idade = idade;
		this.imc = imc;
		this.habitosSaude = habitosSaude;
		this.nome = nome;
		this.alimentacaoSaude = alimentacaoSaude;
		this.tempoSono = tempoSono;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getNome() {
		return nome;
	}



	public String getHabitosSaude() {
		return habitosSaude;
	}

	public void setHabitosSaude(String habitosSaude) {
		this.habitosSaude = habitosSaude;
	}

	public String getAlimentacaoSaude() {
		return alimentacaoSaude;
	}

	public void setAlimentacaoSaude(String alimentacaoSaude) {
		this.alimentacaoSaude = alimentacaoSaude;
	}

	public String getTempoSono() {
		return tempoSono;
	}

	public void setTempoSono(String tempoSono) {
		this.tempoSono = tempoSono;
	}

	public Double getImc() {
		return imc;
	}

	public void setImc(Double imc) {
		this.imc = imc;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
