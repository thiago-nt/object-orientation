package p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

public class Conjuntos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//M�todo comuns da interface colection
		//add(Object),addAll(Collection),contains(Object),containsAll(Collecion),
		//remove(Object),removelAll(Collecion),interator(),toArray();toArray(Array)
		
		//Principal diferen�a entre a inteface set e list, a interface set n�o aceita objetos duplicados.
		// A interface list possui v�rio m�todo referente ao controle de indice do objeto
		//get(int index);indexOf();add(int index,Object)
		//Todas as implementa��es de list (Classes concretas) s�o ordenadas.
		//Isso quer dizer que quando precisar correr os elementos, existir� uma ordem definida
		//Neste caso ser� a posi��o do indice.
		
		//hastcode// 1min:32 //
		
		Collection lista=new ArrayList();
		//Set listaUnica=new HashSet();
		Set listaUnica=new LinkedHashSet();
          
		//criacao da class carros//
		Carro c1=new Carro();
		c1.setModelo("Vectra");
		c1.setMotor(1.0);
		Carro c2=c1;
		Carro c3=new Carro();
		c3.setMotor(2.0);
		c3.setModelo("Palio");
		//lembrar de implementar o compareble//
        TreeSet<Carro> carros=new TreeSet<Carro>(); // tipa em cima <carro> //
        carros.add(c1);
        carros.add(c3); //1:50:39 min//
        for(Carro c:carros){
        	System.out.println(c.getModelo());
        }
        System.out.println(c1.equals(c3));
        System.out.println(listaUnica.add(c1));
        System.out.println(listaUnica.add(c2));
        System.out.println(listaUnica.add(c3));
        
		//Objecto TreeSet, este objeto � ordenado e classificado
		TreeSet listaOrdenada=new TreeSet();
		listaOrdenada.add("Santos");
		listaOrdenada.add("S�o Vicente");
		listaOrdenada.add("Aracaju");
		listaOrdenada.add("Bertioga");
		listaOrdenada.add("Guaruja");

		//Quando fazemos um intera��o, reparem que n�o ser� pela ordem de inser��o e sim
		//pela ordem natural.
		for (Object o:listaOrdenada){
			System.out.println(o);
			
			// A interface Queue Usado para trabalhar com itens em filas encadeadas, onde o primeiro
			//item a entrar � o primeiro a sair, ela fornece m�todos para isso.
			
			//Queue  itensEstudar=new PriorityQueue();
			PriorityQueue  itensEstudar=new PriorityQueue();
			itensEstudar.offer("Conjuntos");
			itensEstudar.offer("Heran�a");
			itensEstudar.offer("Wrapper");
			System.out.println(itensEstudar.size());
			System.out.println(itensEstudar.peek());
			System.out.println(itensEstudar.size());
			System.out.println(itensEstudar.peek());
			System.out.println(itensEstudar.poll());
			System.out.println(itensEstudar.size());
			System.out.println(itensEstudar.peek());
			System.out.println(itensEstudar.offer("Conjuntos"));
			
			// A Iterface Map, usa para identicar um objeto uma chave, pois isso
			// todas os objetos possuim dois itens  Chave e Valor que s�o objetos
			// A chave tem que ser exclusiva.
			// Esta interface n�o possui os m�todos add
			//M�todos principais put,get,size()
			Map listaMapeada=new HashMap();
			listaMapeada.put("a", c1);
			listaMapeada.put("b", c2);
			listaMapeada.put("c", c3);
			System.out.println(listaMapeada.put("a", c3));//Vai substituir o objeto na chave a.
			System.out.println(listaMapeada.size());
			System.out.println(listaMapeada.get("a"));
			System.out.println(listaMapeada.get("d"));
			
			List<List<Integer>> table=new ArrayList<List<Integer>>();
			for (int i=0;i<=10;i++){
				List<Integer> row=new ArrayList<Integer>();
				for (int j=0;j<=10;j++)
					row.add(i*j);
				table.add(row);
			}
			
			for (List row:table)
				System.out.println(row);
			//Ordenando os carros
			//Este c�digo ir� dar erro, pois a classe carro n�o implementou
			//a interface Comparable, que � obrigat�rio neste caso
			//A primeira solu��o seria alterar a classe Carro
			// para implementar a Comparable e fazer o  c�digo
			// para o m�todo public int compareto(Object d)
			List<Carro> listaCarros=new ArrayList<Carro>();
			listaCarros.add(c1);
			listaCarros.add(c2);
			listaCarros.add(c3);
			Collections.sort(listaCarros);
			
			for (Carro c:listaCarros)
				System.out.println(c);
		
			//E se n�o tiversse-mos como alterar a classe Carro, e precisarmos classificar
			//Utilizando Comparator, podemos usar um m�todo sort que recebe um est�ncia desta classe
			//asim precisamos criar estar classe e nela ter� a forma de ordenar dois objetos do
			//mesmo tipo.
			Collections.sort(listaCarros,new ModeloSort());
			for (Carro c:listaCarros)
				System.out.println(c);
			
			//Quanto quiser trabalhar com array em vez de conjunto pode utilizar a Classe Arrays
			//Para encontrar objetos, podemos usar o m�todo binarySearch().
			System.out.println(Collections.binarySearch(listaCarros,c1));
			
			//Convertendo array em listas
			// Usamos o m�todo Arrays.asList(Array) que retorna um cole��o list
			//Usamos p m�todo Collections.toArray(Array), para retornar um array.
			
			//Invertendo a ordem
			Comparator ordemInversa=Collections.reverseOrder();
			Collections.sort(listaCarros,ordemInversa);
			for (Carro c:listaCarros)
				System.out.println(c);


		}
	}

}
   //uma class nova sempre fora da outra class//

class ModeloSort implements Comparator<Carro>{
	public int compare(Carro arg0, Carro arg1) {
		// TODO Auto-generated method stub
		return arg0.getModelo().compareTo(arg1.getModelo());
	}
}
