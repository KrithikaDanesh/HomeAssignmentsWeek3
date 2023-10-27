package week3.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String text1="stops";
		String text2="posts";
		char ch1[] = text1.toCharArray();
		char ch2[] = text2.toCharArray();
		boolean flag=false;
		if(ch1.length!=ch2.length) {
			//System.out.println("Its not an anagram");
			flag=false;
		}else {
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			for(int i = 0;i<ch1.length;i++) {
				if(ch1[i]==ch2[i]) {
					flag=true;
					
				}else {
					flag=false;
					break;
				}
				
			}
		}
		if (flag==true) {
			System.out.println("Its an Anagram");
		}else {
			System.out.println("Its not an Anagram");
		}

					
	}

}
