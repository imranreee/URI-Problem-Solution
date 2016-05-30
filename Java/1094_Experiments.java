import java.util.Scanner;

public class Experiments1094 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int a, N, i, total, total_C = 0, total_R = 0, total_S = 0;
		float w, x, y, z;
		char b;
		
		N = input.nextInt();
		for(i= 0; i < N; i++){
			a = input.nextInt();
			b = input.next().charAt(0);
			if(b == 'C'){
				total_C += a;
			}
			else if(b == 'R'){
				total_R += a;
			}
			else if(b == 'S'){
				total_S += a;
			}
		}
		total = (total_C + total_R + total_S);
		
		w =(float) (100.00/total);
		x = w*(float)total_C;
		y = w*(float)total_R;
		z = w*(float)total_S;
		
		System.out.printf("Total: %d cobaias\nTotal de coelhos: %d\n",total, total_C);
		System.out.printf("Total de ratos: %d\nTotal de sapos: %d\n",total_R, total_S);
		System.out.printf("Percentual de coelhos: %.2f %%\n", x);
		System.out.printf("Percentual de ratos: %.2f %%\n", y);
		System.out.printf("Percentual de sapos: %.2f %%\n", z);

	}

}
