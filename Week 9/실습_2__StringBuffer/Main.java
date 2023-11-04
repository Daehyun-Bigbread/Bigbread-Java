import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // 단어 input
		String word = scanner.nextLine();
		scanner.close();
		
		StringBuffer sb = new StringBuffer(word); // 회문 입력 받아와서 배열에 저장
		sb.reverse(); // 회문
		
		if(word.equals(sb.toString())) {
			System.out.println(word + " 은/는 회문입니다.");
		} else {
			System.out.println(word + " 은/는 회문이 아닙니다.");
		}
	}
}
