import java.util.Scanner;

public class Interval1072 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int i, N, counter = 0, counter1 = 0;
		N = input.nextInt();
		int [] ary=new int[N];
		
		for(i = 0; i < N; i++){
			ary[i] = input.nextInt();
		}
		for(i = 0; i < N; i++){
			if (ary[i] >= 10 && ary[i] <= 20) {
				counter ++;
			}
			else {
				counter1 ++;
			}
		}
		System.out.println(counter+ " in");
		System.out.println(counter1+ " out");

	}

}
