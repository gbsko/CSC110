package BuildImplement;

public class Student extends Person
{
	int studentID;
	
	public Student()
	{
		super();
		studentID = 0;
	}
	
	public Student(String newName, int newNumber, int newID)
	{
		super(newName, newNumber);
		studentID = newID;
	}
	
	public void setID(int newID)
	{
		studentID = newID;
	}
	
	public int getID()
	{
		return studentID;
	}
	
	public void writeOutput()
	{
		super.writeOutput();
		System.out.println("Student ID#: " + studentID);
	}
	
	public boolean equals(Student otherStudent)
	{
		return equals((Person)otherStudent) && (this.studentID == otherStudent.studentID);
	}
	
	
}
