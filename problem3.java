package Task;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> map = new HashMap<>();
		addPairs(map, 1,3);
		whileloop(map);
		advanceforloop(map);
	}
	
	public static void addPairs(Map<Integer, Integer> map, int key,  int value) {
		map.put(key, value);
	}
	
	//while loop
	public static void whileloop(Map<Integer, Integer> map)  {
		System.out.println("While loop : ");
		Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, Integer> pair = it.next();
			System.out.println("Key  is " + pair.getKey() + ", " + "Value is " + pair.getValue());
		}
	}

	
	//for loop
	public static void advanceforloop(Map<Integer, Integer> map)  {
		System.out.println("For loop : ");
		
		for(int key : map.keySet()) {
			System.out.println("Key  is " + key + ", " + "Value is " + map.get(key));
		}
	}
}
