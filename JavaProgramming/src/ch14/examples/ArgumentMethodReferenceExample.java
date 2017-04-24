package ch14.examples;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferenceExample {

	public static void main(String[] args) {
		ToIntBiFunction<String, String> function;
		
		function = (a,b)->a.compareToIgnoreCase(b);
		print(function.applyAsInt("Java8", "JAVA8"));
		
		function = String::compareToIgnoreCase;
		print(function.applyAsInt("Java8", "JAVA8"));
	}

	private static void print(int order) {
		if(order<0){ System.out.println("���������� ���� �ɴϴ�.");}
		else if(order==0){System.out.println("������ ���ڿ��Դϴ�.");}
		else {System.out.println("���������� ���߿� �ɴϴ�.");}
		
	}

}