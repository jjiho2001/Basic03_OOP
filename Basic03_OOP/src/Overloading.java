
public class Overloading {

	public Overloading() {
		
	}
	
	// 1~100까지 합
	public void sum() {
		System.out.println("5050");
	}

	// 1~? 까지의 합
	public void sum(int max) {
		int total = 0;
		for(int i = 1; i <= max; i++) {
			total += i;
		}
		System.out.println(total);
	}
	
	// 1~? 홀수 합
	public void sum(int max, String msg) {
		int total = 0;
		for(int i = 1; i <= max; i+=2) {
			total += i;
		}
		System.out.println(total);
	}
	
	// 1~? 짝수 합
	public void sum(String msg, int max) {
		int total = 0;
		for(int i = 2; i <= max; i+=2) {
			total += i;
		}
		System.out.println(total);
	}
	
	public static void main(String[] args) {
		
		Overloading o = new Overloading();
		o.sum();

	}

}
