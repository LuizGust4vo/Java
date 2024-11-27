package poo_model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {

	// Propriedades da classe Cliente
	private String NumCartao;

	// Associação: relacionamento estrutural que especifica objetos de uma classe
	// conectados a objetos de outra classe:
	private List<Endereço> enderecos;

	public void adicionaEndereco(Endereço endereco) {
		if (endereco == null) {
			throw new NullPointerException("Endereço não pode ser nulo!");
		}

		if (endereco.getCep() == null) {
			throw new NullPointerException("CEP não pode ser nulo!");
		}

		getEnderecos().add(endereco);
	}

	// Se o endereço fosse público, o endereço não passaria pela validação
	// de endereço e cep nulo(s);
	private List<Endereço> getEnderecos() {
		if (enderecos == null) {
			enderecos = new ArrayList<Endereço>();
		}
		return enderecos;
	}
	public void setEnderecos(List<Endereço> enderecos) {
		this.enderecos = enderecos;
	}

	public String getNumCartao() {
		return NumCartao;
	}
	public void setNumCartao(String numCartao) {
		NumCartao = numCartao;
	}
}
