package gm;

public  abstract class Carro {
	static int quant;
	private double motor;
	private int peso;
	private String placa;
	private String modelo;
	public final static int PESO_MIN = 1500;//constante,,,modificador final//
	public final static int PESO_MAX = 3000;//constante,,,modificador final//
    protected String cor; //mudar para protected p/TER Acesso ao oveload da cor vectra/
	public Carro(String modelo) {
		super();
		quant++;
		this.modelo = modelo;
		motor = 1.0;
	}

	public Carro() { // contrutor....estancia carro
		this("Padrao");
		motor=1.0;
	}
	public static int getQuant(){
		return quant;
		
	}
	public String getCor() {
		return cor;
	}

	public abstract void setCor(String cor) ;
	
	
	public int getPeso() {
		return peso;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	protected void setModelo(String modelo) {// tornar o modelo do carro
		this.modelo = modelo;
	}

	public void setPeso(int peso) {
		if (peso < PESO_MIN || peso > PESO_MAX) {
			throw new IllegalArgumentException("Peso " + "fora do permitido ("
					+ PESO_MIN + " a " + PESO_MAX + ")");
		}

		this.peso = peso;
	}

	public double getMotor() {
		return motor;
	}

	public void setMotor(double motor) {
		if (motor > 2.0) {
			throw new IllegalArgumentException("Valor do Motor invalido");
		}
		this.motor = motor;
	}

	public double getPotencia() {// retorno de potençia//
		return motor * 180;
	}

	public double getSeguro() {// retorno de seguros//
		return motor * 800;
	}
}
