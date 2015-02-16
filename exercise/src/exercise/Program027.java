package exercise;


/*
 * 求100之内的素数
 */
public class Program027 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<=100; i++){
			if(BaseTool.isPrime(i)){
				System.out.println(i);
			}
		}
	}
}

 