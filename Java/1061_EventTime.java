import java.util.Scanner;

public class EventTime1061 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int SD, SH, SM, SS;
		int ED, EH, EM, ES;
		int D = 0, H = 0, M = 0, S = 0;
		int TR1, TR2;
		char c;
		String SDN, EDN;
		
		SDN = input.next();
		SD = input.nextInt();
		SH = input.nextInt();
		c = input.next().charAt(0);
		SM = input.nextInt();
		c = input.next().charAt(0);
		SS = input.nextInt();
		EDN = input.next();
		ED = input.nextInt();
		EH = input.nextInt();
		c = input.next().charAt(0);
		EM = input.nextInt();
		c = input.next().charAt(0);
		ES = input.nextInt();
		
		if (SH == EH && SM == EM && SS == ES) {
			D = ED - SD;
			System.out.printf("%d dia(s)\n", D);
			System.out.printf("%d hora(s)\n", H);
			System.out.printf("%d minuto(s)\n", M);
			System.out.printf("%d segundo(s)\n", S);
		}
		else {
			if (SH > EH) {
				D = (ED - SD) - 1;
			}
			else {
				D = ED - SD;
			}
			if (SH == 0) {
				TR1 = (((24 * 60) + SM) * 60) + SS;
			}
			else {
				TR1 = (((SH * 60) + SM) * 60) + SS;
			}
			if (EH == 0) {
				TR2 = (((24 * 60) + EM) * 60) + ES;
			}
			else {
				TR2 = (((EH * 60) + EM) * 60) + ES;
			}
			if (TR2 > TR1) {
				H = (TR2 - TR1) / 3600;
				M = ((TR2 - TR1) % 3600) / 60;
				S = ((TR2 - TR1) % 3600) % 60;
			}
			else {
				H = (24 * 3600 - (TR1 - TR2)) / 3600;
				M = ((24 * 3600 - (TR1 - TR2)) % 3600) / 60;
				S = ((24 * 3600 - (TR1 - TR2)) % 3600) % 60;
			}
			System.out.printf("%d dia(s)\n", D);
			System.out.printf("%d hora(s)\n", H);
			System.out.printf("%d minuto(s)\n", M);
			System.out.printf("%d segundo(s)\n", S);
		}

	}

}
