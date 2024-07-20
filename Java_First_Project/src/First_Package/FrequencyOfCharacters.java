package First_Package;

public class FrequencyOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Sheetal Jaswal";
		int freq[] = new int[str.length()];
		char[] ch = str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			freq[i]=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j] && ch[i]!=' ')
				{
					freq[i]++;
					ch[j]='0';
				}
			}
		}
		for(int j=0;j<ch.length;j++)
		{
			if(ch[j]!=' ' && ch[j]!='0')
			{
				System.out.println(ch[j]+"   "+freq[j]);
			}
		}
		

	}

}
