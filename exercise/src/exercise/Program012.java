package exercise;

import java.util.Scanner;

/*
 * 企业发放的奖金根据利润提成。
 * 利润低于或等于10万元时，奖金可提10%；
 * 利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；
 * 20万到40万之间时，高于20万元的部分，可提成5%；40万到60万之间时高于40万元的部分，可提成3%；
 * 60万到100万之间时，高于60万元的部分，可提成1.5%，高于100万元时，超过100万元的部分按1%提成，
 * 从键盘输入当月利润，求应发放奖金总数
 */

public class Program012 {
	/**
	 * @Title: getAward
	 * @Description: 根据利润计算奖金
	 * @return: double
	 */
	public static double getAward(double profit){
		double award = 0;
		if(profit <= 10){
			award = profit * 0.1;
		}else if(profit <= 20){
			award = 10 * 0.1 + (profit - 10) * 0.075;
		}else if(profit <= 40){
			award = 10 * 0.1 + 10 * 0.075 + (profit - 20) * 0.05;
		}else if(profit <= 60){
			award = 10 * 0.1 + 10 * 0.075 + 20 * 0.05 + (profit - 40) * 0.03;
		}else if(profit <= 100){
			award = 10 * 0.1 + 10 * 0.075 + 20 * 0.05 + 20 * 0.03 + (profit - 60) * 0.015;
		}else{
			award = 10 * 0.1 + 10 * 0.075 + 20 * 0.05 + 20 * 0.03 + 40 * 0.015 + (profit - 100) * 0.01;
		}
		return award;
	}

	public static void main(String []args){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Input profit:");
		double profit = sc.nextDouble();
		System.out.println("Award:" + getAward(profit));
	}
}

 