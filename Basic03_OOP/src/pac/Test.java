package pac;

public class Test {

	// ������� : public, protected, default, private
	int num = 250;
	public String name = "ȫ�浿";
	
	public Test() {	
		System.out.println("Test() ������ �޼ҵ�...");
	}
	
	void gugudan(int dan) {
		for(int i = 2; i <= 9; i++) {
			System.out.print(dan + " x " + i + " = " + dan * i);
		}
	}
}
