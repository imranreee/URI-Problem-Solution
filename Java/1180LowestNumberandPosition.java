import java.util.Scanner;

public class LowestNumberandPosition1180 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N, i, lowest;
		N = input.nextInt();

	    int pos = 0;
	    int[] X = new int[N];

	    for(i = 0; i < N; i++){
	    	X[i] = input.nextInt();
	    }

	    lowest = X[0];

	    for(i = 0; i < N; i++){
	        if(X[i] < lowest){
	            lowest = X[i];
	            pos = i;
	        }
	    }

	    System.out.println("Menor valor: " +lowest);
	    System.out.println("Posicao: " +pos);

	}

}
