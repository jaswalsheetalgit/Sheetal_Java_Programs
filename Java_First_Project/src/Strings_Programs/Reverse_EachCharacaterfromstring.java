package Strings_Programs;

public class Reverse_EachCharacaterfromstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "My name is sheetal Jaswal";
		String reverse = "";
		String word[]=str.split(" ");
		
		for(int i=0;i<word.length;i++)
		{
			String words=word[i];
			String newString = "";
			char ch;
			for(int j=0;j<words.length();j++)
			{
				ch=words.charAt(j);
				newString=ch+newString;
			}
			reverse=reverse+newString+" ";
			
		}
		System.out.println(reverse);

	}

}
