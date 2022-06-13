import java.util.Calendar;
import java.util.Scanner;

public class ConsoleCalendarOOP {

	// 콘솔에서 년도와 월을 입력
	Scanner scan = new Scanner(System.in);
	Calendar date = Calendar.getInstance();
	
	// 매게변수가 없는 생성자 메소드는 기술하지 않으면 컴파일러가 자동으로 넣어준다.
	ConsoleCalendarOOP(){
		// startCalendar(); 이것도 가능
	}
	
	//달력의 header 출력
	void titlePrint(int year, int month) {
		System.out.printf("\t\t%d년 %d월\n", year, month);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
	}
	// 1일에 대한 요일
	int getWeek(int year, int month) {
		date.set(year, month-1, 1);
		return date.get(Calendar.DAY_OF_WEEK);
	}
	//공백 출력
	void spacePrint(int week) {
		for(int i = 1; i < week; i++) {
			System.out.print("\t");
		}
	}
	//년도와 월 입력
	int inData(String msg) {
		System.out.print(msg + "->");
		return scan.nextInt();
	}
	//날짜 출력
	void dayPrint(int week, int lastDay) {
		for(int d=1 ; d <= lastDay; d++) {
			System.out.print(d+ "\t");
			if((d+week-1) % 7 == 0) System.out.println();
		}
	}
	
	void startCalendar() {
		int year = inData("년도");
		int month = inData("월");
		
		titlePrint(year, month);
		
		int week = getWeek(year, month);
		
		spacePrint(week);
		
		int lastDay = date.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		dayPrint(week, lastDay);
	
	}
	
}
