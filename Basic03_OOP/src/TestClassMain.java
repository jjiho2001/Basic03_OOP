
public class TestClassMain {

	public static void main(String[] args) {
		
		ClassTest a = new ClassTest();
		ClassTest b = new ClassTest(3);
		ClassTest c = new ClassTest("ȫ�浿", 2);
		ClassTest d = new ClassTest(00, "�̼���");
		
		//��ü���� �޼ҵ带 ȣ�� : ��ü��.�޼ҵ��
		d.sum();
		System.out.println(d.sum2());
		
		//��ä���� ��������� ����
		System.out.println(d.num);
	}

}
