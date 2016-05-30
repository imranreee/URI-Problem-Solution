import java.util.Scanner;

public class TriangleTypes1045 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double [] Ar = new double [3];
		double temp;
		double A, B, C;
		int i, j;
		Ar[0] = input.nextDouble();
		Ar[1] = input.nextDouble();
		Ar[2] = input.nextDouble();
		
		for(i = 0; i < 2; i++){
	        for(j = 0+i; j < 3; j++){
	            if(Ar[i] < Ar[j]){
	                temp = Ar[i];
	                Ar[i] = Ar[j];
	                Ar[j] = temp;
	            }
	        }
	    }
	    A = Ar[0];
	    B = Ar[1];
	    C = Ar[2];
	    if(A >= B + C){
	        System.out.println("NAO FORMA TRIANGULO");
	    }
	    else{
	        if((Math.pow(A,2)) == (Math.pow(B,2) + Math.pow(C,2))){
	            System.out.println("TRIANGULO RETANGULO");
	        }
	        if((Math.pow(A,2)) > (Math.pow(B,2) + Math.pow(C,2))){
	            System.out.println("TRIANGULO OBTUSANGULO");
	        }
	        if((Math.pow(A,2)) < (Math.pow(B,2) + Math.pow(C,2))){
	            System.out.println("TRIANGULO ACUTANGULO");
	        }
	        if((A == B && B != C) || (B == C && C != A) || (C == A) && A != B){
	            System.out.println("TRIANGULO ISOSCELES");
	        }
	        if(A == B && B == C){
	            System.out.println("TRIANGULO EQUILATERO");
	       }
	    }
		
	}

}
