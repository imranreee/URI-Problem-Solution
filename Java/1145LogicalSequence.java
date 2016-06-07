import java.util.Scanner;

public class LogicalSequence1145 {

	public static void main(String[] args) {
		Scanner userInput=new Scanner(System.in);
		
		int X, Y, i, j, counter = 0;
		X = userInput.nextInt();
		Y = userInput.nextInt();
		 for(i = 1; i <= Y; i++){
		    counter ++;
		    System.out.print(i);
		    if(counter == X){
		    System.out.println();
		       counter = 0;
		    }
		    else{
		    	System.out.print(" ");
		    }
		 }

	}

}
