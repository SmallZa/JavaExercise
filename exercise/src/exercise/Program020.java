package exercise;
/*
 * 有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和
 */
public class Program020 {
	/**
	 * @Title: sum
	 * @Description: 有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13, 求前n项和 
	 * @return: double   
	 */
	public static double sum(int n){
		double sum = 0;
		for(int i=1; i<=n; i++){
			sum = sum + (((double)BaseTool.getFabonacci(i+2) / BaseTool.getFabonacci(i+1)));
		}
		return sum;
	}
	
	public static void main(String []args){
		double sum = sum(20);
		System.out.println(sum);
	}
}

 