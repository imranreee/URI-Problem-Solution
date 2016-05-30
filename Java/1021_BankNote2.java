import java.util.Scanner;

public class BankNote2 {
	public static int Carry;

	public static void main(String[] args) {
		Scanner UIP = new Scanner(System.in);
		
		int A = 0;
		int N = UIP.nextInt();
		int[] BNot = {100, 50, 20, 10, 5, 2, 1};
		System.out.printf("%d\n", N);
		for(int i = 0; i < 7; i++){
	        System.out.printf("%d nota(s) de R$ %d,00\n",N / BNot[A], BNot[A]);
	        Carry = N%BNot[A];
	        N = Carry;
	        A ++;
		}

	}

}
