import java.util.Scanner;

public class PositiveNumbers1060 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int i, counter = 0;
		float [] ary=new float[6];
		
		for(i = 0; i < 6; i++){
			ary[i] = input.nextFloat();
		}
		for(i = 0; i < 6; i++){
			if (ary[i] > 0) {
				counter ++;
			}
		}
		System.out.printf("%d valores positivos\n", counter);
	}

}
