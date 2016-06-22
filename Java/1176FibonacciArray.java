import java.util.Scanner;

public class FibonacciArray1176 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int i, T, N, j;

	    T = input.nextInt();

	    for(i = 0; i < T; i++){
	    	N = input.nextInt();
	        if(N == 0){
	        	System.out.println("Fib(0) = 0");
	        }
	        else if(N == 1){
	        	System.out.println("Fib(1) = 1");
	        }
	        else{
	            long num1 = 0, num2 = 1;
	            long temp = 0;

	            for(j = 2; j <= N; j++){
	                temp = num2;
	                num2 = num1 + num2;
	                num1 = temp;
	            }
	            System.out.println("Fib(" +N+ ") = " +num2);
	        }
	    }

	}

}
