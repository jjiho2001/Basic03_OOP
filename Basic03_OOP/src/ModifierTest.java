import pac.Test;

public class ModifierTest {

	public static void main(String[] args) {
		
		// public > protected > default(����) > private
		
		Test t = new Test();
		// System.out.println(t.num); ���� ������ default : error
		System.out.println(t.name);
		// t.gugudan(8); ���� ������ default : error
	}

}
