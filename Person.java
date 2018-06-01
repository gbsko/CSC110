package BuildImplement;

public class Person
{
	private String name;
	private int phoneNumber;
	
	public Person()
	{
		name = "There is no name for this item yet.";
		phoneNumber = 0;
	}
	
	public Person(String newName, int newNumber)
	{
		name = newName;
		phoneNumber = newNumber;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public void setNumber(int newNumber)
	{
		phoneNumber = newNumber;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getNumber()
	{
		return phoneNumber;
	}
	
	public void writeOutput ()
	{
		System.out.println("Name: " + name);
		System.out.println("Phone Number: " + phoneNumber);

	}
	
	public boolean equals(Person otherPerson)
	{
		return this.name.equalsIgnoreCase(otherPerson.name) && (this.phoneNumber == otherPerson.phoneNumber);
	}
}

