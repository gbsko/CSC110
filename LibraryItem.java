package BuildImplement;

public class LibraryItem
{
	//name of the library item
	private String name;
	
	//default constructor
	public LibraryItem()
	{
		name = "There is no name for this item yet.";
	}
	
	//change the name
	public void setName(String newName)
	{
		name = newName;
	}
	
	//return the name
	public String getName()
	{
		return name;
	}
	
	//prints name to the console
	public void writeOutput ()
	{
		System.out.println("Name: " + name);
	}
	
	//compares if two names are the same
	public boolean equals(LibraryItem otherLibraryItem)
	{
		return this.name.equalsIgnoreCase(otherLibraryItem.name);
	}
}
