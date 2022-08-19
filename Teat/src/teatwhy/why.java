package teatwhy;

import java.util.ArrayList;
import java.util.List;

public class why {

	public static void main(String[] args) {
		List<String> arr5 = new ArrayList<String>();
		arr5.add("사과");
		arr5.add("수박");
		arr5.add("바나나");
		arr5.add("참외");
		arr5.add("딸기");
		System.out.println("어레이 5번 문제 입니다.");
		for (int i = 0; i <= arr5.size(); i++) {
			if (arr5.get(i) == "사과") {
				System.out.println(arr5.get(i) + "는 맛있어요");
			} else if (arr5.get(i) == "수박") {
				System.out.println("아보카도");
			} else if (arr5.get(i) == "딸기") {
				System.out.println(arr5.get(i) + "는 맛있어요");
			} else
				System.out.println(arr5.get(i));

		}
	}
}