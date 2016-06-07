import java.util.Scanner;

public class EasyFibonacci1151 {

	public static void main(String[] args) {
		Scanner userInput=new Scanner(System.in);
		int N, temp = 0;
		int firstNumber = 0;
		int secondNumber = 1;
		N = userInput.nextInt();
		System.out.print(firstNumber+ " ");
		System.out.print(secondNumber+ " ");
		for (int i = 0; i < N - 2; i++) {
			System.out.print(firstNumber + secondNumber);
			System.out.printf((i == N - 3)? "\n" : " ");
			temp = secondNumber;
			secondNumber = firstNumber + secondNumber;
			firstNumber = temp;
			
		}
	}

}
