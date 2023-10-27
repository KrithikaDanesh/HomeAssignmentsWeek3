package week1.assignments;

import java.util.Arrays;

public class MissingNumber {
	public static void main(String[] args) {
		int num[] = {1,2,3,4,7,6,8};
		Arrays.sort(num);
		for(int i=0;i<(num.length-1);i++)
		{
		//System.out.println(num[i]);
		int next = num[i+1];
		int current=num[i];
		if((next-current)>1) {
			System.out.println("Missing Number is"+ " "+(current+1));
			
			}
			
		}
	}

}
