import java.util.Scanner;

public class RestofaDivision1133 {

	public static void main(String[] args) {
	Scanner userInput=new Scanner(System.in);
		
        int X, Y, answer = 0;	
        
        X = userInput.nextInt();
        Y = userInput.nextInt();
        
        if (X < Y) {
        	for (int i = X+1; i < Y; i++) {
    			if (i % 5 == 2 || i % 5 == 3) {
    				System.out.println(i);
				}
    		}
		}
        else {
        	for (int i = Y+1; i < X; i++) {
    			if (i % 5 == 2 || i % 5 == 3) {
    				System.out.println(i);
				}
    		}
		}
	}

}
