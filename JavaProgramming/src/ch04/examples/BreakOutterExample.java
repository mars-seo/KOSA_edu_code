package ch04.examples;

public class BreakOutterExample {

	public static void main(String[] args) {
		Outter: for(char upper = 'A';upper<='Z';upper++){
					for(char lower = 'a';lower<='z';lower++){
						System.out.println(upper+ "-" +lower);
						if(upper=='C'){
							break Outter;
						}
					}
				}

	}
}