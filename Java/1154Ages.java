import java.text.DecimalFormat;
import java.util.Scanner;

public class Ages1154 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		DecimalFormat outputFormat = new DecimalFormat("#.00");
		
		int N; 
		float sum = 0, counter = 0;
		while(true){
			N = userInput.nextInt();
			if (N < 0) {
				System.out.println(outputFormat.format(sum / counter));
				break;
			}
			else {
				sum += N;
				counter ++;
			}
		}

	}

}
