import java.util.Scanner;

public class BanknotesandCoins1021 {

	public static void main(String[] args) {
		Scanner UIP = new Scanner(System.in);
		
		double TotalAmount = UIP.nextDouble();
		int ConvertTotalAmount = (int)(TotalAmount * 100);
		int[] Ary = {10000, 5000, 2000, 1000, 500, 200};
		int[] Ary2 = {100, 50, 25, 10, 05, 01};
		int i;
		
		System.out.printf("NOTAS:\n");
		for(i = 0; i < 6; i++){
			System.out.printf("%d nota(s) de R$ %d.00\n", ConvertTotalAmount/Ary[i], Ary[i]/100);
			ConvertTotalAmount = ConvertTotalAmount % Ary[i];
		}
		
		System.out.printf("MOEDAS:\n");
		for(i = 0; i < 6; i++){
			System.out.printf("%d moeda(s) de R$ %.2f\n", ConvertTotalAmount/Ary2[i],(float) Ary2[i]/100);
			ConvertTotalAmount = ConvertTotalAmount % Ary2[i];
		}
	}
}
