import java.io.*;
import java.util.*;

public class Main {
	public static int compare(int num1, int num2, int num3) {
		int result1 = (num1 > num2) ? num1 : num2;
		int result2 = (num3 > result1) ? num3 : result1;
		return result2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		
		int num2 = sc.nextInt();
		
		int num3 = sc.nextInt();
		
		int result = compare(num1, num2, num3);
		System.out.println("가장 큰 숫자는 "+result+"입니다.");
		
	}

}

