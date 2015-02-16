package exercise;

import java.util.Scanner;

/*
 * 请输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继续判断第二个字母
 */
public class Program026 {
	public static String getWeek(String week){
		switch(week.charAt(0)){
			case 'm' : return "Monday";
			case 'w' : return "Wndnesday";
			case 'f' : return "Friday";
			case 't' : return (week.charAt(1)=='u') ? "Tuesday" : "Thursday";
			case 's' : return (week.charAt(1)=='a') ? "Saturday" : "Sunday";
			default : return "error";
		}
	}
	public static void main(String []args){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("input a week day");
		String week = sc.next();
		System.out.println(getWeek(week));
		
	}
}

 