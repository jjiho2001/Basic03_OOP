package innerClass;

public class AnonymousInner {

	AnonymousInner(){
		
		Student s = new Student() {
		
		@Override
		void studentOutput() {
				System.out.println(no);
				System.out.println(name);
				System.out.println(grade);
			};
		};
			s.studentOutput();
	}
	
	public static void main(String[] args) {
		
		new AnonymousInner();
	}

}
