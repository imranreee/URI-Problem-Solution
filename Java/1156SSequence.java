import java.text.DecimalFormat;

public class SSequence1156 {

	public static void main(String[] args) {
		DecimalFormat outputFormat = new DecimalFormat("#.00");
		float S = 1, temp = 2;
	    for(int i = 3; i <= 39; i += 2){
	        S += (float)i / temp;
	        temp *= 2;
	    }
	    System.out.println(outputFormat.format(S));
	}

}
