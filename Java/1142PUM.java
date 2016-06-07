import java.util.Scanner;

public class PUM1142 {

	public static void main(String[] args) {
		Scanner userInput=new Scanner(System.in);
		int temp = 1;
		int N = userInput.nextInt();
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print((temp + i)+ " ");
				temp ++;
			}
			System.out.println("PUM");
		}

	}

}
