package AulaPoo;

public class PessoaJuridica extends Pessoa {
	private String cnpj;
	private String ie; //inscrição estadual
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getIe() {
		return ie;
	}
	public void setIe(String ie) {
		this.ie = ie;
	}
	
	
}
