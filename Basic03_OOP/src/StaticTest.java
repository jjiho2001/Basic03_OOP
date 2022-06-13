
public class StaticTest {
	
	// static은 멤버변수, 메소드에 표기할 수 있다.
	// 객체명.멤버변수
	// 클래스명.멤버변수

	String name = "홍길동";
	int age = 30;
	static String addr = "강남구";
	
	void setData(String name) {
		this.name = name;
	}
	
	// 멤버영역에는 실행문을 표기할 수 없다.
	//System.out.println("실행문");
	// static을 이용하면 멤버영역에 실행문을 기술할 수 있음.
	// 같은 클래스로 객체를 여러번 생성하더라도 한 번만 실행.
	// 굳이 여기서 실행문을 사용하겠다 하면 아래처럼, 가장 먼저 실행됨.
	// 멤버변수를 이용할 수 없음.
	static {
		System.out.println("실행문");
	}
	
	// 메소드에 static
	// 객체를 생성하지 않고 외부에서 클래스명.메소드명으로 접근이 가능
	static void setAddr(String addr) {
		// this.addr = addr; error heap 메모리에 addr는 저장되어 있지 않음
		StaticTest.addr = addr;
	}
}
