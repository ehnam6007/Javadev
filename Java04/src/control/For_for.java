package control;

public class For_for {
	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++)
				System.out.println("i=" + i + ", j=" + j);
		}
		
		System.out.println();
		for (int i = 0; i < 2; i++) {
			System.out.println("---i:"+i+"---");
			for (int j = 0; j < 3; j++)
				System.out.println("j=" + j);
		}
	}
}
