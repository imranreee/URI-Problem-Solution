import java.util.Scanner;

public class Banknotes1018 {
	public static int cry;

	public static void main(String[] args) {
		Scanner UIP = new Scanner(System.in);
		
		int N = UIP.nextInt();
        System.out.printf("%d\n", N);
        System.out.printf("%d nota(s) de R$ 100,00\n", N / 100);
        cry = N % 100;
        System.out.printf("%d nota(s) de R$ 50,00\n", cry / 50);
        cry = cry % 50;
        System.out.printf("%d nota(s) de R$ 20,00\n", cry / 20);
        cry = cry % 20;
        System.out.printf("%d nota(s) de R$ 10,00\n", cry / 10);
        cry = cry % 10;
        System.out.printf("%d nota(s) de R$ 5,00\n", cry / 5);
        cry = cry % 5;
        System.out.printf("%d nota(s) de R$ 2,00\n", cry / 2);
        cry = cry % 2;
        System.out.printf("%d nota(s) de R$ 1,00\n", cry / 1);
	}

}
