package poo_model;

public class Pessoa {

	// Variáveis estáticas para definir o tamanho do CPF e do CNPJ
	private static final int tamanho_cpf = 11;
	private static final int tamanho_cnpj = 14;

	private enum TipoPessoa {
		FÍSICA, JURÍDICA
	}

	private Integer codigo;
	private String nome;
	private String documento; // String númerica
	private TipoPessoa tipo;
	
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

	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		if (documento == null || documento.isEmpty()) {
			throw new RuntimeException("Documento não pode ser nulo ou vazio!");
		}
		if (documento.length() == tamanho_cpf) {
			setDocumento(documento, tipo = TipoPessoa.FÍSICA);
		} 
		else if (documento.length() == tamanho_cnpj) {
			setDocumento(documento, tipo = TipoPessoa.JURÍDICA);
		} 
		else {
			throw new RuntimeException("Documento inválido para pessoa física ou jurídica");
		}

	}

	private void setDocumento(String documento, TipoPessoa tipo) {
		this.documento = documento;
		this.tipo = tipo;
	}

	public TipoPessoa getTipo() {
		return tipo;
	}
	public void setTipo(TipoPessoa tipo) {
		this.tipo = tipo;
	}

}
