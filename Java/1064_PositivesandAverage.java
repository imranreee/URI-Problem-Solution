import java.util.Scanner;

public class PositivesandAverage1064 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		float [] ary=new float[7];
		float average, temp = 0;
		int counter = 0, i;
		
		for(i = 0; i < 6; i++){
			ary[i] = input.nextFloat();
		}
		for(i = 0; i < 6; i++){
			if (ary[i] > 0) {
				counter ++;
				temp += ary[i];
			}
		}
		System.out.printf("%d valores positivos\n", counter);
		System.out.printf("%.1f\n", temp / counter);

	}

}
