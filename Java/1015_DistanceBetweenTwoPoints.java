import java.util.Scanner;

public class DistanceBetweenTwoPoints1015 {

	public static void main(String[] args) {
		Scanner UIP = new Scanner (System.in);
		
		double X1 = UIP.nextDouble();
		double Y1 = UIP.nextDouble();
		double X2 = UIP.nextDouble();
		double Y2 = UIP.nextDouble();
		double Distance = Math.sqrt(Math.pow((X2 - X1),2)+Math.pow((Y2 - Y1),2));
		
		System.out.printf("%.4f\n", Distance);
	}

}
