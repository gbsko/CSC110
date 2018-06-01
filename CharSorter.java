package BuildImplement;

 

public class CharSorter

{

public static void charSort(char[] array)

{

for (int i = 0; i < array.length - 1; i++)

{

int lowAlphabet = getLowestCharPosition(i, array);

swap(i, lowAlphabet, array);

}

 

}

 

private static int getLowestCharPosition(int index, char[] array)

{

char lowest = array[index];

int lowestIndex = index;

for (int i = index + 1; i < array.length; i++)

{

if (array[i] < lowest)

{

lowest = array[i];

lowestIndex = i;

}

 

}

return lowestIndex;

}

 

private static void swap(int a, int b, char[] array)

{

char temp = array[a];

array[a] = array [b];

array [b] = temp;

}

}

 