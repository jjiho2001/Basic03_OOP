
public class TestClassMain {

	public static void main(String[] args) {
		
		ClassTest a = new ClassTest();
		ClassTest b = new ClassTest(3);
		ClassTest c = new ClassTest("홍길동", 2);
		ClassTest d = new ClassTest(00, "이순신");
		
		//객체내의 메소드를 호출 : 객체명.메소드명
		d.sum();
		System.out.println(d.sum2());
		
		//객채내의 멤버변수를 접근
		System.out.println(d.num);
	}

}
