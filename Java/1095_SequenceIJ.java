public class SequenceIJ1095 {

	public static void main(String[] args) {
		int i, temp = 60;
		for (i = 1; ; i += 3) {
			if (temp == -5) {
				break;
			}
			System.out.println("I=" +i+ " J=" +temp);
			temp -= 5;
		}

	}

}
