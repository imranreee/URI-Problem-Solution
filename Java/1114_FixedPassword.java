import java.util.Scanner;

public class FixedPassword1114 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		while(true){
			int PW = input.nextInt();
			if (PW == 2002) {
				System.out.println("Acesso Permitido");
				break;
			}
			else {
				System.out.println("Senha Invalida");
			}
		}

	}

}
