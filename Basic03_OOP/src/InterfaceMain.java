
// interface 클래스를 활용하기 위해서는 implements 키워드로 인터페이스를 상속받는다.
// 인터페이스는 여러 개를 상속 받을 수 있다.
// 인터페이스에서 인터페이스를 상속 받을때는 extends를 쓴다.
// 상속받은 모든 추상 메소드는 오버라이딩되어야 한다.
public class InterfaceMain implements InterfaceTest, InterfaceBoard{

	public InterfaceMain() {
		
	}
	
	public void write() {
		System.out.println("게시판 글쓰기");
	}
	
	public int getName() {
		return MAX;
	}
	
	@Override
	public void show() {
		System.out.println("글 내용 보기");
		
	}
	
	@Override
	public void edit() {
		System.out.println("수정하기");
		
	}
	
	@Override
	public void list() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		
		InterfaceMain im = new InterfaceMain();
		im.write();
		System.out.println(im.getName());
		System.out.println(im.MAX);
		System.out.println(InterfaceTest.MAX);

	}
}
