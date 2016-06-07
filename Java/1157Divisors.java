import java.util.Scanner;

public class Divisors1157 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		int N, i;
		N = userInput.nextInt();
	 
	    for(i = 1; i <= N; i++){
	        if(N % i == 0){
	        	System.out.println(i);
	        }
	    }

	}

}
