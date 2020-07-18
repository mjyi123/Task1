package Task;

import java.util.ArrayList;
import java.util.List;

public class problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		whileloop(list);
		forloop(list);
		advanceforloop(list);
	}
	
	//while loop
	public static void whileloop(List<Integer> list)  {
		System.out.println("While loop : ");
		int i = 0;
		while(i < list.size()) {
			System.out.println(list.get(i++));
		}
	}
	
	//for loop
	public static void forloop(List<Integer> list)  {
		System.out.println("For loop : ");
		for(int i = 0; i < list.size(); i++)  {
			System.out.println(list.get(i));
		}
	}
	
	//advance for loop
	public static void advanceforloop(List<Integer> list)  {
		System.out.println("Advance For loop : ");
		for(int n : list)  {
			System.out.println(n);
		}
	}
	
	
}
