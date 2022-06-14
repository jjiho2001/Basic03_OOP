package innerClass;

//내부클래스 : 클래스의 멤버에 정의하는 내부클래스, 메소드내에 정의하는 내부클래스, 익명의 내부클래스
// 이것도 클래스이기 때문에 .class파일이 생성됨

// 내부 클래스는 클래스 내의 클래스를 말함
// 1. 클래스의 멤버 영역에 내부 클래스 만들기
public class OuterClass {

	String name = "홍길동";
	int age = 30;
	
	public OuterClass() {
		
	}
	
	public void output() {
		System.out.print("빰");
	}

	// 내부 클래스
	class InnerClass{
		
		String addr = "강남구 역삼동";
		// 외부 클래스의 멤버들 쓸 수 있음
		
		InnerClass(){
			age++;
			output();
		}
		
		void memberOutput() {
			System.out.println(addr);
		}
	}
	
	public static void main(String[] args) {
		
		// 내부 클래스를 사용하기 위해서는 외부 클래스가 객체 생성되어야 함
		// 내부 클래스 객체 생성 방법 1
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass ic = oc.new InnerClass();
		ic.memberOutput();
		// 내부 클래스 객체에서 외부 클래스의 변수, 메소드는 호출할 수 없다.
		// ic.output();
		
		// 객체 생성 방법 2
		OuterClass.InnerClass ic2= new OuterClass().new InnerClass();
		ic2.memberOutput();
		
	}

}
