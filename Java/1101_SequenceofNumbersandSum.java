import java.util.Scanner;

public class SequenceofNumbersandSum1101 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int i, M, N, temp;
		while(true){
			temp = 0;
			M = input.nextInt();
			N = input.nextInt();
			if (M == 0 || N == 0 || M < 0 || N < 0) {
				break;
			}
			if (M < N) {
				for (i = M; i <= N; i++) {
					System.out.print(i+ " ");
					temp += i;
				}
				System.out.println("Sum=" +temp);
			}
			else{
				for (i = N; i <= M; i++) {
					System.out.print(i+ " ");
					temp += i;
				}
				System.out.println("Sum=" +temp);
			}
		}

	}

}
