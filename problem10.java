package Task;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class problem10 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the File Name :");
		String m=br.readLine();
		FileWriter fw=new FileWriter(m,true);
		String h="Welcome to Marlabs is a technology consulting company If you come to Marlabs you you you you ";
		System.out.println("File Written");
		fw.write(h);
		fw.close();
		
		System.out.println("Enter the File Name :");
		String n=br.readLine();
		FileReader fr=new FileReader(n);
		int y=fr.read();
		StringBuffer sb = new StringBuffer();
		while(y!=-1){
			sb.append((char)y);
		    y=fr.read();
	   }
	   fr.close();
	   br.close();
	   String str = new String(sb);
	   System.out.println(countMostRepeatedWords(str));
	   
	   
	}
	
	public static String countMostRepeatedWords(String s) {
		Map<String, Integer> map = new HashMap<>();
		String[] words = s.split("\\W+");
		String MostRepeatedWord = "";
		int max = Integer.MIN_VALUE;
		for(String word : words) {
			Integer m = map.get(word);
			if(m == null) {
				map.put(word, 1);
			} else {
				map.put(word, m + 1);
			}
		}
		for(String word : map.keySet()) {
			if(max < map.get(word)) {
				MostRepeatedWord = word;
				max = map.get(word);
			}
		}
		
		return MostRepeatedWord;
	}
	

}
