import java.util.Scanner;

public class Average1040 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float firstScore = input.nextFloat();
		float secondScore = input.nextFloat();
		float thirdScore = input.nextFloat();
		float fourthScore = input.nextFloat();
		
		float media = ((firstScore * 2) + (secondScore * 3) + (thirdScore * 4) + (fourthScore * 1))/10;
		
		if(media >= 7.0 ){
			System.out.printf("Media: %.1f\n", media);
			System.out.println("Aluno aprovado.");
		}
		else if(media < 5.0 ){
			System.out.printf("Media: %.1f\n", media);
			System.out.println("Aluno reprovado.");
		}
		else if(media >= 5.0 && media <= 6.9){
			System.out.printf("Media: %.1f\n", media);
			System.out.println("Aluno em exame.");
			
			float newScore = input.nextFloat();
			System.out.printf("Nota do exame: %.1f\n", newScore);
			System.out.printf("Aluno aprovado.\n");
			
			System.out.printf("Media final: %.1f\n", (media+newScore)/2);
		}
	}

}
