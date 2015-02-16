package exercise;
/*
 * 求1+2!+3!+...+20!
 */
public class Program021 {
	public static void main(String []args){
		long sum = 0;
		for(int i=1; i<=20; i++){
			sum += BaseTool.getFactorial(i);
		}
		System.out.println(sum);
	}
}

 