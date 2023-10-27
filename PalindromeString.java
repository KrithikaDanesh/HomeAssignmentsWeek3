package week3.assignments;

public class PalindromeString {

	public static void main(String[] args) {

		String val ="madam";
		char ch[]=val.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--) {
			rev=rev+ch[i];
		}
		System.out.println(rev);
		if(val.equalsIgnoreCase(rev)) {
			System.out.println("Its a Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}

}
