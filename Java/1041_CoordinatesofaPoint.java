import java.util.Scanner;

public class CoordinatesofaPoint1041 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float xCoordinate = input.nextFloat();
		float yCoordinate = input.nextFloat();
		
		if(xCoordinate == 0 && yCoordinate == 0){
			System.out.println("Origem");
		}
		else if(xCoordinate == 0){
			System.out.println("Eixo Y");
		}
		else if(yCoordinate== 0){
			System.out.println("Eixo X");
		}
		else {
			if(xCoordinate > 0 && yCoordinate > 0){
				System.out.println("Q1");
			}
			else if(xCoordinate < 0 && yCoordinate > 0){
				System.out.println("Q2");
			}
			else if(xCoordinate < 0 && yCoordinate < 0){
				System.out.println("Q3");
			}
			else {
				System.out.println("Q4");
			}
		}

	}

}
