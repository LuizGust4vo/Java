package poo;

import java.util.ArrayList;
import poo_model.Cliente;
import poo_model.Endereço;

public class Entrega_cartao_app {

	public static void main(String[] args) {

		Endereço endereco = new Endereço();
		// Dados do endereço

		Cliente cliente = new Cliente();
		// Dados do cliente
		if (cliente.enderecos == null) {
			cliente.enderecos = new ArrayList<Endereço>();
		}

		cliente.enderecos.add(endereco);
		System.out.println("Endereço adicionado com sucesso!");
	}

}
