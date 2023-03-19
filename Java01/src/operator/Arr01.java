package operator;

public class Arr01 {
	public static void main(String[] args) {
		int arr[] = {60,40,50};
		int sum=0, i=0;
		
		for(i=0;i<arr.length;i++)
		{
			sum = sum += arr[i];
		}
		
		System.out.println(sum);
		System.out.println(sum/arr.length);
	}
}
