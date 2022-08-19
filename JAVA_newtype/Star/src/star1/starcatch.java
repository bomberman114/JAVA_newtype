package star1;

public class starcatch {
	public static void pyramid() {
		for (int i = 0; i < 4; i++) { // 0
			for (int j = 1; j < 9; j++) { // 1
				if (j < 4 - i || i + 5 < j + 1) {// 1<3
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
			System.out.println("");
		}
	}

	public static void half_triangle1() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (j < i + 1)
					System.out.print("*");
			}
			System.out.print(" ");
			System.out.println("");
		}
	}

	public static void half_triangle2() {
		for (int i = 0; i < 4; i++) {
			for (int j = 4; j > 0; j--) {
				if (j > i + 1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
	public static void Diamond() {
		for (int i = 1; i < 8; i++) {                    //  1          1    1           2 
			for (int j = 0; j < 9; j++) {               //  0          4    5            3,4,5    6,7,8
				if (j<5-i||j<i-3||12<j+i+1||i+4<j+1) { //  0<4-1+1=4  !=  4. 1+4<5+1    " "
				System.out.print("*");
			} else { System.out.print(" ");  //  5
			}                                //  0
		}                                    //  
	System.out.println("");
		}
}
	
	public static void main(String[] args) {
		//pyramid();
        //half_triangle1();
		// half_triangle2();
	    // Diamond();
	}
}
