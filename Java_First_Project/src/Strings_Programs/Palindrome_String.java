package Strings_Programs;

public class Palindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ShS";
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		
		if(str.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		

	}

}
