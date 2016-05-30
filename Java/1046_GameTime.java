import java.util.Scanner;

public class GameTime1046 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int startingHour = input.nextInt();
		int endingHour = input.nextInt();
		
		if(startingHour == endingHour){
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}
		else if(startingHour < endingHour){
			System.out.printf("O JOGO DUROU %d HORA(S)\n", (endingHour - startingHour));
		}
		else if(startingHour > endingHour && endingHour != 0){
			System.out.printf("O JOGO DUROU %d HORA(S)\n", (24 - startingHour)+endingHour);
		}
		else if(endingHour == 0){
			System.out.printf("O JOGO DUROU %d HORA(S)\n", (24 - startingHour));
		}

	}

}
