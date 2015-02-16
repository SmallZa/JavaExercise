package exercise;

import java.util.Scanner;

//输入某年某月某日，判断这一天是这一年的第几天
public class Program014 {
	public static void main(String []args){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a year:");
		int year = sc.nextInt();
		System.out.println("Input a month:");
		int month = sc.nextInt();
		System.out.println("Input a day:");
		int day = sc.nextInt();
		System.out.println("这是一年中的第" + BaseTool.getDays(year, month, day) + "天");
	}
	
}

 