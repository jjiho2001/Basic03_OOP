import pac.Test;

public class ModifierTest {

	public static void main(String[] args) {
		
		// public > protected > default(생략) > private
		
		Test t = new Test();
		// System.out.println(t.num); 접근 제한자 default : error
		System.out.println(t.name);
		// t.gugudan(8); 접근 제한자 default : error
	}

}
