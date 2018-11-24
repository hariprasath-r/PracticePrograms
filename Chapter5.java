public class Chapter5
{
	public static void main(String[] args)
	{
		//Instantiation 
		Name n = new Name();
		Name n1 =new Name("Hari", "Prasath", "Ravichandran");
		Name n2 =new Name("Hariprasath", "Ravichandran");
		
		n.setFirst("Hari");
		n.setMiddle("Krishnan");
		n.setLast("Ravichandran");
		
		
		System.out.println("First : " + n.getFirst() + " Middle : " + n.getMiddle() + " Last : " + n.getLast());
		System.out.println("Name n1 : " + n1.displayName());
		System.out.println("Name n1 Initials : " + n1.getInitials());
		System.out.println("Name n2 : " + n2.displayName());
		System.out.println("Name n2 Initials : " + n2.getInitials());
		
	}
}