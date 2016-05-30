import java.util.Scanner;

public class SimpleSort1042 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int iNum1 = num1;
		int iNum2 = num2;
		int iNum3 = num3;
		int temp = 0;
		
		if (num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if (num2 > num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		if (num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		System.out.printf("%d\n%d\n%d\n", num1, num2, num3);
		System.out.printf("\n");
		System.out.printf("%d\n%d\n%d\n", iNum1, iNum2, iNum3);
	}

}
