package p1;

public class Audi extends Carro {
	public void andar() {
		System.out.println("andando a 80 km/h");
	}

	@Override
	public int getSeguro() {
		// TODO Auto-generated method stub
		return 2000;
	}

	public void setAirBag(int quant) {
		System.out.println("AirBag Ativado.");
	}
}
