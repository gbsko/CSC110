package BuildImplement;

public class CharArraySort
{
	public static void main(String[] args)
	{
		char[] charArray = {'z','f','a','b','n','j','d','w','u','j','a'};
		
		CharSorter2.charSort(charArray);
		
		for (int i = 0; i < charArray.length; i++)
		{
			System.out.println(charArray[i]);
		}
		
		
	}
}
