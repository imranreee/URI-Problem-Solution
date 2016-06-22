import java.text.DecimalFormat;
import java.util.Scanner;

public class LineinArray1181 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat numberFormat = new DecimalFormat("#.0");
		
		int L, i, j;
	    float[][] M = new float[12][12]; 
	    float sum = 0;   
	    char T;

	    L = input.nextInt();
	    T = input.next().charAt(0);

	    for(i= 0; i < 12; i++){
	        for(j = 0; j < 12; j++){
	        	M[i][j] = input.nextFloat();
	        }
	    }

	    for(j = 0; j < 12; j++){
	        sum += M[L][j];
	    }

	    if(T == 'S'){
	    	System.out.println(numberFormat.format(sum));
	    }
	    else if(T == 'M'){
	    	System.out.println(numberFormat.format(sum/12.0));
	    }

	}

}
