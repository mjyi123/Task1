package Task;

public class problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		System.out.println(reverse(s));
	}

	public static String reverse(String s) {
		if(s == null || s.length() == 0) return s;
		char[] chars = s.toCharArray();
		int left = 0;
		int right = s.length() - 1;
		while(left <= right) {
			char temp = chars[left];
			chars[left] = chars[right];
			chars[right] = temp;
			left++;
			right--;
		}
		return new String(chars);
	}
}
