package string;

public class String2 {
	public static void main(String[] args) {
		//카페 포스기와 키오스크와 모바일간 통신(보안)
		MyClass9 mc9 = new MyClass9();
		
		String order1 = "name=001price=2000type=0";
		mc9.info(order1);
		//System.out.println(mc9.info(order1));
		
		String order2 = "name=003price=6000type=1";
		mc9.info(order2);
		//System.out.println(mc9.info(order2));
		
		String order3 = "name=004price=6000type=1";
		mc9.info(order3);
		//System.out.println(mc9.info(order3));
	}

}

class MyClass9{
	public void info(String str) {
		String cafe[] = {"에스프레소","아메리카노","카페라떼","딸기라떼","케모마일차"};
		String ICE[] = {"HOT","ICE"};
		String menu=null, rs1=null;
		
		int name_idx = str.indexOf("name");
		int price_idx = str.indexOf("price");
		int type_idx = str.indexOf("type");
		int end_idx = str.length();
		
		int name = Integer.parseInt(str.substring(price_idx-1,price_idx));
		int type = Integer.parseInt(str.substring(end_idx-1, end_idx));
		
		
		for(int i=0;i < cafe.length;i++)
		{
			if(name == i)
			{
				menu = cafe[i];
				for(int j=0 ; j<ICE.length;j++)
				{
					if(type == j) rs1 = ICE[j]; 
				
				}
			}
		}
		System.out.println("시키신 메뉴는 "+rs1+" "+menu+"입니다.");		
	}
}