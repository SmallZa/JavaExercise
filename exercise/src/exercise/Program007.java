package exercise;

import java.util.Scanner;

/*
 * 输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数
 */
public class Program007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);		
		System.out.println("Input a string:");
		str = sc.nextLine();
		System.out.println(BaseTool.getStringStatistic(str));
	}

}

 