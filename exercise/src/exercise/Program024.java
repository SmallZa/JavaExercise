package exercise;

import java.util.Scanner;

/*
 * 给定一个不多于5位的正整数
 * 要求：一、求它是几位数，二、逆序打印出各位数字
 */
public class Program024 {
	
	/**
	 * @Title: reversePrint
	 * @Description: 逆向打印n，并输入n是几位数 
	 * @return: int   
	 */
	public static void reversePrint(int n){
		String str = n +"";
		for(int i=str.length()-1; i>=0; i--){
			System.out.print(str.charAt(i));
		}
		System.out.println();
		System.out.println("这是" + str.length() + "位数");
	}
	public static void main(String []args){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("input a digital");
		int n = sc.nextInt();
		reversePrint(n);
	}
}

 