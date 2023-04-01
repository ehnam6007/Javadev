package class_java;

public class Class_3 {
	public static void main(String[] args) {
		Car mom_car = new Car();
		Car fafa_car = new Car();
		Car my_car = new Car();

		mom_car.car_user = "Mother";
		mom_car.car_type = "BMW";
		mom_car.car_color = "Blue";
		
		fafa_car.car_user = "Mother";
		fafa_car.car_type = "BMW";
		fafa_car.car_color = "Blue";
		
		my_car.car_user = "Mother";
		my_car.car_type = "BMW";
		my_car.car_color = "Blue";
		
		mom_car.car_info();
		System.out.println();
		fafa_car.car_info();
		System.out.println();
		my_car.car_info();

	}
}
class Car {
	String car_user, car_type, car_color;

	void car_info() {
		System.out.println("차 주인 : "+car_user+"\n차 유형 : "+car_type+"\n차 색깔 : "+car_color);
}
}