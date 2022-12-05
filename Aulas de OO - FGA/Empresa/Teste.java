package Empresa;

public class Teste {

	public static void main(String[] args) {

		Empresa e1 = new Empresa(1, "Martineli LTDA");
		e1.addDepartamento(new Departamento(1, "RH", 20));
		e1.addDepartamento(new Departamento(2, "Financeiro", 10));
		e1.addDepartamento(new Departamento(3, "Software", 200));
		e1.addDepartamento(new Departamento(4, "Suporte", 30));

		System.out.println("Quantidade de departamentos da empresa " + e1.getNome() + " = " + e1.getQtd_departamentos());
		System.out.println("\nQuantidade de funcionários " + " = " + e1.calcular_qtd_funcionarios());
	}

}
