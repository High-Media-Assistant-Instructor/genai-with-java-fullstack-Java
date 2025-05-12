package javatimeex;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class TimeEX02 {
	public static void main(String[] args) {
		// 시간객체 포맷 설정
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS a");
		// atStartOfDay() : 자정 (시작 시간)
		// now() : 오늘 날짜
		// format(formatter) : 정해진 형식으로 출력
		String date = LocalDate.now().atStartOfDay().format(formatter);
		System.out.println("금일 자정: " + date + "\n");

		// plusDays(parameter) : 날짜에 parameter을 더한 시간
		LocalDateTime tomorrow = LocalDateTime.now().plusDays(1);
		date = tomorrow.format(formatter);
		System.out.println("내일 현재 시간: " + date + "\n");

		// .with(LocalTime.MAX) : 그 날짜의 마지막 시간
		tomorrow =  LocalDateTime.now().plusDays(1).with(LocalTime.MAX);
		date = tomorrow.format(formatter);
		System.out.println("내일의 맨 마지막 시간: " + date + "\n");

		// .with(LocalTime.MIN) : 그 날짜의 처음 시간
		tomorrow =  LocalDateTime.now().plusDays(1).with(LocalTime.MIN);
		date = tomorrow.format(formatter);
		System.out.println("내일의 처음 시간: " + date + "\n");

		// .with(LocalTime.NOON) : 그 날짜의 정오 시간
		LocalDateTime todate = LocalDateTime.now().with(LocalTime.NOON);
		date = todate.format(formatter);
		System.out.println("오늘 날짜의 정오: " +  date + "\n");

		// getDayOfWeek() : 요일 정보
		// TextStyle.SHORT : 짧은 형식
		todate = LocalDateTime.now();
		String dayOfWeek = todate.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.getDefault());
		date = todate.format(formatter);
		System.out.println(date+" "+ dayOfWeek);
	}
}