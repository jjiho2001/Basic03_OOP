import java.util.Scanner;

// package : 폴더

public class ClassTest {
	
	// Class 영역 : 선언된 변수, 상수들은 멤버변수(전역변수)
	
	int num = 1234;
	final int MAX = 100; // 상수화된 변수 : 값을 변경할 수 없음. 변수명을 모두 대문자로 한다.
						// Math.PI, Calendar.YEAR, ....
	
	// 래퍼런스 변수, 인스턴스 : instance
	Scanner scan = new Scanner(System.in);
	
	// 생성자 메소드 : 객체를 생성하는 방법
	// 규칙 : 메소드명이 반드시 클래스명과 같아야 한다.
	//		 객체 생성시 한 번 실행(객체생성할 때 초기환경을 만들어줄 수 있다.)
	//		 생성자는 반환값이 없음
	ClassTest(){
		//실행문이 들어가는 곳. 변수 선언, 수식, if, for, while, 배열...
		System.out.println("ClassTest() 생성자 메소드");
	}
	ClassTest(int num){
		System.out.println(this.num);
		System.out.println(num);
		System.out.println("ClassTest(int) 생성자 메소드");
	}
	ClassTest(String name, int num){
		System.out.println("ClassTest(String, int) 생성자 메소드");
		System.out.println("이름 = " + name + ", 번호 : " + num);
	}
	ClassTest(int num, String name){
		// 생성자 메소드에서 다른 생성자 메소드 실행하기
		// 다른 생성자를 불러올 때, 첫 번째 줄에 실행 해야함.
		this(name, num);
	}
	
	// 메소드 : 기능구현
	//		  소문자로 시작한다.
	//		  반환값이 있을수도 없을수도 있다. 반환값이 없을 때는 void 키워드로 대체
	// 형식 : 반환값 메소드명(매개변수){}
	void sum() {
		int a = 0;
		for(int i = 1; i <= 100; i++) a += i;
		System.out.println("1~100까지의 값은 " + a);
	}
	
	String sum2() {
		int a = 0;
		for(int i = 1; i <= 100; i++) a += i;
		return "더하기" + a;
	}
	
	// 내부클래스 : 클래스의 멤버에 정의하는 내부클래스, 메소드내에 정의하는 내부클래스, 익명의 내부클래스
	// 이것도 클래스이기 때문에 .class파일이 생성됨
	class Test{
		
	}
}
