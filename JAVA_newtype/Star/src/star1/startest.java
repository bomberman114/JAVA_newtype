package star1;

public class startest {

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {            // 0     1    2
			for (int j = 0; j < 3 - i; j++) {    // 012  01    0
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {// 0    012   01234
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
