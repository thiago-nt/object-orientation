package rotinas;

public class Programador extends Funcionario {
	public static final double MAX_SALARIO_PROGRAMADOR = 40; 
	private static int quant;

	public Programador(){
		setFuncao(Profissao.PROGRAMADOR);
		quant++;
	}
	
	public void setSalario(double salario) {
		if (salario > MAX_SALARIO_PROGRAMADOR){
			throw new IllegalArgumentException("Salario:"+salario+" inválido para "+funcao);
		}
		this.salario = salario ;
	}
	
	public static int getQuant() {
		return quant;
	}
}
