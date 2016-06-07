import java.util.Scanner;

public class DividingXbyY1116 {

	public static void main(String[] args) {
		Scanner userInput=new Scanner(System.in);
		
		int N, i;
		float X, Y;
		N = userInput.nextInt();
		for(i = 0; i < N; i++){
			X = userInput. nextFloat();
			Y = userInput. nextFloat();
			if (X == 0) {
				prln("0.0");
			}
			else if (Y == 0) {
				prln("divisao impossivel");
			}
			else {
				prln(X/Y);
			}
		}

	}
	static void prln(Object A){
		System.out.println(A);
	}

}
