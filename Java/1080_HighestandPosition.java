import java.util.Scanner;

public class HighestandPosition1080 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int[] ary=new int[100];
		int i, temp = 0, counter = 0;
		for (i = 0; i < 100; i++) {
			ary[i] = input.nextInt();
		}
		for (i = 0; i < 100; i++) {
			if (temp < ary[i]){
				temp = ary[i];
			}
		}
		for (i = 0; ; i++) {
			counter ++;
			if (ary[i] == temp){
				break;
			}
		}
		System.out.println(temp);
		System.out.println(counter);
	}
}
