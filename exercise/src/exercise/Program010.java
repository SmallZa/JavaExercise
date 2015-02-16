package exercise;

import java.util.HashMap;
import java.util.Map;

/*
 * 一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下.
 * 求它在第10次落地时，共经过多少米？第10次反弹多高
 */
public class Program010 {
	/**
	 * @Title: getBallDropStatistic
	 * @Description: 根据初始高度h，计算小球第n次反弹的高度和第n次落地时走过的总距离 
	 * @return: Map<String,Double>
	 */
	public static Map<String, Double> getBallDropStatistic(double h, int n){
		double height = h/(Math.pow(2, n));
		double distance = 0;
		if(n == 1){
			distance = 1;
		}else{
			for(int i=2; i<=n; i++){
				distance += 2*(h/(Math.pow(2, i-1)));//除去第一次落下之外，每一次弹起的高度都要经过2次
			}
			distance = distance + h;//加上第一次落下的高度
		}
		Map<String, Double> map = new HashMap<String, Double>();
		map.put("height", height);
		map.put("distance", distance);	
		return map;
	}
	
	
	public static void main(String []args){
		System.out.println(getBallDropStatistic(100, 5));
		System.out.println(getBallDropStatistic(100, 10));
	}
}

 