package poo_model;

public class Endereço {

	public enum TipoEndereço {
		RESIDENCIAL, ENTREGA, TRABALHO
	}

	// Classe endereço para reduzir o código principal
	// e facilitar a manutenção.
	private String endereco;
	private String numero;
	private String complemento;
	private String bairro;
	private String estado;
	private String cep;
	private TipoEndereço tipo;

	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}

	public TipoEndereço getTipo() {
		return tipo;
	}
	public void setTipo(TipoEndereço tipo) {
		this.tipo = tipo;
	}

}
