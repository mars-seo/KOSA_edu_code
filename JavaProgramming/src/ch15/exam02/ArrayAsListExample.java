package ch15.exam02;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListExample {
	public static void main(String[] args){
		
		List<String> list1 = Arrays.asList("ȫ�浿","�ſ��","���ڹ�");
		for(String name:list1){
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(1,2,3);
		for(int name:list2){
			System.out.println(name);
		}
		
		
	}
}
