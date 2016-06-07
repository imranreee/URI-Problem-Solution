import java.util.Scanner;

public class Grenais1131 {

	public static void main(String[] args) {
		Scanner userInput=new Scanner(System.in);
		
		int X, Y, Z, grenais = 0, inter = 0, gremio = 0, empates = 0;
		
		while(true){
			X = userInput.nextInt();
			Y = userInput.nextInt();
	        if(X > Y){
	            inter ++;
	        }
	        else if(X < Y){
	            gremio ++;
	        }
	        else{
	            empates ++;
	        }
	        grenais ++;
	        prln("Novo grenal (1-sim 2-nao)");
	        Z = userInput.nextInt();
	        if(Z == 2){
	            break;
	        }
	    }
		prln(grenais+ " grenais");
		prln("Inter:" +inter);
		prln("Gremio:" +gremio);
		prln("Empates:" +empates);
	    if(inter > gremio){
	    	prln("Inter venceu mais");
	    }
	    else if(inter < gremio){
	    	prln("Gremio venceu mais");
	    }
	    else{
	    	prln("Nao houve vencedor");
	    }

	}
	static void prln(Object A) {
		System.out.println(A);
	}

}
