package exercise;
/*
 * 有1、2、3、4四个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 */
public class Program011 {
	public static void main(String[] args){
		for(int i=1; i<=4; i++){
			for(int j=1; j<=4; j++){
				for(int k=1; k<=4; k++){
					if(i !=j && j !=k && k!=i){
						System.out.println(i*100 + j*10 + k);
					}
				}
			}
		}
	}
}

 