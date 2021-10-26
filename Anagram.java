package Automation.test;

import java.util.Arrays;
import java.util.HashMap;

public class Anagram {

	private static boolean anagram_withoutArrays(String a, String b) {
		boolean status = false;
		int a_length = a.length();
		int count = 0;
		if(a_length!=b.length()) {
			return status;			
		}else {
			char[] ch_a = a.toCharArray();
			char[] ch_b = b.toCharArray();
			for(char charOfa:ch_a) {
				for(char charOfb:ch_b) {
					if(charOfa==charOfb) {
						count+=1;
						break;
					}
				}
			}
		}
		if(count==a.length()) {
			status = true;
		}
		return status;
	}
	
	private static boolean anagram1_usingArrays(String a , String b) {
		 char[] ch_a= a.toLowerCase().replaceAll("\\s", "").toCharArray();
		 char[] ch_b= b.toLowerCase().replaceAll("\\s", "").toCharArray();
		 Arrays.sort(ch_a);
		 Arrays.sort(ch_b);
		 return Arrays.equals(ch_a, ch_b);
	}
	
	private static boolean anagram_usingXOR(String a , String b) {
		int xor = 0 ;
		for(int i =0;i<a.length();i++) {
			 xor ^= a.charAt(i) ^ b.charAt(i);
		}
		return xor==0?true:false;
	}
	
	private static boolean anagram_usingHashMap(String a, String b) {
		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<a.length();i++) {
			int count = 1;
			if(map.containsKey(a.charAt(i))) 
				count = map.get(a.charAt(i))+1;
			map.put(a.charAt(i), count);
		}
		System.out.println(map);
		for(int j=0;j<b.length();j++) {
			if(map.containsKey(b.charAt(j))) {
				int count_b = map.get(b.charAt(j));
				if (count_b==1)
					map.remove(b.charAt(j), 1);
				else
					map.put(b.charAt(j), count_b-1);
			}
		}
		System.out.println(map);
		return (map.isEmpty())?true:false;
	}
	
	public static void main(String[] args) {
		System.out.println(anagram_usingHashMap("abcba","cbcab"));
	}

}
