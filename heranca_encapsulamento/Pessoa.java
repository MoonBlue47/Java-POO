package AulaPoo;

public class Pessoa {
	private String nome;
	private String telefone;
	private String email;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getTelefone() {
		String telefone = this.telefone;
		return telefone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return this.email;
	}
}