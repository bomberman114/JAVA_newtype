package teat1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class teat {

	public static void main(String[] args) {

//		 주석  ctrl + / 

		// 정수 : Integer, 문자열 : String
		// ㄴ
		// import = ctrl + shift + o

		// Hash 첫 번째 문제
		/*
		 * Hash의 Key는 정수, Value는 문자열 출력예시) Key : 1, Value : "첫 번째 타자" 1 ~ 5 까지 출력
		 */

		// 1
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		// 2
		// HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		// Ctrl+Alt+방향키 아래로 하면 빝으로 복사됨
		map1.put(1, "첫 번째 타자");
		map1.put(2, "두 번째 타자");
		map1.put(3, "세 번째 타자");
		map1.put(4, "네 번째 타자");
		map1.put(5, "다섯 번째 타자");
		System.out.println("해시 첫번째 문제");
		// 출력 1 ~ 5 HashMap 출력: .get(Key) -> value(값)
		System.out.println(map1.get(1));
		System.out.println(map1.get(2));
		System.out.println(map1.get(3));
		System.out.println(map1.get(4));
		System.out.println(map1.get(5));

		for (int i = 1; i < map1.size() + 1; i++) {
			System.out.println(map1.get(i));
		}
		System.out.println(map1);

	}
}
