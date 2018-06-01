package BuildImplement;

public class CharSorter2
{
	public static void charSort(char[] array)
	{
		for (int i = 0; i < array.length - 1; i++)
		{
			char lowest = array[i];
			int lowestIndex = i;
			for (int j = i + 1; j < array.length; j++)
			{
				if (array[j] < lowest)
				{
					lowest = array[j];
					lowestIndex = j;
				}
			}
			int lowAlphabet = lowestIndex;

			char temp = array[i];
			array[i] = array [lowAlphabet];
			array [lowAlphabet] = temp;
		}	
	}
}

