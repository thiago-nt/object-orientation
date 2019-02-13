package pacote1;
import pacote2.exemplo;
public class Teste {

public static void main(String[]args){
	exemplo e1=new exemplo();
	final int DIA=30;
	e1.ano=2007;
	System.out.println("dia:"+e1.dia);
	System.out.println("mes:"+e1.mes);
    System.out.println("ano:"+e1.ano);
    java.util.Date dt=new java.util.Date();
    String Byte="";
    byte a=1;
    byte b=2;
    byte c=(byte)(a+b);//cast
    long d=10;
    int e=(int)(a+b);
    byte f=5+DIA;
    
    float ff=145;
    float dd=125;
    float ss=ff+dd;
    char j='A';
    char jj='A';
    char jjj='\uFEC2'; //hexadecimal
    char m=0xface; //hexadecimal
    int r=027; //octal
    System.out.println(r);
    long s=3000000000000L; //L long
    float x=4.0f;
    double y=3e2; //float y=3e2f;
    
    //regras de nomes
    int _12;
    int $byte;
    int feijao;
    
}
}
class outra{
}
