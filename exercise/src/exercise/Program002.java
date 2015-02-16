package exercise;
/*
 * 判断101-200之间有多少个素数，并输出所有素数
 */
public class Program002 {
	
	public static void main(String []args){
		for(int i=101; i<200; i++){
			if(BaseTool.isPrime(i)){
				System.out.println(i);
			}
		}
		//System.out.println(BaseTool.isPrime(643));
	}
}

 