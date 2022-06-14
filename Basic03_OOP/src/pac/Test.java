package pac;

public class Test {

	// 멤버변수 : public, protected, default, private
	int num = 250;
	public String name = "홍길동";
	
	public Test() {	
		System.out.println("Test() 생성자 메소드...");
	}
	
	void gugudan(int dan) {
		for(int i = 2; i <= 9; i++) {
			System.out.print(dan + " x " + i + " = " + dan * i);
		}
	}
}
