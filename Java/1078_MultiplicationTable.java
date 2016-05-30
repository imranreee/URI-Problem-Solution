import java.util.Scanner;

public class MultiplicationTable1078 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int i, N;
		N = input.nextInt();
		
		for(i = 1; i <= 10; i++){
			System.out.println(i+ " x " +N+ " = " +(N * i));
		}

	}

}
