import java.util.Scanner;

public class Quadrant1115 {

	public static void main(String[] args) {
		Scanner userInput=new Scanner(System.in);
		int X, Y;
		
		while(true){
			X = userInput.nextInt();
			Y = userInput.nextInt();
			if (X == 0 || Y == 0) {
				break;
			}
			else if (X > 0 && Y > 0) {
				prln("primeiro");
			}
			else if (X > 0 && Y < 0) {
				prln("quarto");
			}
			else if (X < 0 && Y < 0) {
				prln("terceiro");
			}
			else{
				prln("segundo");
			}
		}
	}
	static void prln(Object A) {
		System.out.println(A);
	}
}
