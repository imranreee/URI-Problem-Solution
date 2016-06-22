import java.util.Scanner;

public class ArraySelectionI1174 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int i;
	    double[] A = new double[100];

	    for(i = 0; i < 100; i++){
	    	A[i] = input.nextDouble();
	    }
	    for(i = 0; i < 100; i++){
	        if(A[i] <= 10){
	        	System.out.printf("A[%d] = %.1f\n", i, A[i]);
	        }
	    }

	}

}
