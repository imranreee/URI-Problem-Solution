import java.text.DecimalFormat;

public class SSequence1155 {

	public static void main(String[] args) {
		DecimalFormat outputFormat = new DecimalFormat("#.00");
		float S = 0;
		for (int i = 1; i <= 100; i++) {
			S += (float)1/(float)i;
		}
		System.out.println(outputFormat.format(S));
	}

}
