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
		//Método comuns da interface colection
		//add(Object),addAll(Collection),contains(Object),containsAll(Collecion),
		//remove(Object),removelAll(Collecion),interator(),toArray();toArray(Array)
		
		//Principal diferença entre a inteface set e list, a interface set não aceita objetos duplicados.
		// A interface list possui vário método referente ao controle de indice do objeto
		//get(int index);indexOf();add(int index,Object)
		//Todas as implementações de list (Classes concretas) são ordenadas.
		//Isso quer dizer que quando precisar correr os elementos, existirá uma ordem definida
		//Neste caso será a posição do indice.
		
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
        
		//Objecto TreeSet, este objeto é ordenado e classificado
		TreeSet listaOrdenada=new TreeSet();
		listaOrdenada.add("Santos");
		listaOrdenada.add("São Vicente");
		listaOrdenada.add("Aracaju");
		listaOrdenada.add("Bertioga");
		listaOrdenada.add("Guaruja");

		//Quando fazemos um interação, reparem que não será pela ordem de inserção e sim
		//pela ordem natural.
		for (Object o:listaOrdenada){
			System.out.println(o);
			
			// A interface Queue Usado para trabalhar com itens em filas encadeadas, onde o primeiro
			//item a entrar é o primeiro a sair, ela fornece métodos para isso.
			
			//Queue  itensEstudar=new PriorityQueue();
			PriorityQueue  itensEstudar=new PriorityQueue();
			itensEstudar.offer("Conjuntos");
			itensEstudar.offer("Herança");
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
			// todas os objetos possuim dois itens  Chave e Valor que são objetos
			// A chave tem que ser exclusiva.
			// Esta interface não possui os métodos add
			//Métodos principais put,get,size()
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
			//Este código irá dar erro, pois a classe carro não implementou
			//a interface Comparable, que é obrigatório neste caso
			//A primeira solução seria alterar a classe Carro
			// para implementar a Comparable e fazer o  código
			// para o método public int compareto(Object d)
			List<Carro> listaCarros=new ArrayList<Carro>();
			listaCarros.add(c1);
			listaCarros.add(c2);
			listaCarros.add(c3);
			Collections.sort(listaCarros);
			
			for (Carro c:listaCarros)
				System.out.println(c);
		
			//E se não tiversse-mos como alterar a classe Carro, e precisarmos classificar
			//Utilizando Comparator, podemos usar um método sort que recebe um estância desta classe
			//asim precisamos criar estar classe e nela terá a forma de ordenar dois objetos do
			//mesmo tipo.
			Collections.sort(listaCarros,new ModeloSort());
			for (Carro c:listaCarros)
				System.out.println(c);
			
			//Quanto quiser trabalhar com array em vez de conjunto pode utilizar a Classe Arrays
			//Para encontrar objetos, podemos usar o método binarySearch().
			System.out.println(Collections.binarySearch(listaCarros,c1));
			
			//Convertendo array em listas
			// Usamos o método Arrays.asList(Array) que retorna um coleção list
			//Usamos p método Collections.toArray(Array), para retornar um array.
			
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
