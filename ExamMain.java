public class ExamMain{
	public static void main(String[] args){
		Exam a = new Exam();
		Exam b = new Exam(100, 50);
		Exam c = new Exam(75, 75);
		Exam d = new Exam(c);
		System.out.println("A object");
		a.output();
		System.out.println("B object");
		b.output();
		System.out.println("C object");
		c.output();
		System.out.println("D object");
		d.output();
	}
}