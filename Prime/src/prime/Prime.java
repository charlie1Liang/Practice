package prime;

import java.util.Date;
import java.util.Scanner;

/**
 * 
 * @ClassName: Prime
 * @Description:TODO
 * @author: Charlie
 * @date: 2020-7-11 19:15:39
 *
 */
public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please input the long number");
		Long input = sc.nextLong();
		System.out.println("faster cal start: " + new Date());
		System.out.println(primeSum2(input));
		System.out.println("faster cal end: " + new Date());
		
		System.out.println("slow cal start: " + new Date());
		System.out.println(primeSum(input));
		System.out.println("slow cal end: " + new Date());
		
	}
/**
 * 
 * @Title: primeSum  
 * @author Charlie 
 * @Description: find all the number small than count,
 *  caculate the prime number sum   
 * @param count
 * @return      
 * @return: long      
 * @throws
 */
	private static long primeSum(long count) {
		int sum = 0;
		for (int a = 2; a < count; a++) {
			boolean flag = true;
			for (long b = count-1 ; b > 1; b--) {
				if (a != b) {
					if (a % b == 0) {
						flag = false;
						break;
					}
				}
			}
			if (flag) {
				sum = sum + a;
			}
		}
		return sum;
	}
/**
 * 
 * @Title: primeSum2  
 * @author Charlie 
 * @Description: find all the number small than count,
 *  caculate the prime number sum  (tuning version)   
 * @param number
 * @return      
 * @return: long      
 * @throws
 */
	private static long primeSum2(long number) {
		long sum = 0;
		for (int i = 2; i < number; i++) {
			boolean flag = true;
			for (int a = 2; a * a <= i; a++) {
				if (i % a == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				sum = sum + i;
			}

		}
		return sum;

	}
}
