package p1;

public class Teste {
	public static void main(String[] args) {
		
	
	String s1="1";
	String s2="2"; //erro de formata�ao//
	String s3="0";
	try {
		int x=Integer.parseInt(s1);
		int y=x/0;//aritimetic exception//
		
		//System.out.println(h.toUpperCase());
	}
	catch (NumberFormatException e){
		System.out.println("Erro de Formata��o de N�mero");
	}catch (ArithmeticException e){
		System.out.println("Aritm�tic  Exception");
	} catch (Exception e) {
		// 
		// TODO: handle exception
		System.out.println("Erro Gen�rico");
	} finally{
		System.out.println("Ser� Executado de todo jeito");
	}
	}

     

class TesteErro{
	public void metodo1() throws MeuErroException {
		throw new MeuErroException("Mensagem de Erro");
	}
}
class TesteErro2 extends TesteErro{
	@Override
	public void metodo1() throws MeuErroException { //1:12 min//nao pode modificar o override//ex:throws Exeption erro generico//
		// TODO Auto-generated method stub
		
	}
}
class MeuErroException extends Exception{
	MeuErroException(String s){
		super(s);
	}
}
}
