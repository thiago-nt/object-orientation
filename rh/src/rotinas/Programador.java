package rotinas;

import programador.Usando;

public class Programador extends Funcionario {
	public void setSalario(double salario) {
	private static int quant;
    
		if (salario < 40) {
			this.salario = salario;
		} else {
			throw new IllegalArgumentException("o salario deve ser" + "" + ".");
		}
	}
	public Programador(){
		setFuncao("Programador");
		quant++;
	}
	
	public static int getQuant() { // quant de funcionario//
		return quant;
	}
}