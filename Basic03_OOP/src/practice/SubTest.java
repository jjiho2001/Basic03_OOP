package practice;

public class SubTest extends SuperTest{

	public SubTest(int a) {
		super(a);
		System.out.println("2");
	}
	public SubTest() {
		//a=10;
		//this.a = 10;
		//super.a = 10;
		this(10);
		//super(10);
		System.out.println("1");
	}
	
	public static void main(String[] args) {
		
		SubTest s = new SubTest();
		System.out.println(s.a);
	}

}
