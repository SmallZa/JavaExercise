package exercise;

import java.util.Iterator;
import java.util.List;

/*
 * 将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5
 */
public class Program004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long begin = System.currentTimeMillis();
		List<Integer> primes = BaseTool.getPrimeFactors(123456);
		Iterator<Integer> it = primes.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		long end = System.currentTimeMillis();
		long durance = end - begin;
		System.out.println("time cost:" + durance);
		
		System.out.println("---------------------------------");
		
		long begin1 = System.currentTimeMillis();
	    primes = BaseTool.getPrimeFactors_plus(123456);
		it = primes.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		long end1 = System.currentTimeMillis();
		long durance1 = end1 - begin1;
		System.out.println("time cost:" + durance1);
	}

}

 