import java.util.Scanner;

public class EvenSquare1073 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int i, N;
		
		N = input.nextInt();
		
		for(i = 1; i <= N; i++ ){
			if (i % 2 == 0) {
				System.out.println(i+ "^2 = " +i * i);
			}
		}

	}

}
