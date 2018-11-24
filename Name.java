public class Name
	{
	private String first;
	private String last;
	private String middle;
	
	//constructor methods
	public Name()
	{
		first = "";
		middle = "";
		last = "";
	}
	
	public Name(String f, String m, String l)
	{
		first = f;
		middle = m;
		last = l;
	}
	
	public Name(String f, String l)
	{
		first = f;
		middle = " ";
		last = l;
	}
	
	public String displayName()
	{
		return first + " " + middle + " " + last;
	}
		
	public String getInitials()
	{
		return	first.substring(0,1) + middle.substring(0,1)
				+ last.substring(0,1);
	}
	
	public void setFirst(String f)
	{
		first = f;
	}
	
	public void setMiddle(String m)
	{
		middle = m;
	}
	
	public void setLast(String l)
	{
		last = l;
	}
	
	public String getFirst()
	{
		return first;
	}
	
	public  String getMiddle()
	{
		return middle;
	}
	
	public String getLast()
	{
		return last;
	}
}	