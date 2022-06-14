package inheritance;

public class Car {

	int speed = 0;
	String color = "White";
	String brend = "¼Ò³ªÅ¸";
	
	public Car() {

	}
	
	public Car(String color, String brend) {
		this.color = color;
		this.brend = brend;
	}
	
	public void speedUp() {
		speed++;
		if(speed >= 100) speed = 100;
	}
	
	public void speedDown() {
		speed--;
		if(speed <= 0) speed = 0;
	}
}
