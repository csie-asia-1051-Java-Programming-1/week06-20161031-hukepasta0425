package ex;
/*
 * Topic: 使用者輸入兩個整數，透過函數呼叫輸出排列組合函數 C(m,n)。公式: C(m,n) = m!/n!(m-n)!
 * Date: 2016/10/31
 * Author: 105021031 孟京澤
 */
import java.util.*;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner (System.in);
		System.out.print("請輸入兩個整數: ");
		int m=src.nextInt(),n=src.nextInt();
		int x=fun1(m,n);
		System.out.print(x);
		
	}
	public static int fun1 (int m1,int n1)
	{
		int a1=1;
		int a2=1;
		int a3=1;
		int sum=0;
		int mn=(m1-n1);
		for(int i=m1;i>0;i--)
		{
			a1=a1*i;
		}
		for(int j=n1;j>0;j--)
		{
			a2=a2*j;
		}
		for(int k=mn;k>0;k--)
		{
			a3=a3*k;
		}
		
		sum=a1/(a2*a3);
		return sum;
	}


}
