import java.util.Scanner;

public class AlarmClock1103 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int TR1, TR2;
		
		while(true){
			int H1 = input.nextInt();
			int M1 = input.nextInt();
			int H2 = input.nextInt();
			int M2 = input.nextInt();
            if(H1 == 0 && M1 == 0 && H2 == 0 && M2 == 0){
               break;
            }

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
               System.out.printf("%d\n", TR2 - TR1);
            }
            else{
               System.out.printf("%d\n", 24*60 - (TR1-TR2));
            }
        }

	}

}
