package exercise;

import java.util.Scanner;

/*
 * 求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
 * 例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制
 */
public class Program008 {
	/**
	 * @Title: add
	 * @Description: 求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。 
	 * @return: long
	 */
	public static long add(int digital, int cycle){
		long sum = 0;
		long temp =0;
		for(int i=0; i<cycle; i++){
			temp = 0;
			for(int j=0; j<i+1; j++){				
				temp += digital * (Math.pow(10, j));
			}
			sum += temp;
		}
		return sum;
	}
	
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("input a digital:");
		int digital = sc.nextInt();
		System.out.println("input cycle");
		int cycle = sc.nextInt();
		System.out.println(add(digital, cycle));
	}

}

 