package array;

import java.util.ArrayList;
import java.util.List;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> arr1 = new ArrayList<Integer>();

		// 오ㄹ지 정수
		// 최소 정수 1, 최대 5
		// 하나 씩 출력
		// 마지막에 한 번에 출력

		arr1.add(1);
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(5);
		System.out.println("어레이 1번 문제 입니다.");
		for (int i = 0; i < arr1.size(); i++) {
			System.out.println(arr1.get(i));
		}
		System.out.println(arr1);

	}

}
