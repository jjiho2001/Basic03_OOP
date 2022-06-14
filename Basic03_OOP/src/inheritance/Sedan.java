package inheritance;

//extends : Ŭ������ ��ӹ��� �� (1���� ��Ӱ���)
public class Sedan extends Car {

	String color = "red";
	public Sedan() {
		// ����Ŭ������ ������ �޼ҵ忡�� ����Ŭ������ �����ڸ޼ҵ� ȣ��
		// �ݵν� ù��° ���๮���� ����Ǿ� �Ѵ�.
		super("lightblue","�ҷ���");
	}
	
	public Sedan(String color) {
		
		
		//���� Ŭ���� ����Ŭ������ ���� ��������� ������ ��,
		//����Ŭ������ ��������� �����Ѵ�.
		this.color = color;
		super.color = color;
	}
	
	// overriding : �޼ҵ带 ������ 
	public void speedUp() {
		speed += 10;
		if(speed >= 200) speed = 200;
	}
	
	public void speedUp(int a) {
		
	}
	
	/*
	public static void main(String[] args) {
		
		// ��� ���迡�� ������ �޼ҵ�� ���� Ŭ���� ������ �޼ҵ尡 ���� �����.
		Sedan s = new Sedan("blue");
		System.out.println(s.color);
		System.out.println(s);
		s.speedUp();
	}*/
}
