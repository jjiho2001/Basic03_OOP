package innerClass;

public class MethodInnerClass {

	int age = 25;
	
	MethodInnerClass(){
		
	}
	
	void start(){
		// 내부 클래스
		String tel = "111111111";
		class InnerTest{
			
			int num = 100;
			String name = "홍길동";
			
			InnerTest(){
				
			}
			InnerTest(int num, String name){
				this.num = num;
				this.name = name;
			}
			
			void print() {
				System.out.println(num + name);
				System.out.println(tel);
				System.out.println(age);
				// 클래스가 정의된 이후 값은 접근 불가
				//System.out.println(addr);
			}
		}
		String addr = "서울";
		InnerTest it = new InnerTest(500, "이순신");
		it.print();
	}
	
	
	
	public static void main(String[] args) {
		
		MethodInnerClass mic = new MethodInnerClass();
		mic.start();

	}

}
