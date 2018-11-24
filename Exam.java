public class Exam{
	private int m1, m2;
	
	Exam(){
		m1 = 50;
		m2 = 50;
	}
	
	Exam(int m , int n){
		m1 = m;
		m2 = n;
	}
	
	Exam(Exam x){
		m1 = x.m1;
		m2 = x.m2;
	}
	
	public void output(){
		System.out.println("M1 = " + m1);
		System.out.println("M2 = " + m2);
	}
}