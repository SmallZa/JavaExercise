package exercise;

import java.util.Scanner;

public class Program025 {			
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("input a digital");
		int digital = sc.nextInt();
		System.out.println(BaseTool.isPalindrome(digital));
	}
}

 