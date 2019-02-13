package p1;

public class Teste implements Runnable {
	private Conta cta = new Conta();

	public static void main(String[] args) {
		Teste r = new Teste();
		Thread joao = new Thread(r);
		Thread maria = new Thread(r);
		joao.setName("João");
		maria.setName("Maria");
		joao.start();
		maria.start();
		try {
			joao.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("menssagem apos joao");
	}

	// super.run();
	// TODO Auto-generated method stub
	// super.run(); // codigo que sera dado start na multitarefa//

	public void run() {
		for (int x = 0; x < 5; x++) {
			gastando(10);
			if (cta.getSaldo() < 0) {
				Thread.yield(); // 2:24 min//
			}
			System.out.println("Conta negativa");
		}
	}

	/*
	 * public static void main(String[] args) { Teste r = new Teste();
	 * r.setName("João"); r.start(); Teste r2=new Teste(); r2.start(); }
	 */
	private synchronized void gastando(int valor) { // colocando
		// synchronized cria um
		// bloco
		// de bloqueio

		if (cta.getSaldo() >= valor) {
			System.out.println(Thread.currentThread().getName()
					+ " retirando 10...");
			try {
				Thread.sleep(3000); // simula um processo demorado //1:54 min//
			} catch (InterruptedException e) {
			}
			cta.retirada(valor);
			System.out.println(Thread.currentThread().getName()
					+ " retirou. ficou (" + cta.getSaldo() + ")");
		} else {
			System.out.println("Não tem saldo para "
					+ Thread.currentThread().getName() + " retirar ("
					+ cta.getSaldo() + ")");
		}
	}
}

class Conta {
	private int saldo = 50;

	public int getSaldo() {
		return saldo;
	}

	public void retirada(int valor) {
		saldo = saldo - valor;
	}

}
