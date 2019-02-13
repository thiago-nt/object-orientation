package p1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cafe c1 = new Cafe();
		c1.setTamanho(TamanhoCafe.MEDIO); // usando enum
		System.out.println(c1.getTamanho().getMililitro());
		System.out.println(TamanhoCafe.GRANDE.getMililitro());
		Cafe c2=new Cafe();
		c2.setTamanho(TamanhoCafe.MEDIO);
		System.out.println(c2.getTamanho());
		GregorianCalendar g1=new GregorianCalendar();
		System.out.println(g1.get(Calendar.DATE));
	}
}

class Cafe {
	private TamanhoCafe tamanho; // /construtor

	public TamanhoCafe getTamanho() {
		return tamanho;
	}

	public void setTamanho(TamanhoCafe tamanho) {
		this.tamanho = tamanho;
	}
}
