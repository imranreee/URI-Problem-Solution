import java.util.Scanner;

public class SummingConsecutiveIntegers1149 {

	public static void main(String[] args) {
		Scanner userInput=new Scanner(System.in);
		int A, N, sum = 0;
	    A = userInput.nextInt();
	    while(true){
	        N = userInput.nextInt();
	        if(N > 0){
	            break;
	        }
	    }
	    for(int i = A; i < A + N; i++){
	        sum += i;
	    }
	    System.out.println(sum);
	}

}
