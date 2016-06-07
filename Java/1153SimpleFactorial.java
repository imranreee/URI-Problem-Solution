import java.util.Scanner;

public class SimpleFactorial1153 {

	public static void main(String[] args) {
		Scanner userInput=new Scanner(System.in);
		int answer = 1;
		int N = userInput.nextInt();
		
		for (int i = 1; i <= N; i++) {
			answer *= i; 
		}
		System.out.println(answer);
	}

}
