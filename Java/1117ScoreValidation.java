import java.text.DecimalFormat;
import java.util.Scanner;

public class ScoreValidation1117 {

	public static void main(String[] args) {
		Scanner userInput=new Scanner(System.in);
		DecimalFormat numberFormat=new DecimalFormat("#.00");
		int countr = 0;
		float score, media = 0;
		
		while(true){
			score = userInput.nextFloat();
			if (score >= 0 && score <= 10) {
				media += score;
				countr ++;
				if (countr == 2) {
					System.out.println("media = " +numberFormat.format(media/2));
					break;
				}
			}
			else {
				System.out.println("nota invalida");
			}
		}

	}

}
