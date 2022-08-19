package code;

import java.util.ArrayList;
import java.util.List;

public class code {

	public static void main(String[] args) {

		List<Integer> arr6 = new ArrayList<Integer>();
		arr6.add(12);
		arr6.add(23);
		arr6.add(3);
		arr6.add(40);
		arr6.add(15);
		arr6.add(26);
		arr6.add(27);
		arr6.add(8);
		arr6.add(93);
		arr6.add(10);
		System.out.println("어레이 6번문제 입니다.");
		int i = 0;
		while (i <= arr6.size()) {
			int a = arr6.get(i);
			i++;
			int s = arr6.get(i);
			System.out.println(
					String.format("%d 는 %d 보다%d만큼 작다",a,s,a-s));
			
		}

	}

}
