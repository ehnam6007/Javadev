package array;

import java.util.Scanner;

public class Arr_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Contry[] = { "대한민국", "일본", "중국", "미국", "러시아" };
		String Capital[] = { "서울", "도쿄", "베이징", "워싱턴DC", "모스크바" };
		String str = "";

		/*
		 * System.out.println("<< 국가와 수도 >>"); for(int i=0;i<Contry.length;i++) {
		 * System.out.println(Contry[i]+"의 수도는 "+Capital[i]+"입니다."); }
		 */

		int bak_index=0;
		System.out.print("수도를 알고자 하는 나라를 입력하시오.(대한민국,일본,중국,미국,러시아) : ");
		str = sc.next();

		for (int i = 0; i < Contry.length; i++) {
			if (str.equals(Capital[i])) {
				bak_index = i;
				break;
			}
		}
		if(bak_index == -1)
		{
			System.out.println("해당 국가가 없습니다.");
		}
		else {
			System.out.println(Contry[bak_index]+"의 수도는 "+Capital[bak_index]+"입니다.");
		}

	}

}
