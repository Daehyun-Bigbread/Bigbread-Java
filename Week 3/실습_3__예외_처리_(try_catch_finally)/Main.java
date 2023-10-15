import java.io.*;
import java.util.*;

class Main {
	public static int sum(int n, int m) {
		return n + m; 
	}
	public static int sub(int n, int m) {
		return n - m; 
	}
	public static int mul(int n, int m) {
		return n * m; 
	}
	public static int div(int n, int m) {
		return n / m; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		
		while(true)
		{
			x = sc.nextInt();
			y = sc.nextInt();
			
			if (x == 0 || y == 0)
			{
				System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요.");
			}
			else
			{
				break;
			}
			
		}
		
		try
		{
			
			int sum = sum(x,y);
			int sub = sub(x,y);
			int mul = mul(x,y);
			int div = div(x,y);
			
			System.out.println(x+" + "+y+" = "+sum);
			System.out.println(x+" - "+y+" = "+sub);
			System.out.println(x+" * "+y+" = "+mul);
			System.out.println(x+" / "+y+" = "+div);
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);
		}
	}
}
