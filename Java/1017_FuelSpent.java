import java.util.Scanner;

public class FuelSpent1017 {

	public static void main(String[] args) {
		Scanner UIP = new Scanner(System.in);
		
		float X = UIP.nextFloat();
		float Y = UIP.nextFloat();
        
		System.out.printf("%.3f\n", (X * Y) / 12);
	}

}
