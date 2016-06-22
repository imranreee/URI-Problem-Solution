import java.util.Scanner;

public class ArrayfillI1173 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int i, V;
		int[] N = new int[10];

	    V = input.nextInt();

	    for(i = 0; i < 10; i++){
	        N[i] = V;
	        V = V + V;
	    }
	    for(i = 0; i < 10; i++){
	        System.out.println("N[" +i+ "] = " +N[i]);
	    }

	}

}
