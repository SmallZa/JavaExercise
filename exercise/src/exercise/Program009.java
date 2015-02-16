package exercise;
/*
 * 一个数如果恰好等于它的因子之和，这个数就称为 "完数 "。例如6=1＋2＋3.
 * 编程找出1000以内的所有完数
 */
public class Program009 {
	public static void main(String[] args){
		//System.out.println(BaseTool.getFactors(24));
		for(int i=1; i<1001; i++){
			if(BaseTool.isComplete(i)){
				System.out.println(i);
			}
		}
	}
}

 