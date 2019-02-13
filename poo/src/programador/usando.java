package programador;

import fiat.Palio;
import gm.Carro;
import gm.Vectra;

import javax.swing.JOptionPane;

public class Usando {
	public static void main(String[] args) {
		/*
		 * Carro c1=new Carro(); double motor=1.6; c1.setPeso(1600);
		 * c1.setMotor(motor); System.out.println("Motor de
		 * Carro:"+c1.getMotor()); System.out.println("Peso do
		 * Carro:"+c1.getPeso());
		 */
		Vectra v1 = new Vectra();
		v1.setMotor(2.0);
		v1.setPeso(2200);
		boolean corOk;
		do {
			String cor = JOptionPane.showInputDialog(null,
					"Escolha sua Cor Vectra", "Vectra",
					JOptionPane.INFORMATION_MESSAGE);

			try {
				v1.setCor(cor);
				corOk = true;
			} catch (IllegalArgumentException e) {
				corOk = false;
				JOptionPane.showMessageDialog(null, cor
						+ " invalida para o Vectra", "Erro",
						JOptionPane.ERROR_MESSAGE);
			} catch (NullPointerException e) {
				corOk = false;
				JOptionPane.showMessageDialog(null, "Programa será encerrado",
						"Erro", JOptionPane.ERROR_MESSAGE);
				System.exit(0);
			}
		} while (!corOk);

		// v1.setModelo("Vectra");
		v1.setPlaca("BHZ2636");
		System.out.println("*****" + v1.getModelo() + "*****");
		System.out.println("Motor   :" + v1.getMotor());
		System.out.println("Peso    :" + v1.getPeso());
		System.out.println("Placa   :" + v1.getPlaca());
		System.out.println("Potencia:" + v1.getPotencia());
		System.out.println("Seguro  :" + v1.getSeguro());

		Vectra v2 = new Vectra();
		// v2.setMotor(2.0);
		v2.setPeso(2200);
		// v2.setModelo("Vectra"); //tornar em modo de comentario para o uso do
		// protected
		v2.setPlaca("BHZ2636");
		System.out.println("*****" + v2.getModelo() + "*****");
		System.out.println("Motor   :" + v2.getMotor());
		System.out.println("Peso    :" + v2.getPeso());
		System.out.println("Placa   :" + v2.getPlaca());
		System.out.println("Potencia:" + v2.getPotencia());
		System.out.println("Seguro  :" + v2.getSeguro());
		System.out.println("cor:" + v2.getCor());

		Palio p1 = new Palio();
		p1.setMotor(1.0);
		p1.setPeso(1600);
		// p1.setModelo("Palio");
		p1.setPlaca("BHZ2221");
		System.out.println("*****" + p1.getModelo() + "*****");
		System.out.println("Motor   :" + p1.getMotor());
		System.out.println("Peso    :" + p1.getPeso());
		System.out.println("Placa   :" + p1.getPlaca());
		System.out.println("Potencia  :" + p1.getPotencia());
		System.out.println("Seguro   :" + p1.getSeguro());
		System.out.println("cor:" + p1.getCor());
		/* quantidades de carros em quant */
		System.out.println("Quant Carros  :" + Carro.getQuant());
		System.out.println("Quant Vectras  :" + Vectra.getQuant());
		System.out.println("Quant Palio  :" + Palio.getQuant());
	}
}
