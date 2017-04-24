package ch14.exam02;

public class LambdaExpressionExample {

	public static void main(String[] args) {
		
		method1(()-> System.out.println("run..."));
		
		method2( a->System.out.println(a));
		
		method3((a, b) -> System.out.println(a+b));
		
		method4((a, b) -> a+b );

	}
	
	public static void method1(FunctionalInterface1 i){
		i.method();
	}
	
	public static void method2(FunctionalInterface2 i){
		i.method(3);
	}
	
	public static void method3(FunctionalInterface3 i){
		i.method(4, 5);
	}
	
	public static void method4(FunctionalInterface4 i){
		i.method(4, 5);
	}

}
