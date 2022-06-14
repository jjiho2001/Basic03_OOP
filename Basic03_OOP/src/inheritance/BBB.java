package inheritance;

public class BBB extends AAA{

	private int x = 500;
	
	// 상위 클래스의 멤버 변수 private으로 상속하지 않는다. 메소스도 마찬가지
	//System.out.println(n);
	
	BBB(){
		System.out.println(x);
		output();
	}
}
