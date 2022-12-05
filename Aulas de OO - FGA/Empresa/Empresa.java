package Empresa;

import java.util.ArrayList;

public class Empresa {

	/* Atributos */
	private int codigo;
	private String nome;
	private int qtd_departamentos;
	private ArrayList<Departamento> departamentos;

	/* Construtores */
	public Empresa(int c, String n) {
		this.codigo = c;
		this.nome = n;
		this.qtd_departamentos = 0;
		this.departamentos = new ArrayList<>();
	}

	public Empresa() {
	};

	/* Serviços */
	public int calcular_qtd_funcionarios() {
		int qtd = 0;
		Departamento d;

		for (int i = 0; i < this.departamentos.size(); i++) {
			d = this.departamentos.get(i);
			qtd += d.getQtd_funcionarios();
		}

		return qtd;
	}

	public void addDepartamento(Departamento d) {
		this.departamentos.add(d);
		this.qtd_departamentos++;
	}

	/* getters and setters */
	public int codigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getQtd_departamentos() {
		return qtd_departamentos;
	}
	public void setQtd_departamentos(int qtd_departamentos) {
		this.qtd_departamentos = qtd_departamentos;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
