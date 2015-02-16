package exercise;


/*
 * 一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少
 */
public class Program013 {
	public static void main(String []args){
		for(int i=0; i<Integer.MAX_VALUE; i++){
			if(BaseTool.isCompleteSquare(i+100) && BaseTool.isCompleteSquare(i+168)){
				System.out.println(i);
			}
		}
	}
}

 