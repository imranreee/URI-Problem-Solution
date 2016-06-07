import java.util.Scanner;

public class SumofConsecutiveOddNumbersIII1158 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		int i, j, N, startingNumber, endingNumber;
		N = userInput.nextInt();
	    for(i = 0; i < N; i++){
	        int sum = 0, counter = 0;
	        startingNumber = userInput.nextInt();
	        endingNumber = userInput.nextInt();
	        for(j = startingNumber; ; j++){
	            if(counter == endingNumber){
	            	System.out.println(sum);
	                break;
	            }
	            if(j % 2 != 0){
	                sum += j;
	                counter ++;
	            }
	        }
	    }

	}

}
