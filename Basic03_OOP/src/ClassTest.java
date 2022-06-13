import java.util.Scanner;

// package : ����

public class ClassTest {
	
	// Class ���� : ����� ����, ������� �������(��������)
	
	int num = 1234;
	final int MAX = 100; // ���ȭ�� ���� : ���� ������ �� ����. �������� ��� �빮�ڷ� �Ѵ�.
						// Math.PI, Calendar.YEAR, ....
	
	// ���۷��� ����, �ν��Ͻ� : instance
	Scanner scan = new Scanner(System.in);
	
	// ������ �޼ҵ� : ��ü�� �����ϴ� ���
	// ��Ģ : �޼ҵ���� �ݵ�� Ŭ������� ���ƾ� �Ѵ�.
	//		 ��ü ������ �� �� ����(��ü������ �� �ʱ�ȯ���� ������� �� �ִ�.)
	//		 �����ڴ� ��ȯ���� ����
	ClassTest(){
		//���๮�� ���� ��. ���� ����, ����, if, for, while, �迭...
		System.out.println("ClassTest() ������ �޼ҵ�");
	}
	ClassTest(int num){
		System.out.println(this.num);
		System.out.println(num);
		System.out.println("ClassTest(int) ������ �޼ҵ�");
	}
	ClassTest(String name, int num){
		System.out.println("ClassTest(String, int) ������ �޼ҵ�");
		System.out.println("�̸� = " + name + ", ��ȣ : " + num);
	}
	ClassTest(int num, String name){
		// ������ �޼ҵ忡�� �ٸ� ������ �޼ҵ� �����ϱ�
		// �ٸ� �����ڸ� �ҷ��� ��, ù ��° �ٿ� ���� �ؾ���.
		this(name, num);
	}
	
	// �޼ҵ� : ��ɱ���
	//		  �ҹ��ڷ� �����Ѵ�.
	//		  ��ȯ���� �������� �������� �ִ�. ��ȯ���� ���� ���� void Ű����� ��ü
	// ���� : ��ȯ�� �޼ҵ��(�Ű�����){}
	void sum() {
		int a = 0;
		for(int i = 1; i <= 100; i++) a += i;
		System.out.println("1~100������ ���� " + a);
	}
	
	String sum2() {
		int a = 0;
		for(int i = 1; i <= 100; i++) a += i;
		return "���ϱ�" + a;
	}
	
	// ����Ŭ���� : Ŭ������ ����� �����ϴ� ����Ŭ����, �޼ҵ峻�� �����ϴ� ����Ŭ����, �͸��� ����Ŭ����
	// �̰͵� Ŭ�����̱� ������ .class������ ������
	class Test{
		
	}
}
