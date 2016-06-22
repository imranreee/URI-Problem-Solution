import java.util.Scanner;

public class ArraychangeI1175 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int i, temp = 19; 
		int[] N = new int[20], Ary = new int[20];

	    for(i = 0; i < 20; i++){
	    	Ary[i] = input.nextInt();
	    }
	    for(i = 0; i < 10; i++){
	        N[i] = Ary[temp];
	        temp --;
	    }
	    for(i = 10; i < 20; i++){
	        N[i] = Ary[temp];
	        temp --;
	    }
	    for(i = 0; i < 20; i++){
	    	System.out.println("N[" +i+ "] = " +N[i]);
	    }

	}

}
