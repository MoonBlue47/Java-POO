package AulaPoo;

public class Aluno {
	
	public static void main(String[] args) {
		PessoaFisica aluno = new PessoaFisica();
		aluno.setNome("Erick");
		aluno.setTelefone("(11)98877=6655");
		aluno.setEmail("Erick@email.com");
		aluno.setCpf("11133355567");
		aluno.setRg("555666779");
		System.out.println("Nome: "+aluno.getNome());
		System.out.println("Telefone: "+aluno.getTelefone());
		System.out.println("Email: "+aluno.getEmail());
		System.out.println("Cpf: "+aluno.getCpf());
		System.out.println("RG: "+aluno.getRg());
		
		PessoaJuridica empresario = new PessoaJuridica();
		empresario.getNome();
		empresario.getTelefone();
		empresario.getEmail();
		empresario.getCnpj();
		empresario.getIe();
	}
}
