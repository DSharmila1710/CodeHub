package Automation;

import java.util.Arrays;

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
	
	
	
	public static void main(String[] args) {
		System.out.println(anagram_usingXOR("abcba","cbaab"));
	}

}
