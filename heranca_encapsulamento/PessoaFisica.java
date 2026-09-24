package AulaPoo;

public class PessoaFisica extends Pessoa {
	private String cpf;
	private String rg;
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getRg() {
		return this.rg;
	}
}
