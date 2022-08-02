package bublesort_test;

public class bublesort1 {

	public static void BubbleSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					// 3  2
					int temp = array[j + 1]; //2
					array[j + 1] = array[j]; // 2  3
					array[j] = temp;  // 3
				}
			}
		}
	}
	
	
	
	public static void main(String[] args) {
  int [] array = {1, 3, 2,4,5,7,6,8,9,10};
  BubbleSort(array);
	for (int i : array) {
		System.out.print(i+" ");
	}

}
}
