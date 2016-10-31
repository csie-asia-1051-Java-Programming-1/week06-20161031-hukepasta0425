package ex;
/*
 * Topic: 使用者輸入一個大正整數值，請設計一個函數fun1(n)可以計算該大數字裡的數字總合。例如:輸入: 4832 則輸出 17
 * Date: 2016/10/31
 * Author: 105021031 孟京澤
 */
import java.util.*;
public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner (System.in);
		System.out.print("請輸入大整數: ");
		int n=src.nextInt();
		int m=fun1(n);
		System.out.print(m);
	}
	public static int fun1(int a)
	{
		int sum=0;
		while(a>0)
		{
			sum=sum+a%10;
			a=a/10;
		}
		return sum;
	}

}
