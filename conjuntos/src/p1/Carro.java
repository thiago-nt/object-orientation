package p1;

public class Carro implements Comparable<Carro> { // 1min:42 compareTo//
	private double motor;
	private String modelo = "";

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getMotor() {
		return motor;
	}

	public void setMotor(double motor) {
		this.motor = motor;
	}

	public int compareTo(Carro o) { // o é o nome do argumento//
		// TODO Auto-generated method stub
		return modelo.compareTo(o.getModelo()); // retorna o modelo//
	}

	@Override
	// 1:56 min//
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		if (o instanceof Carro && ((Carro) o).getModelo() == this.modelo) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		// Como consideramos um carro igual baseado no modelo
		// devemos gerar o hash também baseado no modelo
		return modelo.hashCode();
		// return 4000; //é valido porem ineficiente
		// evitar usar variaveis trasiente pra calculo do hash.
		
	}
	    @Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Carro:"+modelo+";Motor:"+motor;
		}

	}

