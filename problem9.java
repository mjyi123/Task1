package Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {0,1,3,4,6,7,9,11,15};
		List<Integer> res = findMissingIntegers(numbers);
		for(int n : res) {
			System.out.println(n);
		}
	}
	
	public static List<Integer> findMissingIntegers(int[] numbers) {
		List<Integer> res = new ArrayList<>();
		if(numbers == null || numbers.length == 0) return res;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		Set<Integer> set = new HashSet<>();
		for(int number : numbers) {
			if(min > number) {
				min = number;
			}
			if(max < number) {
				max = number;
			}
			set.add(number);
		}
		
		while(min < max) {
			if(!set.contains(min)) {
				res.add(min);
			}
			min++;
		}
		return res;
	}
}
