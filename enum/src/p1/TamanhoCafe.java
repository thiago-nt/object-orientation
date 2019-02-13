package p1;

public enum TamanhoCafe {  
PEQUENO(10),MEDIO(20),GRANDE(30);//enum sempre em maiusculos//
    private int mililitro;
     private TamanhoCafe(int mililitro){  //construtor tamanho cafe//
    	 this.mililitro=mililitro;
    	 
     }
	public int getMililitro() {
		return mililitro;
	}

	
}
