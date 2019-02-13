package p1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class Teste implements Serializable {
	private Date data = new Date();
	private String usuario;
	private transient String senha;
    public transient Cafe cafe=new Cafe();//transient//estancia de cafe//
    
    private void writeObject(ObjectOutputStream os){ //class cafe//
		try {
			os.defaultWriteObject();
			os.writeInt(cafe.tamanho);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	private void readObject(ObjectInputStream is){
		try {
			is.defaultReadObject();
			cafe=new Cafe();
			cafe.setTamanho(is.readInt());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}	
    	
    
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Informações:\n nome:" + usuario + "\n data:" + data
				+ "\n senha:" + senha + "\n teste:";// +p.teste;
	}

	public Teste(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;

	}

	public static void main(String[] args) throws Exception { // estancia;;da
																// propria
																// classe
		// teste//
		Teste objLogin = new Teste("tecnoponta", "java jcsp");
		// usa o tosstring como chamada defaut//
		
		System.out.println("Lagado a=" + objLogin);
		ObjectOutputStream arq = new // STREAM GRAVAR DADOS BINARIOS DENTRO
										// DE UM ARQUIVO//
		ObjectOutputStream(new FileOutputStream("login.out"));
		arq.writeObject(objLogin);// so grava se for serializado//e chama o metodo writeobject//
		arq.close();//output so é usado so para gravar dados binarios//
                    //intput é so pra  ler em binarios//
System.out.println("Recuperando objeto em" +new Date());
		
		//Restaurando os dados do arquivo.
		ObjectInputStream in =new ObjectInputStream(
		new FileInputStream("login.out")		
		);
		objLogin=(Teste)in.readObject();
		
		System.out.println("Lagado a="+objLogin);
		
		//ctrl+shift+o para os imports...lembrar//
		
	}
}
class Cafe{  //class cafe//
	int tamanho;

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
}

