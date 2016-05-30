import java.util.Scanner;

public class Snack1038 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int productCode = input.nextInt();
		int productQuantity = input.nextInt();
		
		switch (productCode) {
		case 1: System.out.printf("Total: R$ %.2f\n", 4.00 * productQuantity);
			break;
		case 2: System.out.printf("Total: R$ %.2f\n", 4.50 * productQuantity);
		    break;
		case 3: System.out.printf("Total: R$ %.2f\n", 5.00 * productQuantity);
	        break;
		case 4: System.out.printf("Total: R$ %.2f\n", 2.00 * productQuantity);
	    	break;
		case 5: System.out.printf("Total: R$ %.2f\n", 1.50 * productQuantity);
	    	break;
		default:
			break;
		}

	}

}
