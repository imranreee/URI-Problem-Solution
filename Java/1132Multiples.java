import java.util.Scanner;

public class Multiples1132 {

	public static void main(String[] args) {
		Scanner userInput=new Scanner(System.in);
		
        int X, Y, answer = 0;	
        
        X = userInput.nextInt();
        Y = userInput.nextInt();
        
        if (X < Y) {
        	for (int i = X; i <= Y; i++) {
    			if (i % 13 != 0) {
					answer += i;
				}
    		}
		}
        else {
        	for (int i = Y; i <= X; i++) {
    			if (i % 13 != 0) {
					answer += i;
				}
    		}
		}
        System.out.println(answer);
	}

}
