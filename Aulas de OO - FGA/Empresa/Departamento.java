package Empresa;

public class Departamento {

	/* Atributos */
	private int codigo;
	private String nome;
	private int qtd_funcionarios;

	/* Construtores */
	public Departamento(int c, String n, int q) {
		this.codigo = c;
		this.nome = n;
		this.qtd_funcionarios = q;
	}

	public Departamento() {
		this.qtd_funcionarios = 0;
	}

	/* getters and setters */
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtd_funcionarios() {
		return qtd_funcionarios;
	}

	public void setQtd_funcionarios(int qtd_funcionarios) {
		this.qtd_funcionarios = qtd_funcionarios;
	}

}
