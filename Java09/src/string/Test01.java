package string;

public class Test01 {
	public static void main(String[] args) {
		String order1 = "name=001price=2000type=0";		
		String cafe[] = {"에스프레소","아메리카노","카페라떼","딸기라떼","케모마일차"};
		String ICE[] = {"HOT","ICE"};
		String menu = null, rs1 = null;
		
		int name_idx = order1.indexOf("name");
		int price_idx = order1.indexOf("price");
		int type_idx = order1.indexOf("type");
		int end_idx = order1.length();
		
		int name = Integer.parseInt(order1.substring(price_idx-1,price_idx));
		int type = Integer.parseInt(order1.substring(end_idx-1, end_idx));
		
		
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