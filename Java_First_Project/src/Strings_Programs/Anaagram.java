package Strings_Programs;

import java.util.Arrays;

public class Anaagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcd";
		String str1="bcdt";
		
		if(str.length()==str1.length())
		{
			System.out.println("Length is same");
			
			char[] ch1 = str.toCharArray();
			char[] ch2 = str1.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			if(Arrays.equals(ch1, ch2)==true)
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not Anagram");
			}
		}
		else
		{
			System.out.println("Length is not same and not anagram");
		}

	}

}
