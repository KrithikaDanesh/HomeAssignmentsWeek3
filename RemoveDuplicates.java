package week3.assignments;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";	
		String[] split=text.split(" ");
		for(int i=0;i<split.length;i++) 
		{
			int count=0;

		for(int j=i+1;j<split.length;j++) {
			if(split[i].equalsIgnoreCase(split[j])) {
				count=count+1;
				split[j].replace("java", "");
				break;
			
			}
		}
			if(count==0) {
				System.out.print(split[i]+" ");
			}
			
		}
		

	}

}
