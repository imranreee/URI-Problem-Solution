import java.util.Scanner;

public class AgeinDays1020 {

	public static void main(String[] args) {
		Scanner UIP = new Scanner(System.in);
		
		int Day = UIP.nextInt();
		System.out.printf("%d ano(s)\n", Day / 365);
		int carry = Day % 365;
		Day = carry;
		System.out.printf("%d mes(es)\n", Day / 30);
		carry = Day % 30;
		Day = carry;
		System.out.printf("%d dia(s)\n", Day);
	}

}
