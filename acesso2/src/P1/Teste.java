package P1;

public class Teste extends Pai {
	public void grava(){
		System.out.println("gravando..");
		super.grava();
		
		/*
		int x=3;   //modificador Strictft
		int y=x/2;
		System.out.println(y);*/
		
	}
	public static void main(String[]args){
		Teste t=new Teste();
		t.grava();
	}
}
class Pai{
	//transient int x;   usado so em variaveis//
	//volatile int x;//
	public void grava(){
		System.out.println("gravado");
		synchronized (this) {  //   synchronized
			System.out.println("Bloco");
			
		}
	}
}