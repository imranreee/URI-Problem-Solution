import java.util.Scanner;

public class EvenBetweenfiveNumbers1065 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int [] ary=new int[5];
		int counter = 0, i;
		
		for(i = 0; i < 5; i++){
			ary[i] = input.nextInt();
		}
		for(i = 0; i < 5; i++){
			if (ary[i] % 2 == 0) {
				counter ++;
			}
		}
		System.out.printf("%d valores pares\n", counter);
	}

}
