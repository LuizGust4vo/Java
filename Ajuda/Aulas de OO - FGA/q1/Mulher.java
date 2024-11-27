package q1;

public class Mulher extends PessoaFisica {

	public Mulher(String cpf, String nome, double desconto) {
		super(cpf, nome, desconto);
	}

	public double calcularDesconto() {
		return super.calcularDesconto();
	}
}
