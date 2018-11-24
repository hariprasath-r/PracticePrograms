public class TimeMain{
	public static void main(String[] args){
		Time a = new Time();
		Time b = new Time();
		Time c = new Time();
		a.input();
		b.input();
		c.process(a, b);
		c.output();
	}
}