import java.util.Scanner;

public class WeighteAverages1079 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int i, N;		
        float[] ary2 = {2, 3, 5};
        N = input.nextInt();
        float[][] ary=new float[N][3];
        float answer = 0;
        
        for (i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++) {
				ary[i][j] = input.nextFloat();
			}
		}
        for (i = 0; i < N; i++) {
        	answer = 0;
			for (int j = 0; j < 3; j++) {
				answer += ary[i][j] * ary2[j];
			}
			System.out.printf("%.1f\n", answer / 10.0);
		}
	}

}
