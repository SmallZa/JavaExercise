package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * 输入三个整数x,y,z，请把这三个数由小到大输出
 */
public class Program015 {
	public static void main(String []args){
		List<Integer> digitals = new ArrayList<Integer>();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("input first digital");
		int first = sc.nextInt();
		digitals.add(first);
		System.out.println("input second digital");
		int second = sc.nextInt();
		digitals.add(second);
		System.out.println("input third digital");
		int third = sc.nextInt();
		digitals.add(third);
		Collections.sort(digitals);
		System.out.println(digitals);
	}
}


 