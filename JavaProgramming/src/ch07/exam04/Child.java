package ch07.exam04;

public class Child extends Parent {
	String firstName;
	
	public Child(String lastName, String firstName) {
		super(lastName);
		this.firstName = firstName;
	}
	
	void play() {
		System.out.println("��ƿ�");
	}
	
	@Override
	void sound() {
		System.out.println("����");
	}
	
	void parentSound(){
		super.sound();
	}
	
}
