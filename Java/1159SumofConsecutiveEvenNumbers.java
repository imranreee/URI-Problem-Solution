import java.util.Scanner;

public class SumofConsecutiveEvenNumbers1159 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		while(true){
	        int sum = 0, counter = 0, N;
	        N = userInput.nextInt();
	        if(N == 0){
	            break;
	        }
	        else{
	            for(int i = N; ; i++){
	                if(counter == 5){
	                	System.out.println(sum);
	                    break;
	                }
	                else if(i % 2 == 0){
	                    sum += i;
	                    counter ++;
	                }
	            }
	        }
	    }

	}

}
