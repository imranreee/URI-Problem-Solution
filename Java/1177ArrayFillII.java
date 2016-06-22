import java.util.Scanner;

public class ArrayFillII1177 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int T, value = 0;
	    int[] N = new int[1000];

	    T = input.nextInt();

	    for(int i = 0; i < 1000; i++){
	        N[i] = value;
	        value ++;
	        if(value == T){
	            value = 0;
	        }
	    }
	    for(int i = 0; i < 1000; i++){
	    	System.out.println("N[" +i+ "] = " +N[i]);
	    }

	}

}
