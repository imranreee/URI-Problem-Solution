import java.util.Scanner;

public class SquaredandCubic1142 {

	public static void main(String[] args) {
		Scanner userInput=new Scanner(System.in);
		
		int temp;
		int N = userInput.nextInt();
		
		for (int i = 1; i <= N; i++) {
			temp = i;
			System.out.print(i);
			for (int j = 0; j < 2; j++) {
				System.out.print(" " +i * temp);
				temp = i * temp;
			}
			System.out.println();
		}

	}

}
