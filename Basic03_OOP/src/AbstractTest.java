
// �߻� Ŭ������ �߻� �޼ҵ带 1�� �̻� ������ ��츦 ����
// �߻� �޼ҵ�� ��ȯ�� ���ʿ� abstract��� Ű���� ���̸� ��.
abstract public class AbstractTest {

	int num = 20;
	String name = "ȫ�浿";
	AbstractTest(){
		
	}
	
	void setData(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	abstract void output(); // �̿ϼ� �޼ҵ� : �߻� �޼ҵ�
	abstract int getName();
}
