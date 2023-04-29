package collection_;

import java.util.ArrayList;

public class List3 {
	public static void main(String[] args) {
		ArrayList3 ar3 = new ArrayList3();
		ar3.go();

	}

}

class ArrayList3 {
	// add : 추가
	// get : 사용
	// size : 추가한 갯수
	ArrayList<Integer> arr = new ArrayList<>();

	public void go() {
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		
		arr.set(0, 107);	//수정(수정할 위치, 수정할 값)
		arr.remove(2);		//삭제(삭제할 위치)
		arr.indexOf(3);		//indexOf : 찾기(찾아서 방번호를 return)
		System.out.println("==2을 갖고 있는 방 번호는 : "+arr.indexOf(2));

		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i)+" ");
		}

	}
}