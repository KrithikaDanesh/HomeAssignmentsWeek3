package week3.assignments;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionList {

	public static void main(String[] args) {

		int[] a={3,2,11,4,6,7};
		 int[] b={1,2,8,4,9,7};
		 List<Integer> list1 = new ArrayList<Integer>();
		 list1.add(3);
		 list1.add(2);
		 list1.add(11);
		 list1.add(4);
		 list1.add(6);
		 list1.add(7);
		 
		 List<Integer> list2=new ArrayList<Integer>();
		 list2.add(1);
		 list2.add(2);
		 list2.add(8);
		 list2.add(4);
		 list2.add(9);
		 list2.add(7);
		 
		 for(int i=0;i<=list1.size()-1;i++) {
			 int values1=list1.get(i);
			 for(int j=0;j<=list2.size()-1;j++) {
				 int values2=list2.get(j);
				 if(values1==values2) {
					 System.out.println(values1);
				 }
			 }
		 }
		 
		 
	}

}
