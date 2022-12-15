package poo_model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	// Propriedades da classe Cliente:
	private Integer codigo;
	private String nome;
	private String cpf;

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

	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setEnderecos(List<Endereço> enderecos) {
		this.enderecos = enderecos;
	}
}
