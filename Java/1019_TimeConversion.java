import java.util.Scanner;

public class TimeConversion1019 {

	public static void main(String[] args) {
		Scanner UIP = new Scanner(System.in);
		int[] Ar = {3600, 60, 1};
		int counter = 0;
		int Second = UIP.nextInt();
		for(int i = 0; i < 3; i++){
			System.out.printf("%d", Second/Ar[i]);
			int Carry = Second%Ar[i];
			Second = Carry;
			counter ++;
			if(counter < 3){
				System.out.printf(":");
			}
			if(counter == 3){
				System.out.printf("\n");
			}
		}

	}

}
