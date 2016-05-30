import java.util.Scanner;

public class Consumption1014 {

	public static void main(String[] args) {
		Scanner UIP = new Scanner (System.in);
		
		int X = UIP.nextInt();
		float Y = UIP.nextFloat();
		float Z = X / Y;
        
		System.out.printf("%.3f km/l\n", Z);
	}

}
