package br.com.unifip.pets;

public class Pets {
	private String nome;
	private String dono;
	private String id;

	public Pets(String nome, String dono, String id) {
		this.nome = nome;
		this.dono = dono;
		this.id = id;
	}

	public Pets() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
