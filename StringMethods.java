package week3.assignments;

public class StringMethods {

	public static void main(String[] args) {
		
		//Input - "Hello World"
		String sentence1 = "Hello World";
		String[] word1 = sentence1.split(" ");
		String lastWord1=word1[word1.length-1];
		int length1 = lastWord1.length();
		System.out.println("The last word is " + lastWord1 + " with length " + length1 );
		
		//Input - "fly me to the moon"
		String sentence2 = "fly me to the moon";
		String[] word2 = sentence2.split(" ");
		String lastWord2=word2[word2.length-1];
		int length2=lastWord2.length();
		System.out.println("The last word is " + lastWord2 + " with length " + length2 );
		
		//Input - "luffy is still joyboy"
		String sentence3="luffy is still joyboy";
		String[] word3 = sentence3.split(" ");
		String lastWord3=word3[word3.length-1];
		int length3=lastWord3.length();
		System.out.println("The last word is " + lastWord3 + " with length " + length3 );



	}

}
