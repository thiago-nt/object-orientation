package rotinas;

public class Analista extends Funcionario{
	public static final double MIN_SALARIO_PROGRAMADOR = 40; 
	public static final double MAX_SALARIO_PROGRAMADOR = 60; 
	private static int quant;
	
	public Analista(){
		setFuncao(Profissao.ANALISTA);
		quant++;
	}
	
	public void setSalario(double salario) {
		if (salario <= MIN_SALARIO_PROGRAMADOR || salario > MAX_SALARIO_PROGRAMADOR){
			throw new IllegalArgumentException("Salario:"+salario+" inválido para "+funcao);
		}
		this.salario = salario ;
	}
	
	public static int getQuant() {
		return quant;
	}
}
