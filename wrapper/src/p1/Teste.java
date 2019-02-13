package p1;

public class Teste {
public static void main(String[] args) {
	
	// TODO Auto-generated method stub
	int x=10;
	Integer y=new Integer(10);
	
	//Classes Wrapper são objetos que representam primitiva
	/*
	 byte=Byte      
	 short=Short
	 char=Character
	 int=Integer
	 long=Long
	 float=Float
	 double=Double
	 boolean=Boolean
	 parseXxx(String); // 43:50 min //metodo parse//
	parseXxx(String,BAse); nÂo tem Boolean/Character/Float/Double
	
	
	XxxValue();  Character/Boolean
	
	ValueOf(); Character
	ValueOf(base); 
	
	toString()
	ToString(base)

	 
	 */
	Integer x2=new Integer(10);
	Double d=new Double(5.0);
	
	Character a=new Character('a');
	int z=x2.intValue();
	byte zz=x2.byteValue();
	Double d2=d.valueOf("1010101010");
	System.out.println(x2.toBinaryString(30));
	
	long h=x2;
	Long hh=h;
	if (x2==10){
		System.out.println("Igual");
	}
	Integer j=1;
	Integer j2=j;
	/*int jjj=j2.intValue();
	jjj++;
	j2=new Integer(jjj);
	*/
	j2++;
	System.out.println(j);
	System.out.println(j2);
	//Decobrindo qual método será executado
	
	Soma s1=new Soma();
	
	System.out.println(s1.somar(10,30));      //42:10 min// //converter para short 45:50 min//
	
	//System.out.println(s1.somar(5.0, 2.0));
	System.out.println(s1.somar("50", "20"));
	//VarArgs  
	//Método somar que recebe vário inteiros.

}
}
class Soma {
	/*public int somar(int x,int y){ //48 min//modelo antigo do java..ele passa primeiro//
		return x+y;
	}*/
	
	//Vararg
	public int somar(int... x){ //39:09 min //
		int z=0;
		for (int h:x){
			z+=h;
		}
		System.out.println("VarArgs");
		return z;
	}
	//soma(1,2)
	public byte somar(byte x,byte y){  //overload //metodos iguais somar//assinaturas diferentes//
		System.out.println("Passou pelo byte");
		return (byte)(x+y);
		
	}
	public byte somar(Number x,Number y){ //overload //somar//
		System.out.println("Passou pelo Number");
		return (byte)(x.byteValue()+y.byteValue());
	}
    
	public int somar(Integer x,Integer y){ //2 integer sao wrapper//
		System.out.println("Passou pelo Integer");
		return x+y; //34: min//
		
	}
	/*public double somar(double x,double y){
		System.out.println("Passou pelo double");
		return x+y;
		
	}*/
	public String somar(String x,String y){
		System.out.println("Passou pelo String");
		return ""+(Integer.parseInt(x)+Integer.parseInt(y));
		
	}
}
