import java.util.Scanner;

public class SixOddNumbers1070 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int X = input.nextInt();
		for(int i = X; i <= X + 11; i++){
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

	}

}
