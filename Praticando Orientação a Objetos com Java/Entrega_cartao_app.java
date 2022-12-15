package poo;

import poo_model.Cliente;
import poo_model.Endereço;

public class Entrega_cartao_app {

	public static void main(String[] args) {

		Endereço endereco = new Endereço();
		endereco.setCep("0000000");
		// Dados do endereço

		Cliente cliente = new Cliente();
		// Dados do cliente

		// cliente.adicionaEndereco(endereco);
		// System.out.println ("Endereço adicionado com sucesso!");

		// Também é possível utilizar try-catch para exibir o erro
		try {
			cliente.adicionaEndereco(endereco);
			System.out.println("Endereço adicionado com sucesso!");
		} catch (Exception e) {
			System.err.println("Houve um erro ao adicionar endereço: " + e.getMessage());
		}
	}
}
