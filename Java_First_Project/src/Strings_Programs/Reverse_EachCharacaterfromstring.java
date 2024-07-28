package Strings_Programs;

public class Reverse_EachCharacaterfromstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "My name is sheetal Jaswal";
		String reverse = "";
		String word[] = str.split(" ");
		
		for(int i=0;i<word.length;i++)
		{
			String words = word[i];
			
			char ch;
			String newstr="";
			for(int j=0;j<words.length();j++)
			{
				ch = words.charAt(j);
				newstr = ch+newstr;
			}
			reverse = reverse + newstr+" ";
			
		}
		System.out.println(reverse);
}
}


