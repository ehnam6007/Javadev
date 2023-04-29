package review;

public class Array1 {
	public static void main(String[] args) {
		Arr1 ar = new Arr1();
		ar.go();
	}
	

}
class Arr1{
	public void go() {
		System.out.println("객체화를 해보세요");
		
		//컬렉션 : 자바에서 배열의 불편함을 피하기 위해 제공해주는 클래스 (좀 더 쓰기 편한 배열)
		//ArrayList, HashSet, HashMap
		
		//배열 : 같은 주제의 변수들은 하나로 묶는다.
		String menu[]= {"라면","김밥","떢볶이","순대","","",""};
		int price[] = new int[7];
		
		price[0] = 1000;
		price[1] = 2000;
		price[2] = 3000;
		price[3] = 4000;
		price[4] = 5000;
		price[5] = 6000;
		price[6] = 7000;
		
		//배열의 어려운 점
		// - 중간에 값을 삽입하기가 쉽지 않음
		// - 중간 값을 삭제해서 정렬하기가 쉽지 않음.
		// - 크기를 늘리거나 줄이는게 쉽지 않음. 
		// - 이런 부분을 자바에서 '자동화' 해주는 클래스가 '컬렉션'이다.
		
		for(int i=0;i<menu.length;i++) {
			if(menu[i].equals("") || menu[i] == null) {
				menu[i]="";
				price[i] = 0;
			}
			
			if(!menu[i].equals("")&&menu[i] !=null) {
				System.out.println(menu[i]+" : "+price[i]);
			}

		}
	}
}