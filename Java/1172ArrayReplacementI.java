import java.util.Scanner;

public class ArrayReplacementI1172 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int i; 
		int[] X = new int[10];

	    for(i = 0; i < 10; i++){
	    	X[i] = input.nextInt();
	    }
	    for(i = 0; i < 10; i++){
	        if(X[i] < 0 || X[i] == 0){
	            X[i] = 1;
	        }
	    }
	    for(i = 0; i < 10; i++){
	    	System.out.println("X[" +i+ "] = " +X[i]);
	    }

	}

}
