import java.util.Scanner;

public class DDD1050 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int DDD = input.nextInt();
		
		switch (DDD) {
		case 61:
			prln("Brasilia");
			break;
		case 71:
			prln("Salvador");
			break;
		case 11:
			prln("Sao Paulo");
			break;
		case 21:
			prln("Rio de Janeiro");
			break;
		case 32:
			prln("Juiz de Fora");
			break;
		case 19:
			prln("Campinas");
			break;
		case 27:
			prln("Vitoria");
			break;
		case 31:
			prln("Belo Horizonte");
			break;

		default:
			prln("DDD nao cadastrado");
			break;
		}

	}
	static void prln(String A){
		System.out.println(A);
	}
}
