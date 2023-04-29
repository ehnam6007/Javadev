package collection_;

import java.util.ArrayList;

public class List1 {
	public static void main(String[] args) {
		//자바에서는 최상단 클래스인 object가 존재.
		// 모든 자바에서 제공해주는 클래스는 object를 상속받음.
		// 그 중 List라는 클래스가 있음(배열의 어려운점을 자동화해주는 클래스)
		// List를 상속해서 ArrayList라는 클래스를 자바에서 제공해주고 ArrayList로 주로 사용됨
		
		//ArrayList는 다른 패키지에 있기 때문에 util.ArrayList를 import
		ArrayList<String> arr1 = new ArrayList<>();		//String 배열
		ArrayList<Integer> arr2 = new ArrayList<>();	//int 배열
		ArrayList<Double> arr3 = new ArrayList<>();		//double 배열(가변 배열)
		
		String str[] = new String[10];
		int num[] = new int[10];
		double dnum[] = new double[10];		//고정 배열
		
		// 추가하려면 add()
		arr2.add(1);
		arr2.add(2);
		
		// 사용하려면 get()
		System.out.println(arr2.get(0));	//0번방의 값
		
		//전부 다 보고 싶으면 size()
		for(int i=0;i<arr2.size();i++) {
			System.out.println(arr2.get(i)); 	//배열의 경우 값을 넣지 않은 공간에 대해서는 if문 처리
		}
		
	}

}
