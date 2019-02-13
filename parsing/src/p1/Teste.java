package p1;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Teste {
	public static void main(String[] args) {
		// String imutavel // so na string do poll do java//
		String x = "Tecno";
		String y = "Ponta";
		// String g=x;
		//
		// String g=new String("Tecno"); //heap//
		String g = "novo Texto";
		x = x + y;
		System.out.println(x.toUpperCase());
		// g="tecno";
		System.out.println(x == g);
		String h = x;
		h = "Teste";
		System.out.println(x);
		// AutoBoxing
		Integer hh = 1;
		Integer h2 = hh;
		h2 = 30;
		System.out.println(hh);
		// metodos principais
		// append, insert,reverse,delet/*esses metodos so server para
		// stringBuffer e stringBuilder*/
		StringBuffer sb = new StringBuffer("Tecno");
		sb.append("Ponta");// cria em cima ponta//
		System.out.println(sb);
		sb.insert(0, "Java-");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		sb.delete(0, 5);
		System.out.println(sb);
		StringBuilder sb2 = new StringBuilder("Tecno");
		// StringBuilder não é synchronized.

		// Parsing/Tokens
		x = "Tecnoponta";

		Pattern p = Pattern.compile("po");// pattern configa o que vc quer que
		// procure//
		Matcher m = p.matcher(x); // matcher retorna o resultado da procura//
		while (m.find()) {
			System.out.println(m.start());
			System.out.println(m.group());
		}
		Pattern p2 = Pattern.compile("aba"); // procurando a palavra "aba"//
		Matcher m2 = p2.matcher("abababa");
		while (m2.find()) {
			System.out.println(m2.start());
			System.out.println(m2.group());
		}
		// Busca usando coringas (Metacacteres) \d \w \s . ||o \\d so procura
		// digito|| \\s procura os espaços em branco//|w é tudo menos espaço||
		Pattern p3 = Pattern.compile("\\d");// barra d erro de compilaçao \d ;o
		// certo \\d ;
		Matcher m3 = p3.matcher("ab12ab12aba");
		while (m3.find()) {
			// System.out.println(m3.start());
			System.out.println(m3.group());
		}
		// Quantificador + serve para zero ou mais ocorrencias
		// * zero ou mais ocorrências
		// ? zero ou uma ocorrência
		Pattern p4 = Pattern.compile("\\d+"); // o sinal + na frente do D
		// procura todos os digitos
		// 12,123//
		Matcher m4 = p4.matcher("ab12ab123aba");
		while (m4.find()) {
			// System.out.println(m3.start());
			System.out.println(m4.group());
		}
		// Exemplo para encontrar qualquer número de telefone em uma string
		String pessoas = "joão - (13)254-2545;pedro - 2514 2546;maria - 125456789";
		// Como estrais somente os telefones desta lista.
		Pattern p5 = Pattern.compile("[(\\d\\d)]*\\d+[-\\s]?\\d+");
		Matcher m5 = p5.matcher(pessoas);
		while (m5.find()) {
			// System.out.println(m3.start());
			System.out.println(m5.group());
		}
		// Podemos usar o ponto como substituição de qualquer caracter
		String arquivos = "teste.txt,proj1.doc,proj5.doc,proj6.java,proj.txt";
		// montar uma pequisa, primeiro que retorne todos os nomes que começam
		// com proj
		Pattern p6 = Pattern.compile("proj[^,]*");// not ^, //nao pode ter ,
		// ;;ele para na virgula//
		Matcher m6 = p6.matcher(arquivos);
		while (m6.find()) {
			// System.out.println(m6.start());
			System.out.println(m6.group());
		}

		// depois montar todos que terminam com txt.
		Pattern p7 = Pattern.compile(".*?txt");//*todo que termine com txt//
		Matcher m7 = p7.matcher(arquivos);
		while (m7.find()) {
			// System.out.println(m6.start());
			System.out.println(m7.group());
		}

		// Reparem que esta busca de final, é feita da direita para a esquerda,
		// então ele considerou
		// tudo, podemos usar outro forma os coringas, chamado de relutante, que
		// seria para ele não olhar
		// ganaciosamente até o final
		// String arquivos="teste.txt,proj1.doc,proj5.doc,proj6.java,proj.txt";
		Pattern p8 = Pattern.compile("([^,]\\s*)*?txt");
		Matcher m8 = p8.matcher(arquivos);
		while (m8.find()) {
			System.out.println(m8.start());
			System.out.println(m8.group());
		}
		// Localizando itens com a classe Scanner.
		String scan = "1b2c335f456";
		Scanner s = new Scanner(scan);
		String token;

		while ((token = s.findInLine("\\d\\d")) != null) {
			System.out.println(token);
//			 FAzendo tokenização, separaração de varios valor por um delimitador
			// comum
			// correndo os nomes dos arquivos.
			// Tokenizando com o método split de String
			String[] hhh=arquivos.split(",");
			for (String ss : hhh) {
				System.out.println(ss);
			}
			
//			StringBuilder sb=new StringBuilder();
			 // Tokenizando com a classe Scanner
			/*
			 * pricipais métodos hasNextXxx() nextXxx()
			 */
			String cs = "abc 125 def 1236 htj 125,26 htt";
			Scanner sc = new Scanner(cs);
			while (sc.hasNext()) {
				System.out.println(sc.next());
			}
			Locale lc=new Locale("pt"); // 1 locale muda a linguagem|
			
			sc=new Scanner(cs);
			sc.useLocale(lc);
			while (sc.hasNext()) {
				//HasNextXxx
				if (sc.hasNextInt()) {
					System.out.println(sc.nextInt());
				}else if(sc.hasNextDouble()){
					System.out.println(sc.nextDouble());
				}else{
					sc.next();
				
					//Data. lembre
					Date dt=new Date();
					
					DateFormat[] df=new DateFormat[6];
					df[0]=DateFormat.getInstance();
					df[1]=DateFormat.getDateInstance();
					df[2]=DateFormat.getDateInstance(DateFormat.SHORT);
					df[3]=DateFormat.getDateInstance(DateFormat.MEDIUM);
					df[4]=DateFormat.getDateInstance(DateFormat.LONG);
					df[5]=DateFormat.getDateInstance(DateFormat.FULL);
						
					Locale lc1=new Locale("jp","BR");//indioma 
					DateFormat df1=DateFormat.getDateInstance(DateFormat.MEDIUM, lc1);
					System.out.println(df[0].format(dt));
					System.out.println(df[1].format(dt));
					System.out.println(df[2].format(dt));
					System.out.println(df[3].format(dt));
					System.out.println(df[4].format(dt));
					System.out.println(df[5].format(dt));
					System.out.println(df1.format(dt));
					NumberFormat[] nfa=new NumberFormat[4];
					nfa[0]=NumberFormat.getInstance();
					nfa[1]=NumberFormat.getNumberInstance();
					nfa[2]=NumberFormat.getNumberInstance(lc1);
					nfa[3]=NumberFormat.getCurrencyInstance();
					for (NumberFormat n:nfa){
						System.out.println(n.format(125.136));
					}

				}
			}

		}

	}

}
