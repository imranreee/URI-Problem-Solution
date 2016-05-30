
import java.util.Scanner;

public class GameTime1047 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int TR1, TR2;
			int H1 = input.nextInt();
			int M1 = input.nextInt();
			int H2 = input.nextInt();
			int M2 = input.nextInt();
            if(H1 == 0){
               TR1 = 24*60 + M1;
            }
            else{
               TR1 = H1*60 + M1;
            }

            if(H2 == 0){
               TR2 = 24*60 + M2;
            }
            else{
               TR2 = H2*60 + M2;
            }

            if(TR2 > TR1){
               System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", (TR2 - TR1)/60, (TR2 - TR1)%60);
            }
            else{
               System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", (24*60 - (TR1-TR2))/60, (24*60 - (TR1-TR2))%60);
            }

	}

}
