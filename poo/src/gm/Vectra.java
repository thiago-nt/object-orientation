package gm;

import org.omg.CORBA.SetOverrideType;

public class Vectra extends Carro {
private static int quant;
	public double getSeguro() { // overload de get seguro
		// TODO Auto-generated method stub
		return super.getSeguro() * 1.2;
	}

	public static int getQuant() {
		return quant;
	}
	public Vectra() { // contrutor de vectra..pai...filha motor(2.0)
		setMotor(2.0);
		quant++;
		setModelo("vectra");// tem que chamar o set para funcionar o
		// contrutor

	}

	public void setCor(String cor) {

		if (cor.equalsIgnoreCase("preto") || 
			cor.equalsIgnoreCase("prata")|| 
			cor.equalsIgnoreCase("azul")) {
			this.cor = cor;
		} else {
			throw new IllegalArgumentException("o vectra deve ser" + ""
					+ "PRETO,PRATA ou AZUL.");
		}
	}
}
