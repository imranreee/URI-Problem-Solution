import java.util.Scanner;

public class TypeofFuel1134 {

	public static void main(String[] args) {
		Scanner userInput=new Scanner(System.in);
		
		int Alcohol = 0, Gasoline = 0, Diesel = 0;
		
		while(true){
			int typeOfFuel = userInput.nextInt();
			if (typeOfFuel == 4) {
				prln("MUITO OBRIGADO");
				prln("Alcool: " +Alcohol);
				prln("Gasolina: " +Gasoline);
				prln("Diesel: " +Diesel);
				break;
			}
			else if (typeOfFuel == 1) {
				Alcohol ++;
			}
			else if (typeOfFuel == 2) {
				Gasoline ++;
			}
			else if (typeOfFuel == 3) {
				Diesel ++;
			}
		}
	}
	static void prln(Object A){
		System.out.println(A);
	}
}
