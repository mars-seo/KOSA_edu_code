package ch06.exam01;


public class CarExample {

	public static void main(String[] args) {
		//객체 생성코드
		Car myCar = new Car();
		System.out.println(myCar.company);
		System.out.println(myCar.speed);
		System.out.println(myCar.color);
		System.out.println(myCar.airback);
		
		Car urCar = new Car("검정",true);
		System.out.println(urCar.company);
		System.out.println(urCar.speed);
		System.out.println(urCar.color);
		System.out.println(urCar.airback);
		
		urCar = new Car("Red",true);
		System.out.println(urCar.company);
		System.out.println(urCar.speed);
		System.out.println(urCar.color);
		System.out.println(urCar.airback);
	}

}
