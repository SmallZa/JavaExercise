package exercise;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @ClassName:     BaseTool.java
 * @Description:   TODO
 * 
 * @author         zhaihuayang
 * @version        V1.0  
 * @Date           2015年2月16日 下午2:45:54 
 */
public class BaseTool {
	
	//闰年第n个月最后一天距离元旦的天数
	private final static int LeapYear[]={
		0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335, 366
	}; 
	//平年第n个月最后一天距离元旦的天数
	private final static int CommonYear[]={
		0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365
	};
	
	/**
	 * @Title: getRabit
	 * @Description: get nth Fabonacci
	 * @return: int
	 */
	public static int getFabonacci(int n){
		if(n==1 || n==2){
			return 1;
		}
		return getFabonacci(n-2) + getFabonacci(n-1);
	}
	
	/**
	 * @Title: isPrime
	 * @Description: 判断是否是素数 
	 * @return: boolean
	 */
	public static boolean isPrime(int digital){
		//对正整数n，如果用2到 sqrt(n)之间的所有整数去除，均无法整除，则n为质数
		if(digital<2){
			return false;
		}
		if(digital == 2){
			return true;
		}
		int temp = (int) Math.sqrt(digital) + 1;
		for(int i=2; i<temp; i++){
			if(digital%i == 0){
				return false;
			}
		}
		return true;
	}
	
	/** 
	 * @Title: isDaffodils
	 * @Description: 判断一个数是不是水仙花数
	 * @return: boolean
	 */
	//所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身
	public static boolean isDaffodils(int digital){
		int h = digital / 100;
		int t = (digital-(h*100)) / 10;
		int b = digital - h*100 - t*10;
		if(Math.pow(h, 3) + Math.pow(t, 3) + Math.pow(b, 3) == digital){
			return true;
		}
		return false;
	}
	
	/**
	 * @Title: getPrimeFactors
	 * @Description: 分解因质数 
	 * @return: List<Integer>
	 */
	public static List<Integer> getPrimeFactors(int digital){
		List<Integer> primes = new ArrayList<Integer>();//返回分解的质数
		if(BaseTool.isPrime(digital)){//如果质数，直接返回1和它本身
			primes.add(1);
			primes.add(digital);
			return primes;
		}
		int temp = digital;
		List<Integer> dividers = new ArrayList<Integer>();//存放待循环遍历的质数数组
		for(int i=2; i<digital; i++){
			if(BaseTool.isPrime(i)){
				dividers.add(i);
			}
		}
		
		//在质数数组中从小到大遍历，若可被质数整除，则将该质数放入待返回的数组，
		//并将digital置为除以该质数以后的数值，重新遍历判断
		while(!BaseTool.isPrime(temp)){
			for(int i=0; i<dividers.size(); i++){
				if(temp%dividers.get(i) == 0){
					temp = temp / dividers.get(i);
					primes.add(dividers.get(i));	
					i = -1;//重头开始遍历
				}
			}
		}
		return primes;
	}
	
	/**
	 * @Title: getPrimeFactors_plus
	 * @Description: 分解因质数改进 
	 * @return: List<Integer>
	 */
	public static List<Integer> getPrimeFactors_plus(int digital){
		List<Integer> primes = new ArrayList<Integer>();//返回分解的质数
		if(BaseTool.isPrime(digital)){//如果质数，直接返回1和它本身
			primes.add(1);
			primes.add(digital);
			return primes;
		}
		int temp = digital;
		int k = 2;
		while(!BaseTool.isPrime(temp)){
			if(temp % k == 0){
				temp = temp / k;
				primes.add(k);
			}
			else{
				k++;
			}
		}
		primes.add(temp);
		return primes;
	}
	
	/**
	 * @Title: gradeCls
	 * @Description: 分等级 
	 * @return: char
	 */
	public static char gradeCls(int grade){
		return grade>=90 ? 'A' : (grade<60 ? 'C' : 'B');
	}
	
	/**
	 * @Title: max
	 * @Description: 返回两个正整数中较大的数 
	 * @return: int
	 */
	public static int max(int m, int n){
		return m>n ? m : n;
	}
	
	/**
	 * @Title: min
	 * @Description: 返回两个正整数中较小的数 
	 * @return: int
	 */
	public static int min(int m, int n){
		return m>n ? n : m;
	}
	
	/**
	 * @Title: getMaxCommonDivisor
	 * @Description: 计算两个数的最大公约数 
	 * @return: int
	 */
	public static int getMaxCommonDivisor(int m, int n){
		int max = max(m, n);
		int min = min(m, n);
		if(max%min == 0){
			return n;
		}else{
			return getMaxCommonDivisor(min, max%min);
		}
	}
	
	/**
	 * @Title: getMinCommonMulitple_
	 * @Description: 计算两个数的最小公倍数 
	 * @return: int
	 */
	public static int getMinCommonMulitple_(int m, int n){
		return m * n / getMaxCommonDivisor(m, n);
	}
	
	/** 
	 * @Title: getStringStatistic
	 * @Description: 统计字符串中英文字母、空格、数字和其他字符的个数 
	 * @return: Map<String,Integer>
	 */
	public static Map<String, Integer> getStringStatistic(String str){
		Map<String, Integer> statistics = new HashMap<String, Integer>();
		int letter = 0;
		int digital = 0;
		int space = 0; 
		int others = 0;
		for(int i=0; i<str.length(); i++){
			char temp = str.charAt(i);
			if((temp>'a' && temp<'z') || (temp>'A') && (temp<'Z')){
				letter++;
				continue;
			}
			if(temp>'0' && temp<'9'){
				digital++;
				continue;
			}
			if(temp == ' '){
				space++;
				continue;
			}
			others++;
		}
		statistics.put("letter", letter);
		statistics.put("digital", digital);
		statistics.put("space", space);
		statistics.put("others", others);
		return statistics;
	}
	
	/**
	 * @Title: getFactors
	 * @Description: 找出一个数除了该数本身之外的所有因数 
	 * @return: List<Integer>
	 */
	public static List<Integer> getFactors(int digital){
		List<Integer> factors = new ArrayList<Integer>();
		for(int i=1; i<(digital/2)+1; i++){
			if(digital%i == 0){
				factors.add(i);
			}
		}
		return factors;
	}
	
	/**
	 * @Title: isComplete
	 * @Description: 判断一个数是不是完数 
	 * @return: boolean
	 */
	//一个数如果恰好等于它的因子之和，这个数就称为 "完数 "
	public static boolean isComplete(int digital){
		List<Integer> factors = BaseTool.getFactors(digital);
		int sum = 0;
		Iterator<Integer> it = factors.iterator();
		while(it.hasNext()){
			sum += (int)it.next();
		}
		if(sum == digital){
			return true;
		}
		return false;
	}
	
	/**
	 * @Title: isCompleteSquare
	 * @Description: 判断一个数是否为完全平方数 
	 * @return: boolean
	 */
	public static boolean isCompleteSquare(int digital){
		for(int i=0; i<=digital; i++){
			if(i*i == digital){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * @Title: isLeapYear
	 * @Description: 判断给定年份是否为闰年 
	 * @return: boolean
	 */
	public static boolean isLeapYear(int year){
		//能被4整除却不能被100整除 或 能被400整除的年份是闰年
		if(((year%4==0) && (year%100!=0)) || year%400==0){
			return true;
		}
		return false;
	}
	
	/**
	 * @Title: getDays
	 * @Description: 根据年月日返回这是一年中的第几天 
	 * @return: int
	 */
	public static int getDays(int year, int month, int day){
		int days = 0;
		if(isLeapYear(year)){
			days = LeapYear[month-1] +day;
		}else{
			days = CommonYear[month-1] +day;
		}
		return days;
	}
	
	/**
	 * @Title: printDiamond
	 * @Description: 打印菱形 
	 * @return: void   
	 */
	public static void printDiamond(int rows){
		for(int i=0; i<(rows+1) / 2; i++) {
			for(int j=0; j<rows/2-i; j++) {
	            System.out.print(" ");
			}
			for(int k=1; k<(i+1)*2; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
		for(int i=1; i<=rows/2; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=rows-2*i; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	/**
	 * @Title: getFactorial
	 * @Description: 求n的阶乘 
	 * @return: long   
	 */
	public static long getFactorial(int n){
		if(n==1 || n==0){
			return 1;
		}else{
			return n * getFactorial(n-1);
		}
	} 
	
	/**
	 * @Title: isPalindrome
	 * @Description: 判断一个数是不是回文数 
	 * @return: boolean   
	 */
	public static boolean isPalindrome(long digital){
		String str = digital + "";
		for(int i=0; i<str.length()/2; i++){
			if(str.charAt(i) != str.charAt(str.length()-i-1)){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * @Title: bubbleSort
	 * @Description: 冒泡排序 
	 * @return: Object[]   
	 */
	public static void bubbleSort(int []list){
		for(int i=0; i<list.length; i++){
			for(int j=0; j<list.length-i-1; j++){
				if(list[j] > list[j+1]){
					int temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
				}
			}
		}
	}
	
	/*
	 * quickSort调用，选取中轴
	 */
	private static int getMiddle(int[] list, int low, int high) {  
        int tmp = list[low];    //数组的第一个作为中轴  
        while (low < high) {  
            while (low < high && list[high] > tmp) {  
                high--;  
            }  
            list[low] = list[high];   //比中轴小的记录移到低端  
            while (low < high && list[low] < tmp) {  
                low++;  
            }  
            list[high] = list[low];   //比中轴大的记录移到高端  
        }  
        list[low] = tmp;              //中轴记录到尾  
        return low;                   //返回中轴的位置  
    }  

	/**
	 * @Title: quickSort
	 * @Description: 快速排序 
	 * @return: int[]
	 */
	public static void quickSort(int []list, int low, int high){
		if(low<high){
			int middle = getMiddle(list, low, high);
			quickSort(list, low, middle-1);
			quickSort(list, middle+1, high);	
		}
	}
}

 