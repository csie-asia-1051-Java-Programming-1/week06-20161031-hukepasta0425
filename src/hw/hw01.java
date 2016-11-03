package hw;
import java.util.*;
public class hw01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		System.out.println("請輸入溫度: ");
		float t = src.nextFloat();
		System.out.println("F->C選1 ");
		System.out.println("C->F選2 ");
		int a = src.nextInt();
		float b = fun1(t, a);
		System.out.println(b);

	}

	public static float fun1(float t1, int a1) {
		float sum = 0;

		if (a1 == 1) {
			sum = (t1 - 32) * 5 / 9;
		} else {
			sum = t1 * 9 / 5 + 32;
		}

		return sum;
	}

}
