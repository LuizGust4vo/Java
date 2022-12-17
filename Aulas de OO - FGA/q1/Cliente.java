package q1;

public class Cliente {

	private double desconto;

	public Cliente(double desconto) {
		this.desconto = desconto;
	}

	public double calcularDesconto() {

		return desconto * 0.05;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
}
