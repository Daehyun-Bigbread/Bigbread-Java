import java.io.*;
import java.util.*;

public class Cat{
	String name; // 고양이 이름
	int age; // 고양이 나이
	int location; // 고양이 위치

	public Cat(){ // 고양이 생성자
		name = "cat"; age = 0; location = -1;
	}
	public Cat(String t, int n, int m){ // 고양이 생성자
		// 여기에 코드 작성
		name = t; // 이름
		age = n; // 나이
		location = m; // 위치
	}

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		Cat[] c = new Cat[3];
		// 여기에 코드 작성
		
		// 3마리의 고양이 정보 입력 받기
		for (int i=0; i<3; i++)
		{
			String name = scanner.next(); // 고양이 이름 입력
			int age = scanner.nextInt(); // 고양이 나이 입력
			int location = scanner.nextInt(); //고양이 위치 입력
			c[i] = new Cat(name, age, location); // 고양이 객체 생성후 배열 저장
		}
		
		Arrays.sort(c, Comparator.comparingInt(cat -> cat.location)); // 고양이들 위치 기준으로 정렬

		// 고양이 가 움직일수 있는 최대 거리 계산
		int cat1Moves = c[2].location - c[1].location - 1;
		int cat2Moves = Math.min(c[1].location - c[0].location, c[2].location - c[1].location) - 1;
		int cat3Moves = c[1].location - c[0].location - 1;
		
		// 모든 고양이의 위치가 같은 경우
		if (c[0].location == c[1].location && c[1].location == c[2].location) {
				System.out.println(c[2].name + " -1");
		}
	 // 중앙 고양이가 양쪽으로 동일하게 움직일 수 있는 경우
		else if (cat2Moves == cat1Moves && cat2Moves == cat3Moves) {
				System.out.println(c[2].name + " " + cat3Moves);
		}
		
		// 그 외의 경우들
		else {
				int maxMoves = Math.max(cat1Moves, Math.max(cat2Moves, cat3Moves));  // 가장 많이 움직일 수 있는 거리 계산

				if (maxMoves == cat1Moves) {
						System.out.println(c[0].name + " " + cat1Moves); // 첫번째 고양이
				} else if (maxMoves == cat2Moves) {
						System.out.println(c[1].name + " " + cat2Moves);// 두번째 고양이
				} else {
						System.out.println(c[2].name + " " + cat3Moves); // 세번째 고양이
				}
			}
	}
}