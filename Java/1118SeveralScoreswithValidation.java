import java.text.DecimalFormat;
import java.util.Scanner;

public class SeveralScoreswithValidation1118 {

	public static void main(String[] args) {
		Scanner userInput=new Scanner(System.in);
		DecimalFormat numberFormat=new DecimalFormat("#.00");
		int countr = 0, checkValue = 0;
		float score, media = 0;
		
		while(true){
			if (checkValue == 2) {
				break;
			}
			score = userInput.nextFloat();
			if (score >= 0 && score <= 10) {
				media += score;
				countr ++;
				if (countr == 2) {
					System.out.println("media = " +numberFormat.format(media/2));
					System.out.println("novo calculo (1-sim 2-nao)");
					while(true){
						checkValue = userInput.nextInt();
						if (checkValue == 2) {
							break;
						}
						if (checkValue == 1) {
							countr = 0;
							media = 0;
							break;
						}
						else {
							System.out.println("novo calculo (1-sim 2-nao)");
						}
					}
				}
			}
			else {
				System.out.println("nota invalida");
			}
		}

	}

}
