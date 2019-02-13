package rotinas;

import programador.Usando;

public abstract class Funcionario extends Usando {
	protected double salario;
	private String funcao;
	private static int quant; // funcao quant//quantas vezes as classes foi
	                          // criada//sempre em private//

	public double getSalario() {
		return salario;
	}

	public Funcionario() { // construtor
		quant++;
	}

	public abstract void setSalario(double salario);// metodo em abstract o

	// public iniciall tb em
	// abstract//

	public String getFuncao() {
		return funcao; // retornar sempre//
	}

	protected void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public double getRemuneracao() {
		return salario * 168;

	}

	public static int getQuant() { // quant de funcionario//
		return quant;
	}
}
