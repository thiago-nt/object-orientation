package p1;

public class Teste {
	public static void main(String[] args) {
		Cachorro<Integer>  c1=new Cachorro<Integer>();
		c1.setNome("puldo");
		c1.setIdade(5);
		c1.setPeso(10);
		
		Cachorro<Double> c2=new Cachorro<Double>();
		c2.setNome("pitBull");
		c2.setIdade(5.0);
		c2.setPeso(20.0);
		System.out.println(c2.getIdade());
		
	}

}
class Cachorro<T>{  // T é uma variavel para tipa os objetos//1:27 min//
	private T peso;
	private T idade;
	private String nome;
	public T getIdade() {
		return idade;
	}
	public void setIdade(T idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public T getPeso() {
		return peso;
	}
	public void setPeso(T peso) {
		this.peso = peso;
	}
	
}