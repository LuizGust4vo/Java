package poo_model;

public class Endereço {

	public enum TipoEndereço {
		RESIDENCIAL, ENTREGA, TRABALHO
	}

	// Classe endereço para reduzir o código principal
	// e facilitar a manutenção.
	public String endereco;
	public String numero;
	public String complemento;
	public String bairro;
	public String estado;
	public String cep;
	public TipoEndereço tipo;

}
