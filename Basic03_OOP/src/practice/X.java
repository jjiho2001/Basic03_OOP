package practice;

public class X {

	X(){
		System.out.println(1);
	}
	X(int a){
		this();
		System.out.println(2);
	}
}
