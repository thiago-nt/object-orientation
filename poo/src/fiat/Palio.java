package fiat;

import gm.Carro;

public class Palio extends Carro {
	private static int quant;

	@Override
	public double getPotencia() {
		// TODO Auto-generated method stub
		return super.getPotencia() * 0.9;
	}
	public static int getQuant() {
		return quant;
	}
	public Palio() { // contrutor de palio..pai...filha motor(2.0)
		setMotor(2.0);
		quant++;
		setModelo("Palio");// tem que chamar o set para funcionar o
		// contrutor

	}

	@Override
	public void setCor(String cor) {
		// TODO Auto-generated method stub
		if (cor.equalsIgnoreCase("prata") || cor.equalsIgnoreCase("branco")) {
			this.cor = cor;
		} else {
			throw new IllegalArgumentException("o palio deve ser"
					+ "branco ou prata.");
		}
	}
}
