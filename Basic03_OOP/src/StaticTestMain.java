
public class StaticTestMain {

	public static void main(String[] args) {
		
		StaticTest st = new StaticTest();
		StaticTest st2 = new StaticTest();
		
		// static ������ �� ����
		st.addr = "���ı�";
		System.out.println(st.addr);
		System.out.println(st2.addr);

		// static ��������� ��ü�� �������� �ʰ� ����� �� �ִ�.
		System.out.println(StaticTest.addr);
		
		st2.setData("���Ӹ�!");
	}

}
