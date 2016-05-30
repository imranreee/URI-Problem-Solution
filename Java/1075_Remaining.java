import java.util.Scanner;

public class Remaining1075 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int i, N;
		N = input.nextInt();
		
		for(i = 1; i <= 10000; i++ ){
			if (i % N == 2) {
				System.out.println(i);
			}
		}

	}

}
