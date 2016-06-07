import java.util.Scanner;

public class ExceedingZ1150 {

	public static void main(String[] args) {
		Scanner userInput=new Scanner(System.in);
		
		int X, Z, counter = 0, sum = 0;
		X = userInput.nextInt();
		
		while(true){
			Z = userInput.nextInt();
			if (Z > X) {
				break;
			}
		}
		for (int i = X; i < Z; i++) {
			sum += i;
			counter ++;
			if (sum > Z) {
				System.out.println(counter);
				break;
			}
		}

	}

}
