package p1;

public class Vectra extends Carro implements Utilitario,TopDeLinha{
	private int bagajeiro=0;
	
	public void setBagajeiro(int litros) {
		// TODO Auto-generated method stub
		bagajeiro=litros;
		
	}
public int getBagajeiro() {
	// TODO Auto-generated method stub
	return bagajeiro;
}
}
