import java.util.Scanner;

public class PerfectNumber1164 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		int i, j, numberOfTC, number;
		numberOfTC = userInput.nextInt();

	    for(i = 0; i < numberOfTC; i++){
	        int sum = 0;
	        number = userInput.nextInt();
	        for(j = 1; j < number; j++){
	            if(number % j == 0){
	                sum += j;
	            }
	        }
	        if(sum == number){
	           System.out.println(number+ " eh perfeito");
	        }
	        else{
	            System.out.println(number+ " nao eh perfeito");
	        }
	    }

	}

}
