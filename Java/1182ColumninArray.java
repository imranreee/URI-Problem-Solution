import java.util.Scanner;

public class ColumninArray1182 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int C, i, j;
	    float[][] M = new  float [12][12];
	    float sum = 0;
	    char T;
	    
	    C = input.nextInt();
	    T = input.next().charAt(0);

	    for(i= 0; i < 12; i++){
	        for(j = 0; j < 12; j++){
	        	M[i][j] = input.nextFloat();
	        }
	    }

	    for(i = 0; i < 12; i++){
	        sum += M[i][C];
	    }

	    if(T == 'S'){
	        System.out.printf("%.1f\n", sum);
	    }
	    else if(T == 'M'){
	    	System.out.printf("%.1f\n", sum / 12.0);
	    }

	}

}
