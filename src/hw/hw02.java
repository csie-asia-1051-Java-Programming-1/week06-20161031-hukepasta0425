package hw;

import java.util.*;

public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		System.out.println("請輸入性別(男1/女2): ");
		int val= src.nextInt();
		System.out.println("請輸入身高(CM): ");
		int h=src.nextInt();
		fun1(val,h);
		}
		
		
		public static void fun1 (int val1, int h1) {
			float sum = 0;

			if (val1 ==1) {
				sum = (h1-170)*0.6f+62;
			} else {
				sum =(h1-158)*0.5f+52;
			}
			System.out.println(sum);
			
		}
	}


