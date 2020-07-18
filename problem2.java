package Task;

import java.util.HashMap;
import java.util.Map;

public class problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		countWords(map, "I am a man");
		for(String word : map.keySet()) {
			System.out.println(word + " : " + map.get(word));
		}
	}

	public static void countWords(Map<String, Integer> map, String s) {
		String[] words = s.split("\\W+");
		for(String word : words) {
			Integer m = map.get(word);
			if(m == null) {
				map.put(word, 1);
			} else {
				map.put(word, m + 1);
			}
		}
	}
	
}
