package rotinas;

import programador.Usando;

public class Analista extends Funcionario {
	public void setSalario(double salario) {

		if (salario > 40 && salario < 60) {
			this.salario = salario;
		} else {
			throw new IllegalArgumentException("o salario deve ser" + "" + ".");
		}
	}

	public Analista() {
		setFuncao("ANALISTA");
	}
}
