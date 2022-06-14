package pac;

public class Information {

	int num = 1234;
	protected String userid = "goguma";
	
	protected Information(){
		System.out.println("Information의 생성자 메소도");
	}
	
	String getUserid() {
		return userid;
	}
}
