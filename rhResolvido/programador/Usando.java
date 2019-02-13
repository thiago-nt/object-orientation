package programador;

// --> Valmil 

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import rotinas.*;

public class Usando {

	public static void main(String[] args) {
		DecimalFormat fm = new DecimalFormat("R$ #,##0.00");
		Analista a1 = new Analista();
		Programador p1 = new Programador();
		boolean ok;
		// F1
		do {
			try {
				String p = JOptionPane.showInputDialog(null,"Digite o valor do salário do  "+a1.getFuncao(), "Sálario");
				a1.setSalario(Double.parseDouble(p));
				System.out.println("Função F1: " + a1.getFuncao() + " \nSálario: " + fm.format(a1.getRemuneracao()));
				ok=true;
			} catch (IllegalArgumentException e) {
			    JOptionPane.showMessageDialog(null,e.getMessage(),"Erro", JOptionPane.ERROR_MESSAGE);
			    ok=false;
			}
		} while (!ok);
		// F2
		do {
			try {
				String o = JOptionPane.showInputDialog(null,"Digite o valor do salário do  "+p1.getFuncao(), "Sálario");
				p1.setSalario(Double.parseDouble(o));
				System.out.println("Função F2: " + p1.getFuncao() + " \nSálario: " + fm.format(p1.getRemuneracao()));
				ok=true;
			} catch (IllegalArgumentException e) {
	  		    JOptionPane.showMessageDialog(null,e.getMessage(),"Erro", JOptionPane.ERROR_MESSAGE);
	  		    ok=false;
			}
		} while (!ok);
		// Quantidade
		System.out.println("Quantidade Analista: " + Analista.getQuant());
		System.out.println("Quantidade Programador: " + Programador.getQuant());
		System.out.println("Quantidade Total de Funcionários: "	+ Funcionario.getQuant());
	}
}







