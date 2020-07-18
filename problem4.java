package Task;

public class problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(checkPalindrome(101)) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("It is a not palindrome");
		}
	}

	public static boolean checkPalindrome(int num) {
		if(num == 0)  return true;
		int x = num;
		int reversedInt = 0;
		while(x != 0) {
			int temp = x % 10;
			reversedInt = reversedInt * 10 + temp;
			x /= 10;
		}
		if(reversedInt == num) {
			return true;
		} 
		return false;
	}
	
	public static boolean checkPalindrome(String str) {
		if(str == null || str.length() == 0) return false;
		int left = 0;
		int right = str.length() - 1;
		while(left < right) {
			if(str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		
		return true;
	}
	
}
