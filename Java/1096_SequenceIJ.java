
public class SequenceIJ1096 {

	public static void main(String[] args) {
		int i, j, temp1 = 1, temp2;
		
		for (i = 0; ; i++) {
			temp2 = 7;
			if (temp1 == 11) {
				break;
			}
			for (j = 0; j < 3 ; j++) {
				System.out.println("I=" +temp1+ " J=" +temp2);
				temp2 -= 1;
			}
			temp1 += 2;
		}

	}

}
