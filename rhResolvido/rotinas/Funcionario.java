package rotinas;


public abstract class Funcionario {	
	protected double salario;
	protected Profissao funcao ;
	private static int quant;
	
	Funcionario(){
		quant++;
	}
	
	public static int getQuant(){
		return quant;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public Profissao getFuncao() {
		return funcao;
	}
	
	protected void setFuncao(Profissao funcao){
		this.funcao = funcao ;
	}
	
	public double getRemuneracao() {
		return salario * 168 ;

	}
	
	public abstract void setSalario(double salario);

}
