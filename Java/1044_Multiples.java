import java.util.Scanner;

public class Multiples1044 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int value1 = input.nextInt();
		int value2 = input.nextInt();
		
		if(value2%value1 == 0 || value1%value2 == 0){
			System.out.println("Sao Multiplos");
		}
		else{
			System.out.println("Nao sao Multiplos");
		}

	}

}
