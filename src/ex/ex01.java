package ex;
/*
 * Topic: 寫一函數 square(n,c)，以 c 字元，印出邊長為 n 之實心正方形。Ex：square(3,'@') 將印出如下形狀
 @@@
 @@@
 @@@
 * Date: 2016/10/31
 * Author: 105021031 孟京澤
 */
import java.util.*;
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner src=new Scanner (System.in);
			System.out.println("請輸入一個符號: ");
			String a=src.next();
			System.out.println("請輸入邊長: ");
			int n=src.nextInt();
			square(a,n);
	}



public static void square (String val1,int v1)
{
	for(int i=0;i<=v1;i++)
	{
		for(int j=0;j<=v1;j++)
		{
			System.out.print(val1);
		}
		System.out.println("");
	}
	
}
}


