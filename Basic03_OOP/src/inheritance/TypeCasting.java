package inheritance;

import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
		
		Sedan s = new Sedan();
		Car c = new Car();
		Car cc = new Sedan();
		// Sedan ss = new Car(); error
		Object obj = new Sedan();
		
		//����Ŭ������ �������̵��� ����Ŭ������ ����ȯ�Ǿ ����Ŭ������ �޼ҵ����� �����ȴ�.
		cc.speedUp();
		System.out.println(cc.color);
		System.out.println(cc.speed);
		
		//cc.speedUp(20); error, ����� ��������
		
		//������ ��ü�� ���� ������ �ְ� -> �ٽ� ������ �־���(casting)
		Sedan sss = (Sedan)cc;
		sss.speedUp(0);
		
		Object oo = new Sedan();
		// oo.speedUp(); error
		Sedan ssss = (Sedan)oo;
		
		ssss.speedUp();
		
		Object o1 = new String();
		Object o2 = new Scanner(System.in);
	}

}
