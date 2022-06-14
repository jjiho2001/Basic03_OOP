package innerClass;

//����Ŭ���� : Ŭ������ ����� �����ϴ� ����Ŭ����, �޼ҵ峻�� �����ϴ� ����Ŭ����, �͸��� ����Ŭ����
// �̰͵� Ŭ�����̱� ������ .class������ ������

// ���� Ŭ������ Ŭ���� ���� Ŭ������ ����
// 1. Ŭ������ ��� ������ ���� Ŭ���� �����
public class OuterClass {

	String name = "ȫ�浿";
	int age = 30;
	
	public OuterClass() {
		
	}
	
	public void output() {
		System.out.print("��");
	}

	// ���� Ŭ����
	class InnerClass{
		
		String addr = "������ ���ﵿ";
		// �ܺ� Ŭ������ ����� �� �� ����
		
		InnerClass(){
			age++;
			output();
		}
		
		void memberOutput() {
			System.out.println(addr);
		}
	}
	
	public static void main(String[] args) {
		
		// ���� Ŭ������ ����ϱ� ���ؼ��� �ܺ� Ŭ������ ��ü �����Ǿ�� ��
		// ���� Ŭ���� ��ü ���� ��� 1
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass ic = oc.new InnerClass();
		ic.memberOutput();
		// ���� Ŭ���� ��ü���� �ܺ� Ŭ������ ����, �޼ҵ�� ȣ���� �� ����.
		// ic.output();
		
		// ��ü ���� ��� 2
		OuterClass.InnerClass ic2= new OuterClass().new InnerClass();
		ic2.memberOutput();
		
	}

}
