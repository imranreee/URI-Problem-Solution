import java.util.Scanner;

public class Taxes1051 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		float salary = input.nextFloat();
		float taxe;
		
		if (salary <= 2000) {
			System.out.println("Isento");
		}
		else if (salary > 2000 && salary <= 3000) {
			salary = salary - 2000;
			System.out.printf("R$ %.2f\n",(salary / 100) * 8);
		}
		else if (salary > 3000 && salary <= 4500) {
			salary = salary - 3000;
			taxe = (10 * 8) + (salary / 100) * 18;
			System.out.printf("R$ %.2f\n", taxe);
		}
		else {
			salary = salary - 4500;
			taxe = (10 * 8) + (15 * 18) + (salary / 100) * 28;
			System.out.printf("R$ %.2f\n", taxe);
		}
	}
}
