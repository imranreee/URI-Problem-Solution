import java.util.Scanner;

public class LogicalSequence1144 {

	public static void main(String[] args) {
    Scanner userInput=new Scanner(System.in);
		
    int i, j, X = 0, NOTC;
    NOTC = userInput.nextInt();
    for(i = 1; i <= NOTC; i++){
    	System.out.print(i+ " ");
        for(j = 0; j < 1; j++){
            X = i * i;
            System.out.print(X+ " ");
        }
        for(j = 0; j < 1; j++){
        	System.out.println(X * i);
        }
        System.out.print(i+ " ");
        for(j = 0; j < 1; j++){
            X = i * i;
            System.out.print((X + 1)+ " ");
        }
        for(j = 0; j < 1; j++){
        	System.out.println((X * i) + 1 );
        }
      }

	}
}
