package review;

import java.util.ArrayList;

public class Review {
	public static void main(String[] args) {
		MyReview mr = new MyReview();
		mr.go();
	}
}
class MyReview{
	//멤버변수 private
	String str1;
	String str2;
	String str3;
	String str[] = new String[3];	//고정배열
	ArrayList<String> list = new ArrayList<>();	//동적배열
	
	//메서드 public
	public void go() {
		list.add("String1");
		list.add("String2");
		
		list.set(0, "String0");
		
		list.add(1, "String1");
		
		int idx = list.indexOf("String1");
		
		list.remove(1);
		
		list.get(0);
		
		for(int i=0;i<list.size();i++) {
			String getStr = list.get(i);
			System.out.println(getStr);
		}
		
	}
	
}