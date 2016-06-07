import java.util.Scanner;

public class PopulationIncrease1160 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		int i, T, PA, PB;
	    float G1, G2;

	    T = userInput.nextInt();

	    for(i = 0; i < T; i++){
	    	PA = userInput.nextInt();
	    	PB = userInput.nextInt();
	    	G1 = userInput.nextFloat();
	    	G2 = userInput.nextFloat();

	        int years = 0;
	        int temp = 0;

	        while(PA <= PB){
	            PA += PA * G1 / 100;
	            PB += PB * G2 / 100;
	            years ++;

	            if(years > 100){
	                temp = 1;
	                break;
	            }
	        }
	        if(temp == 1){
	        	System.out.println("Mais de 1 seculo.");
	        }
	        else{
	        	System.out.println(years+ " anos.");
	        }
	    }

	}

}
