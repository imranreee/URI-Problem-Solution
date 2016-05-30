import java.util.Scanner;

public class EvenOddPositiveandNegative1066 {

	public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
		
		int [] ary=new int[5];
		int evenCounter = 0, oddCounter = 0, positiveCounter = 0, nagativeCounter = 0, i;
		
		for(i = 0; i < 5; i++){
			ary[i] = input.nextInt();
		}
		for(i = 0; i < 5; i++){
			if (ary[i] % 2 == 0) {
				evenCounter ++;
			}
			else if (ary[i] % 2 != 0) {
				oddCounter ++;
			}
			if (ary[i] > 0) {
				positiveCounter ++;
			}
			else if (ary[i] < 0) {
				nagativeCounter ++;
			}
		}
		System.out.printf("%d valor(es) par(es)\n", evenCounter);
		System.out.printf("%d valor(es) impar(es)\n", oddCounter);
		System.out.printf("%d valor(es) positivo(s)\n", positiveCounter);
		System.out.printf("%d valor(es) negativo(s)\n", nagativeCounter);
	}

}