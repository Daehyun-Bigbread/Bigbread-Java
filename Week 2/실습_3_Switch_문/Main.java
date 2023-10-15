import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int month = sc.nextInt();
		
		String season = "";
		String a = "현재 계절은 %s 입니다.";
			
		switch (month)
		{
			case 1:
				season = "겨울";
				break;
			case 2:
				season = "겨울";
				break;
			case 3:
				season = "봄";
				break;
			case 4:
				season = "봄";
				break;
			case 5: 
				season = "봄";
				break;
			case 6:
				season = "여름";
				break;
			case 7:
				season = "여름";
				break;
			case 8: 
				season = "여름";
				break;
			case 9:
				season = "가을";
				break;
			case 10: 
				season = "가을";
				break;
			case 11: 
				season = "가을";
				break;
			case 12: 
				season = "겨울";
				break;
			default:
				System.out.println("입력값이 잘못되었습니다.");
				return ;
		}
		
		System.out.println("현재 계절은 "+season+"입니다.");
	}
}
