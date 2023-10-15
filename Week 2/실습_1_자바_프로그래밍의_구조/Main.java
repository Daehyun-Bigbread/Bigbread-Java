import java.io.*;
import java.util.*;

public class Main {
	public static float sum(float n, float m) {
		return n + m;
	}
	public static float sub(float n, float m) {
		return n - m;
	}
	public static float mul(float n, float m) {
		return n * m;
	}
	public static float div(float n, float m) {
		return n / m;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float x = sc.nextFloat();
		float y = sc.nextFloat();
		
		float sum = sum(x,y);
		float sub = sub(x,y);
		float mul = mul(x,y);
		float div = div(x,y);
		
		System.out.println(x+" + "+y+" = "+sum);
		System.out.println(x+" - "+y+" = "+sub);
		System.out.println(x+" * "+y+" = "+mul);
		System.out.println(x+" / "+y+" = "+div);
	}
		
}
