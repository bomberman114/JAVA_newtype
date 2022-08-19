package hashmytype;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hash {
	public static void map1() {
	Map<Integer, String> map1 = new HashMap<Integer, String>();
	System.out.println("Hash 첫번째 문제입니다.");
	map1.put(1, "첫 번째 타자");
	map1.put(2, "두 번째 타자");
	map1.put(3, "세 번째 타자");
	map1.put(4, "네 번째 타자");
	map1.put(5, "다섯 번째 타자");
	 
	for(int i =1; i < map1.size()+1 ; i++) {
		System.out.println(map1.get(i));
	}
		System.out.println(map1);
	}
	public static void map2() {
		Map<String, String> map2 = new HashMap<String, String>();
		System.out.println("Hash 두번쨰 문제 입니다.");
		map2.put("1", "첫 번째 타자");
		map2.put("2", "두 번째 타자");
		map2.put("3", "세 번째 타자");
		map2.put("4", "네 번째 타자");
		map2.put("5", "다섯 번째 타자");
		for(int i = 1; i < map2.size()+1; i++) {
			System.out.println(map2.get(i+""));
		}
	}
	public static void map3() {
		System.out.println("Hash 두번쨰 문제 입니다.");
		Map<Object, Object> map3 = new HashMap<Object, Object>();
		map3.put(1, "첫번쨰 타자 입니다.");
		map3.put("2", "두번쨰 타자 입니다.");
		map3.put(3, "세번쨰 타자 입니다.");
		map3.put("4", "네번쨰 타자 입니다.");
		map3.put(5, "다섯번쨰 타자 입니다.");
		for(int i= 1 ; i < map3.size()+1; i++) {
			if(map3.get(i) != null) {
				System.out.println(map3.get(i));
			}
			else 
				System.out.println(map3.get(i+""));
			
			}
		}
	
	public static void main(String[] args) {
		System.out.println("보고싶은 출력의 번호를 입력해주세요(1~3까지 입력)");
		Scanner sc = new Scanner(System.in);
		int check = sc.nextInt();
		switch (check) {
		case 1: map1(); break;
		case 2: map2(); break;
		case 3: map3(); break;
		default: System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
		
		}
		sc.close();
		

	}

}
