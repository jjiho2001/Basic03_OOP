package inheritance;

//extends : 클래스를 상속받을 때 (1개만 상속가능)
public class Sedan extends Car {

	String color = "red";
	public Sedan() {
		// 하위클래스의 생성자 메소드에서 상위클래스의 생성자메소드 호출
		// 반두시 첫번째 실행문으로 기출되야 한다.
		super("lightblue","소렌토");
	}
	
	public Sedan(String color) {
		
		
		//상위 클래스 하위클래스에 같은 멤버변수가 존재할 때,
		//상위클래스를 멤버변수를 지정한다.
		this.color = color;
		super.color = color;
	}
	
	// overriding : 메소드를 재정의 
	public void speedUp() {
		speed += 10;
		if(speed >= 200) speed = 200;
	}
	
	public void speedUp(int a) {
		
	}
	
	/*
	public static void main(String[] args) {
		
		// 상속 관계에서 생성자 메소드는 상위 클래스 생성자 메소드가 먼저 실행됨.
		Sedan s = new Sedan("blue");
		System.out.println(s.color);
		System.out.println(s);
		s.speedUp();
	}*/
}
