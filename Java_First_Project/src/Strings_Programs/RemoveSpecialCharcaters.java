package Strings_Programs;

public class RemoveSpecialCharcaters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Pr!ogr#am%m*in&g Lan?#guag(e"; 
		String result="";
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=64 && str.charAt(i)<=122)
			{
				result = result + str.charAt(i);
			}
		}
		System.out.println(result);

	}

}
