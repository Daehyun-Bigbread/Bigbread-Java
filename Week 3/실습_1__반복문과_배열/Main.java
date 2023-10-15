import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] unit = {50000, 10000, 1000, 100, 10, 1};
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
		
		for (int i = 0; i < unit.length; i++) {
			int count = money / unit[i];
			money %= unit[i];
			
			System.out.println(unit[i] + "원 짜리 " + count + "개");
		}
	}
}