
package p1;

public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro c1=new Carro();
		c1.setMotor(5.0);
	}

}
class  Carro{
	private double motor;
	public void setMotor(double motor){
		assert motor>0 && motor<4:"Erro"; //1:19 min//
		this.motor=motor;
	}
	private void setIdade(int idade){
		assert idade>0:"Mensagem";
		System.out.println("Idade ok");
	}
}