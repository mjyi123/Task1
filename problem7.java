package Task;

import java.util.Arrays;

public class problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {10,32,15,87,63,71};
		findSecondHighest(numbers);
	}
	
	public static void findSecondHighest(int[] numbers) {
		Arrays.sort(numbers);
		System.out.println(numbers[numbers.length - 2]);
	}

}
