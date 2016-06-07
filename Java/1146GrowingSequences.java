import java.util.Scanner;

public class GrowingSequences1146 {

	public static void main(String[] args) {
		Scanner userInput=new Scanner(System.in);
		while(true){
			int X = userInput.nextInt();
			if (X == 0) {
				break;
			}
			for (int i = 1; i <= X; i++) {
				System.out.print(i);
				System.out.printf((i == X) ? "\n" : " ");
			}
		}

	}
}
