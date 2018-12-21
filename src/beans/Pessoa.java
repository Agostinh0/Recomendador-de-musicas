package beans;

import java.util.ArrayList;

public class Pessoa {
	private String nomeUsuario;
	private String senha;
	private ArrayList<Musica> musicas;
	
	public Pessoa(String nomeUsuario, String senha, ArrayList<Musica> musicas) {
		super();
		this.nomeUsuario = nomeUsuario;
		this.senha = senha;
		this.musicas = musicas;
	}
	
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public ArrayList<Musica> getMusicas() {
		return musicas;
	}
	public void setMusicas(ArrayList<Musica> musicas) {
		this.musicas = musicas;
	}
	
	
	
}
