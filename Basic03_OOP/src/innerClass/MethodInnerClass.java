package innerClass;

public class MethodInnerClass {

	int age = 25;
	
	MethodInnerClass(){
		
	}
	
	void start(){
		// ���� Ŭ����
		String tel = "111111111";
		class InnerTest{
			
			int num = 100;
			String name = "ȫ�浿";
			
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
				// Ŭ������ ���ǵ� ���� ���� ���� �Ұ�
				//System.out.println(addr);
			}
		}
		String addr = "����";
		InnerTest it = new InnerTest(500, "�̼���");
		it.print();
	}
	
	
	
	public static void main(String[] args) {
		
		MethodInnerClass mic = new MethodInnerClass();
		mic.start();

	}

}
