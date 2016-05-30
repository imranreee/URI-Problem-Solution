import java.util.Scanner;

public class Month1052 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int number = input.nextInt();
		
		switch (number) {
		case 1:
			prln("January");
			break;
		case 2:
			prln("February");
			break;
		case 3:
			prln("March");
			break;
		case 4:
			prln("April");
			break;
		case 5:
			prln("May");
			break;
		case 6:
			prln("June");
			break;
		case 7:
			prln("July");
			break;
		case 8:
			prln("August");
			break;
		case 9:
			prln("September");
			break;
		case 10:
			prln("October");
			break;
		case 11:
			prln("November");
			break;
		case 12:
			prln("December");
			break;
		default:
			break;
		}
	}
	static void prln(String A){
		System.out.println(A);
	}

}
