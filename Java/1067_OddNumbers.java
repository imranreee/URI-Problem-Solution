import java.util.Scanner;

public class OddNumbers1067 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int X = input.nextInt();
		
		for(int i = 1; i <= X; i++){
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

	}

}
