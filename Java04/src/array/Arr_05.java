package array;

public class Arr_05 {
	public static void main(String[] args) {
		int second_arr[][] = { { 10, 20 }, { 20, 30 }, { 100, 200 } };

		for (int i = 0; i < second_arr.length; i++) {
			for (int j = 0; j < second_arr[i].length; j++) {
				System.out.print(second_arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
