package p1;

import javax.swing.JOptionPane;

public class Usando {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           double dinheiro=Double.parseDouble(
        		   JOptionPane.showInputDialog(null,"quanto vc tem?","Dinheiro",
        				   JOptionPane.INFORMATION_MESSAGE));
           Carro c;
           if (dinheiro<1000){
        	   c=new Fusca();
           }else{
        	   c=new Audi();
           }
           System.out.println("pagando Seguro"+c.getSeguro());
           c.andar();
            if (c instanceof Audi) {
			 ((Audi)c).setAirBag(10);
			
		}
	}

}
