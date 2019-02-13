package p1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{ //throws Exeptions tratamento de erro//
		//Criou um arquivo//
		File file=new File("c:\\","Teste.txt");
		System.out.println(file.exists());
		file.createNewFile();	
		System.out.println(file.exists());
		System.out.println(file.exists());
		//Criar um diretório
		File dir =new File("C:\\","Aula");
		//System.out.println(dir.createNewFile());//directory//
		System.out.println(dir.isDirectory());
		dir.mkdir();
		System.out.println(dir.isDirectory());
		File arq=new File(dir,"Teste.txt");
		arq.createNewFile();
		System.out.println(arq.exists());
		//Renomeando um diretório ou arquivo.///como aula2//
		dir.renameTo(new File("C:\\","Aula2"));
		String[]files=dir.list(); //comando list /imprimir o diretorio//
         for(String x:files){
        	 System.out.println(x);
        	 
         }
         FileWriter fw=new FileWriter(arq); //gravar em arquivo//
         fw.write("Java  Avancado\n");
         fw.write("alexandro");
         fw.flush();
         fw.close();
         BufferedWriter bw=new BufferedWriter(new FileWriter(arq));
         bw.newLine();//newLine criar uma linha dentro do arquivo//bw é o nome da variavel//
         
         //lendo os dados do arquivo.
         char ch[]=new char[50];
         FileReader fr=new FileReader(arq);
         /*
          fr.read(ch);
           for(char c:ch){
           System.out.print(c);
          */
     	BufferedReader br=new BufferedReader(fr);
		String s;
		while ((s=br.readLine())!=null){
			System.out.println(s);
		}
		br.close();
	}
	

}
