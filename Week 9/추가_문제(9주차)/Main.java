import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();  // 집합에 속하는 원소의 개수
		int S = scanner.nextInt(); // 원소의 합
		scanner.close();
		
		if (n > S) { // 각 원소의 개수가 원소의 합보다 크면?
			System.out.println("-1");
			return;
		}
		
		int[] result = new int [n]; // 각 원소의 개수의 값을 받음
		
		for(int i=0; i<n; i++) { // 원소의 합이 원소의 개수보다 크다면 나눈 몫을 원소에 할당
			result[i] = S / n;
		}
		
		for(int i=0; i<S%n; i++) { // 원소의 합을 원소의 개수로 나눈 나머지의 개수에 +1, 이러면 원소들의 합은 S가 됨
			result[i]++;
		}
		
		Arrays.sort(result); // 원소들을 오름차순으로 정렬
		
		for(int i=0; i<n; i++){ // 결과 출력
			System.out.print(result[i] + " ");
		}
	}
}
