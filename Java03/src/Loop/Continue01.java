package Loop;

public class Continue01 {
	public static void main(String[] args) {
		int i=0;
		/*
		//while continue
		while(i<10)
		{
			i++;
			if(i%2==1) continue;
			System.out.println(i);
		}
		*/
		
		//for continue
		for(int j=1;j<=10;j++)
		{
			if(j%2==1) continue;
			System.out.println(j+" 짝수");
		}
		
		do {
			System.out.println("적어도 한번은 실행을 보장");
		}while(i==3);
		
	}
}
