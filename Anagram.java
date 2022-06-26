package week2.day1;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String str1 = "stops";
	String str2 = "potssi";
	
	int length1 = str1.length();
	int length2 = str2.length();
	
	if(length1==length2) {
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		int length3 = charArray1.length;
		int length4 = charArray2.length;
		
		if(length3==length4)
		{
			System.out.println("Both words have same values");
		}
			}else
			{
				System.out.println("Both are not same values");
				}
	
}}