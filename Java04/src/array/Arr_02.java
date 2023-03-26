package array;

public class Arr_02 {
	public static void main(String[] args) {
		String Menu[] = {"Coffee","Tea","Juice"};
		String coffee[] = { "에스프레소", "아메리카노", "카페라떼", "카페모카"};
		String Tea[] = {"캐모마일","블랙티","루이보스","애플티"};
		String Juice[] = {"사과주스", "수박주스" , "딸기주스","오렌지주스"};
		int All_str = coffee.length + Tea.length + Juice.length;
		
		for(int i=0;i<Menu.length;i++)
		{
			System.out.print(Menu[i]+"\t");
			for(int j=0;j<4;j++)
			{
				if(i==0) System.out.print(coffee[j]+"\t");
				if(i==1) System.out.print(Tea[j]+"\t");
				if(i==2) System.out.print(Juice[j]+"\t");
			}
			System.out.println();
		}
		
	}

}
