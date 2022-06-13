
public class StaticTestMain {

	public static void main(String[] args) {
		
		StaticTest st = new StaticTest();
		StaticTest st2 = new StaticTest();
		
		// static 변수의 값 변경
		st.addr = "송파구";
		System.out.println(st.addr);
		System.out.println(st2.addr);

		// static 멤버변수는 객체를 생성하지 않고 사용할 수 있다.
		System.out.println(StaticTest.addr);
		
		st2.setData("뭐임마!");
	}

}
