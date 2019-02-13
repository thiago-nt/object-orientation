package p1;

public class Fusca extends Carro {
	public void andar() {
		System.out.println("andando a 80 km/h");
	}

	@Override
	public int getSeguro() {
		// TODO Auto-generated method stub
		return 120;
	}
}