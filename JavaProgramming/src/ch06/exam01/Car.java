package ch06.exam01;

public class Car {

	//Field
	String company = "�����ڵ���";
	int speed;
	String color;
	boolean airback;
	
	//Constructor
	Car() {
		this("�����ڵ���", null, false);
	}
	Car(String color, boolean airback) {
		
		this.color = color;
		this.airback = airback;
		
	}
	Car(String company, String color, boolean airback){
		this.company = company;
		this.color = color;
		this.airback = airback;
	}
	
	//Method
	void run() {
		System.out.println("���� "+speed+"km/h �� �޸��ϴ�.");
	}
}