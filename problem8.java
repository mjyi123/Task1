package Task;

public class problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeSpaces("I am a player"));
	}

	public static String removeSpaces(String str) {
		char[] chars = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < chars.length; i++) {
			if(chars[i] != ' ') {
				sb.append(chars[i]);
			}
		}
		return new String(sb);
	}
}
