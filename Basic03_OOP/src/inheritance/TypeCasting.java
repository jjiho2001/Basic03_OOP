package inheritance;

import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
		
		Sedan s = new Sedan();
		Car c = new Car();
		Car cc = new Sedan();
		// Sedan ss = new Car(); error
		Object obj = new Sedan();
		
		//하위클래스의 오버라이딩은 상위클래스로 형변환되어도 하위클래스의 메소드기능이 구현된다.
		cc.speedUp();
		System.out.println(cc.color);
		System.out.println(cc.speed);
		
		//cc.speedUp(20); error, 기능이 숨어있음
		
		//하위로 객체로 만들어서 상위에 넣고 -> 다시 하위로 넣어짐(casting)
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
