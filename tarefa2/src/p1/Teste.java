package p1;

public class Teste extends Thread {
	/**
	 * @param args
	 */
	Calculo c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculo c1 = new Calculo(); //estancia de calculo  ||2:34 min//
		Teste t1 = new Teste(c1); //tres threads//
		Teste t2 = new Teste(c1); //construtor da class teste||2:35|||
		Teste t3 = new Teste(c1);
		t1.start();
		t2.start();
		t3.start();
		c1.start();

	}

	Teste(Calculo calc) {
		c = calc;
	}

	public void run() {
		// TODO Auto-generated method stub
		synchronized (c) {
			System.out.println("Aguardando Calculo..");
			try {
		c.wait(); //estancia de calculo || 2:35:50 ||
		System.out.println(c.total);// c.total||depois que o calculo estivesse pronto//
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("total=" + c.total);
	}

}

class Calculo extends Thread {
	int total;

	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {            //2.32 min//

			for (int i = 0; i < 100; i++) {
				total += i;
			}
			notifyAll(); //2:36// 
		}
	}
}