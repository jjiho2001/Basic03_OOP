
public class StaticTest {
	
	// static�� �������, �޼ҵ忡 ǥ���� �� �ִ�.
	// ��ü��.�������
	// Ŭ������.�������

	String name = "ȫ�浿";
	int age = 30;
	static String addr = "������";
	
	void setData(String name) {
		this.name = name;
	}
	
	// ����������� ���๮�� ǥ���� �� ����.
	//System.out.println("���๮");
	// static�� �̿��ϸ� ��������� ���๮�� ����� �� ����.
	// ���� Ŭ������ ��ü�� ������ �����ϴ��� �� ���� ����.
	// ���� ���⼭ ���๮�� ����ϰڴ� �ϸ� �Ʒ�ó��, ���� ���� �����.
	// ��������� �̿��� �� ����.
	static {
		System.out.println("���๮");
	}
	
	// �޼ҵ忡 static
	// ��ü�� �������� �ʰ� �ܺο��� Ŭ������.�޼ҵ������ ������ ����
	static void setAddr(String addr) {
		// this.addr = addr; error heap �޸𸮿� addr�� ����Ǿ� ���� ����
		StaticTest.addr = addr;
	}
}
