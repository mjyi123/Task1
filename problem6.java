package Task;

import java.util.HashSet;
import java.util.Set;

public class problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Character> set = new HashSet<>();
		findDuplicate("aabcdd", set);
	}

	public static void findDuplicate(String str, Set<Character> set) {
		char[] chars = str.toCharArray();
		for(char c : chars) {
			if(set.contains(c)) {
				System.out.println(c);
			} else {
				set.add(c);
			}
		}
	}
}
