import java.util.Scanner;

public class SumofConsecutiveOddNumbers1071 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int X, Y, i, answer = 0;
		
		X = input.nextInt();
		Y = input.nextInt();
		
		if (X < Y) {
			for(i = X+1; i < Y; i++){
				if (i % 2 != 0) {
					answer += i;
				}
			}
			System.out.println(answer);
		}
		else {
			for(i = Y+1; i < X; i++){
				if (i % 2 != 0) {
					answer += i;
				}
			}
			System.out.println(answer);
		}

	}

}
