import java.util.Scanner;

public class EvenorOdd1074 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int N, i;
		N = input.nextInt();
		int[] ary=new int[N];
		
		for (i = 0; i < N; i++) {
			ary[i] = input.nextInt();
		}
		for (i = 0; i < N; i++) {
			if (ary[i] == 0) {
				prln("NULL");
			}
			else if (ary[i] % 2 == 0 && ary[i] > 0) {
				prln("EVEN POSITIVE");
			}
			else if (ary[i] % 2 == 0 && ary[i] < 0) {
				prln("EVEN NEGATIVE");
			}
			else if (ary[i] % 2 != 0 && ary[i] > 0) {
				prln("ODD POSITIVE");
			}
			else if (ary[i] % 2 != 0 && ary[i] < 0) {
				prln("ODD NEGATIVE");
			}
		}

	}
	static void prln(String A){
		System.out.println(A);
	}

}
