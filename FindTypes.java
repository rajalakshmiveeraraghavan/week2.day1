package week2.day1;

public class FindTypes {
public static void main(String[] args) {
	String test = "$$ Welcome to 22nd Class of Automation $$";
	int letter = 0; 
	int space=0;
	int num=0;
	int specialchar=0;
	
	char[] charArray = test.toCharArray();
		for(int i=0;i<charArray.length;i++) { 
			if(Character.isLetter(charArray[i])) {
			letter = letter+1;
			}
			else if(Character.isDigit(charArray[i])) {
		num = num+1;
		}
			else if (Character.isSpaceChar(charArray[i])) {
	  space=space+1;
	  }
	  else {
	  specialchar=specialchar+1;
	  }
	}
	System.out.println("letter:"+ letter);
	System.out.println("number:"+ num);
	System.out.println("Space:"+space);
	 System.out.println("Special character:"+specialchar);
	}}