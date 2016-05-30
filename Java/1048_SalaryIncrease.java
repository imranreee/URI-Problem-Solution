import java.util.Scanner;

public class SalaryIncrease1048 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float currentSalay = input.nextFloat();
		
		if (currentSalay >= 0 && currentSalay <= 400) {
			System.out.printf("Novo salario: %.2f\n", ((currentSalay/100) * 15)+currentSalay);
			System.out.printf("Reajuste ganho: %.2f\n", ((currentSalay/100) * 15));
			System.out.printf("Em percentual: 15 %%\n");
		}
		else if (currentSalay >= 400.01 && currentSalay <= 800) {
			System.out.printf("Novo salario: %.2f\n", ((currentSalay/100) * 12)+currentSalay);
			System.out.printf("Reajuste ganho: %.2f\n", ((currentSalay/100) * 12));
			System.out.printf("Em percentual: 12 %%\n");
		}
		else if (currentSalay >= 800.01 && currentSalay <= 1200) {
			System.out.printf("Novo salario: %.2f\n", ((currentSalay/100) * 10)+currentSalay);
			System.out.printf("Reajuste ganho: %.2f\n", ((currentSalay/100) * 10));
			System.out.printf("Em percentual: 10 %%\n");
		}
		else if (currentSalay >= 1200.01 && currentSalay <= 2000) {
			System.out.printf("Novo salario: %.2f\n", ((currentSalay/100) * 7)+currentSalay);
			System.out.printf("Reajuste ganho: %.2f\n", ((currentSalay/100) * 7));
			System.out.printf("Em percentual: 7 %%\n");
		}
		else{
			System.out.printf("Novo salario: %.2f\n", ((currentSalay/100) * 4)+currentSalay);
			System.out.printf("Reajuste ganho: %.2f\n", ((currentSalay/100) * 4));
			System.out.printf("Em percentual: 4 %%\n");
		}
	}
}
