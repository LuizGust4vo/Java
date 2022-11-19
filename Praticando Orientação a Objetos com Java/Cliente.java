package poo_model;

import java.util.List;

public class Cliente {

	// Propriedades da classe Cliente:
	public Integer codigo;
	public String nome;
	public String cpf;

	// Associação: relacionamento estrutural que especifica objetos de uma classe
	// conectados a objetos de outra classe:
	public List<Endereço> enderecos;

}
