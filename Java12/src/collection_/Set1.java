package collection_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Set1 {
	public static void main(String[] args) {
		// List, Set, Map 
		// List : 동적 배열 (순서o, 중복o)
		// Set : List에서 중복이 불가능하게함(순서x, 중복x)
		// Map : 방번호를 내가 정함, {키:값, 키:값} (키와 값의 쌍으로 구성)
		
		// Set : HashSet(순서x, 중복x), TreeSet(오름차순 정렬, 중복x)
		// Iterator : Set 전체 사용을 위해서 많이 쓰임.(Set이 순서가 없어서 순서를 할당)
		// Set : Map을 사용할 때, 중복값을 없애는 기능이 필요할 때
		HashSet<Integer> hs = new HashSet<>();	// Set은 중복이 안됨
		
		
		// 숫자 추가
		hs.add(1);
		hs.add(2);
		hs.add(4);
		hs.add(1);
		hs.add(2);
		hs.add(3);
		
		//전체조회
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//문자 추가
		TreeSet<String> ts = new TreeSet<>();
		ts.add("a");
		ts.add("b");
		ts.add("d");
		ts.add("a");
		ts.add("b");
		ts.add("c");
		
		// 전체조회
		Iterator<String> iter = ts.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
	}

}
