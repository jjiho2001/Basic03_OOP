
// interface Ŭ������ Ȱ���ϱ� ���ؼ��� implements Ű����� �������̽��� ��ӹ޴´�.
// �������̽��� ���� ���� ��� ���� �� �ִ�.
// �������̽����� �������̽��� ��� �������� extends�� ����.
// ��ӹ��� ��� �߻� �޼ҵ�� �������̵��Ǿ�� �Ѵ�.
public class InterfaceMain implements InterfaceTest, InterfaceBoard{

	public InterfaceMain() {
		
	}
	
	public void write() {
		System.out.println("�Խ��� �۾���");
	}
	
	public int getName() {
		return MAX;
	}
	
	@Override
	public void show() {
		System.out.println("�� ���� ����");
		
	}
	
	@Override
	public void edit() {
		System.out.println("�����ϱ�");
		
	}
	
	@Override
	public void list() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		
		InterfaceMain im = new InterfaceMain();
		im.write();
		System.out.println(im.getName());
		System.out.println(im.MAX);
		System.out.println(InterfaceTest.MAX);

	}
}
