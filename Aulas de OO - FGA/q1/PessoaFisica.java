package q1;

public class PessoaFisica extends Cliente{

	private String cpf;
	private String nome;

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public PessoaFisica(String cpf, String nome, double desconto) {
		super(desconto);
		this.cpf = cpf;
		this.nome = nome;
	}
	
}
