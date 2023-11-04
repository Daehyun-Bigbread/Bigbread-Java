import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		// ArrayList 생성: ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> names = new ArrayList<String>(); 
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // number input, 1 이상의 정수 하나 입력 받기
		scanner.nextLine();
		
		int count = 0;
		while (count < n) { // count < input number
			// command[0]: 명령어 입력, command[1]: 이름 입력 받음
			String input = scanner.nextLine();
			
			String[] command = input.split(" "); // Command 배열 선언, [0]: 성, [1]: 이름, 
			if (command[0].equals("new")) { // new (성): 새로운 성을 입력 받아 ArrayList에 저장
				names.add(command[1]);  // 입력 받은 정수 만큼 반복하여 새로운 성(Last Name) 입력받기
				count++; // 받은 성의 개수 만큼 횟수 + 1
			}
			else if (command[0].equals("set")) { // set (인덱스) (성): 인덱스와 성을 입력 받아 해당하는 인덱스의 성을 새로운 성으로 설정
				int index = Integer.parseInt(command[1]); // command 숫자를 index(정수 3으로 변환하여 저장)
				
				if(index >= 0 && index < names.size()){ // index 값이 범위 내에 있는지 확인 & Arraylist name의 크기 보다 작아야 한다.
					names.set(index, command[2]); // 위의 조건이 맞으면 index 위치에 있는 값을 새로운 성으로 변경
				}
			}
			if (count == n) { // 입력받은 정수를 n이라 하면 새로운 성을 n번 입력 받으면 자동으로 지금까지 입력받은 성을 전부 출력
				for (String name : names) { // ArrayList 안에 있는 이름들의 개수만큼 반복문 돌려서 출력
					System.out.println(name);
				}
			}
		}
	}
}
