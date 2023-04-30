package collection_;

import java.util.HashMap;
import java.util.Set;

public class Map1 {
	public static void main(String[] args) {
		// 배열, List, Set, Map
		// Map : 키와 값을 쌍으로 정해주고 싶을 때
		// {"일":"a", "이","b",...}
		
		//추가:put, 조회:get, 삭제:remove(key를 삭제해야 함)
		HashMap<Integer,String> hm = new HashMap<>();	//키:값
		// hm.put(2, 2); 자료형이 맞지 않는 경우 오류 발생
		hm.put(1, "일");
		hm.put(2, "이");
		hm.put(2, "이중복");
		hm.put(2, "이중복2");
		hm.put(3, "삼");
		
		hm.remove(2);

		Set<Integer> set = hm.keySet();	//set으로 key를 뺌
		for(int e : set) {
			System.out.print(e+" ");
			System.out.println(hm.get(e));	//key 값을 가져 올 수 있음.
		}
		
		boolean isTrue = hm.containsKey(4);
		boolean isTrue2 = hm.containsKey(3);
		boolean isTrue3 = hm.containsValue("삼");
		System.out.println(isTrue);
		System.out.println(isTrue2);
		System.out.println(isTrue3);
	}

}
