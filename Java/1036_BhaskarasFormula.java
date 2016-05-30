import java.util.Scanner;


public class BhaskarasFormula1036 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float a = input.nextFloat();
		float b = input.nextFloat();
		float c = input.nextFloat();
		double rot = Math.pow((b), 2) - 4 * a * c;
		
		if(a == 0 || rot < 0){
			System.out.println("Impossivel calcular");
		}
		else{
			float answer1 = (float) (-b + Math.sqrt(rot))/(2*a);
			float answer2 = (float) (-b - Math.sqrt(rot))/(2*a);
			System.out.printf("R1 = %.5f\n", answer1);
			System.out.printf("R2 = %.5f\n", answer2);
		}
	}

}
