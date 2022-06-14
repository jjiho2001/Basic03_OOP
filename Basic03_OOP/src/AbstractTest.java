
// 추상 클래스는 추상 메소드를 1개 이상 포함한 경우를 말함
// 추상 메소드는 반환형 왼쪽에 abstract라는 키워드 붙이면 됨.
abstract public class AbstractTest {

	int num = 20;
	String name = "홍길동";
	AbstractTest(){
		
	}
	
	void setData(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	abstract void output(); // 미완성 메소드 : 추상 메소드
	abstract int getName();
}
