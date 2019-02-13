package p1;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Comandos If
		// Operadores de Comparação
		/*
		 * == != >= <= > <
		 * 
		 */
		int x = 0;
		if (x < 0) {
			System.out.println("True");
			System.out.println("False");
		} else
			System.out.println("Else");
		System.out.println("EstouAqui");
		if (x == 1) {
			System.out.println("Um");
		} else if (x == 2) {
			System.out.println("Dois");
		} else {
			System.out.println("Não sei");
		}

		if (x == 0)
			;

		System.out.println("False");
		boolean xx;
		if (xx = true) {
			System.out.println("XX=" + xx);
		}

		if (xx) {
			System.out.println("Verdadeiro");
		} else if (!xx)
			System.out.println("Else");
		else {
			System.out.println("Else-If");
		}

		int y = 5;
		int h = 10;
		if (y < h | ++y < h) { // resultado é 6 porque o ++ soma +1 na variavel
			// automaticamente//

			System.out.println(y); // resultado 6// // || or o resultado nao
			// passa para o segundo modulo//
		} // trabalhando com for e if//
		for (int j = 0; j < 10; j++)
			if (j < 5 || j++ > 8) { // abreviado por || or ,,//
				System.out.println(j);
			}

		EstadoCivil ec = EstadoCivil.CASADO; // DECLARANDO A VARIAVEL EC//
		// switch (key) {
		int numero = 1;
		switch (numero) {
		case 1:
			System.out.println("Um");
			break;
		case 2:
			System.out.println("Dois");
		default:
			System.out.println("Outro Número");
		case 3:
			System.out.println("Tres");
			// /lembrar do enum//
		}
		switch (ec) {
		case SOLTEIRO:
			System.out.println("solteiro.");
			break;
		case CASADO:
			System.out.println("CASADO.");
			break;
		case DIVORCIADO:
			System.out.println("divorciado.");
			break;

		}
		// Loops
		int controle = 0;
		for (; controle < 5 && controle++ < 3;) {
			System.out.println("for....");

		}

		for (int s = 0, p = 10, j = 0; s < 5 && ++j < p; s++, j++, System.out
				.println("Passei")) {
			System.out.println("" + s + j);
			if (j < 2) {
				continue; // /continue roda de novo;;break para //
			}
			System.out.println("" + s + j);
		}

		// while //
		//comnados de fluxo de codigos//for ,if,do....//

		while (xx == false) { // while nao tem ; //
			break;
		}
		do { // do while tem ; //
			System.out.println("Do-While");
		} while (false);
		outer: for (int q = 0; q < 10; q++) { // rotulo sempre do lado do for
			// ou do while//outer,,inner//
			inner: for (int w = 0; w < 5; w++) {
				System.out.println("" + q + w);
				if ((w % 2) != 0) {
					continue outer;
				} else {
					continue;
				}
			}
		}

	}

	enum EstadoCivil {
		SOLTEIRO, CASADO, DIVORCIADO
	}
}