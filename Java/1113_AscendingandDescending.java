import java.util.Scanner;

public class AscendingandDescending1113 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int i, X, Y;
		
		while(true){
			X = input.nextInt();
			Y = input.nextInt();
			if (X == Y) {
				break;
			}
			else if (X < Y) {
				System.out.println("Crescente");
			}
			else {
				System.out.println("Decrescente");
			}
		}

	}

}
