package p1;

public class Teste {
	public static void main(String[] args) {
		// Criando um vetor com 10 elementos
		// indice de o a 9
		int[] x = new int[10];
		// x[10]=10 /nao existe o indice 10/erro de compilaçao//arrai index out
		// exception
		x[0] = 15; // o indice 0/1/9/ é imprimido os outros numeros 2345678
					// estao em 0 //
		x[1] = 78;
		x[9] = 60;
		for (int y=0;y<x.length; y++) {
			System.out.println(x[y]);
		}
		for (int y:x){
			System.out.println(y);
			

		}
		int z[]=new int[]{2,7,5,3};  // [][]r= e []zz[]= mesma coisa ;;
		byte[] z2={127,7,5,3};
		int[]zz[]={{3,1,4},{4,2,4,6}};
		
			for (int y=0;y<zz.length;y++){
				for (int y2=0;y2<zz[y].length;y2++){
					System.out.println("Vetor["+y+"]"+"["+y2+"]="+zz[y][y2]);
					
				}
			}
			// vetor Bidimencional
			System.out.println(zz[0][2]);
			int aa[][]={{1,2,3},{4,5,6,7,8},{0,1,2,3,4,5,6,7}};
			int[][] hh= {{1,2,3},{4,5,6,7,8}};
			for (int i=0;i<aa.length;i++){
				for (int j=0;j<aa[i].length;j++){
					System.out.println(aa[i][j]);
				}
			}
           //tridimencional//
			int[][][]aaa=new int[2][3][2];
			int[]zzz[][]={{{1,2,3},{4,5,6,7,8}},{{1,5,3}}};
		}   zzz[1]
		    
	}
}