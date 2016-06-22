import java.util.Scanner;

public class PrimeNumber1165 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		int i, j, N, number;

	    N = userInput.nextInt();

	    for(i = 0; i < N; i++){
	    	number = userInput.nextInt();
	        int temp = 0;

	        for(j = 2; j < number; j++){
	            if(number % j == 0){
	                temp = 1;
	            }
	        }
	        if(temp == 1){
	        	System.out.println(number+ " nao eh primo");
	        }
	        else{
	        	System.out.println(number+ " eh primo");
	        }
	    }

	}

}
