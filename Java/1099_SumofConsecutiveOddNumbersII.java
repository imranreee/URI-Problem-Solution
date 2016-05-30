import java.util.Scanner;

public class SumofConsecutiveOddNumbersII1099 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int N, i, j, temp, X, Y;
		N = input.nextInt();
		for (i = 0; i < N; i++) {
			temp = 0;
			X = input.nextInt();
			Y = input.nextInt();
			if (X > Y) {
				for (j = Y + 1; j < X; j++) {
					if (j % 2 != 0) {
						temp += j;
					}
				}
			}
			else if(Y > X || Y == X){
				for (j = X + 1; j < Y; j++) {
					if (j % 2 != 0) {
						temp += j;
					}
				}
			}
			System.out.println(temp);
		}

	}

}
