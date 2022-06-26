package week2.day1;

public class Palindrome {
public static void main(String[] args) {
	String str="madam";
	String rev="";
		for (int i=str.length()-1;i>=0;i--) {
		//System.out.println(i);
			//System.out.println(str.charAt(i));
			//System.out.println(charAt);
	  rev=rev+str.charAt(i);
	  //System.out.println(rev);
		}		
			boolean b = str.equals(rev);
	
			if(b==true) {
				System.out.println("Given string is a palindrome");
						}
			else
			{
				System.out.println("Given string is not a palindrome");
			}
		
	}

}
