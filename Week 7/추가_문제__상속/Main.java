import java.io.*;
import java.util.*;

class Point {
	protected int x; // protected 변수 x 선언
	protected int y; // protected 변수 y 선언
	
	public Point(int x, int y){ // 기본 생성자, Point(int x, int y) 생성자 선언
		this.x = x;
		this.y = y;
	}
	
	public double dist(Point p, Point q) { // Point p와 Point q 사이의 거리를 구하는 함수
		return Math.sqrt(Math.pow(p.x - q.x, 2) + Math.pow(p.y - q.y, 2)); // [(p.x-x1, q.x-y1), (q.x-x2, q.y-y2)], x1, y1은 p의 x,y좌표, x2, y2는 점 q의 x,y 좌표, Math.sqrt(괄호안의 값을 제곱근으로 반환)
	}
}

class Polygon extends Point {
	// 기본생성자 상속 -> Point Class의 dist를 이용하여 구하기
	private Point[] points; // 다각형의 꼭짓점들을 저장하기 위한 배열
	
	public Polygon(Point[] p) { // Polygon class 생성자
		super(p[0].x, p[0].y); // point class의 생성자 좌표 호출(x,y) 첫번재 점으로 초기화
		this.points = p; // 꼭짓점 배열 초기화
	}
	
	public double getPerimemter() { // public double getPerimeter(...): 둘레를 구하는 함수
		double perimiter = 0;
		// ?-> Point Class의 dist를 이용하여 구하기
		for(int i=0; i<points.length; i++){
			perimiter += dist(points[i], points[(i + 1) % points.length]);
			// points[(i + 1)% points.length]: 다음 점을 가져오는 코드 (%) - 원형으로 배열 순환
		}
		return perimiter;
	}
	
	public double getArea() { // public double getArea(...): 넓이를 구하는 함수
		double area = 0;
		for(int i=0; i<points.length; i++) { // 신발끈 공식 구현: 주어진 꼭짓점에 대해 연속된 점들 사이를 곱해서 계산
			area += (points[i].x * points[(i + 1) % points.length].y) - (points[i].y * points[(i + 1) % points.length].x);
			// points[(i + 1)% points.length]: 다음 점을 가져오는 코드 (%) - 원형으로 배열 순환
		}
		return Math.abs(area) / 2.0; // 결과의 절대값을 2로 나눔
	}
}


public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // 입력: 첫번째 줄에 Point의 개수 n 입력, 둘째줄부터 n개의 Point 입력
		Point[] p = new Point[n]; // Point 객체 입력받을 변수 선언
		
		for (int i=0; i < n; i++) {  // 꼭짓점 좌표를 입력받아 point 객체 배열에 저장
			int x = scanner.nextInt(); // 입력은 모두 정수형으로
			int y = scanner.nextInt();
			p[i] = new Point(x, y);
		}
		
		Polygon polygon = new Polygon(p); // 출력은 소수 둘째짜리까지 반올림하여 출력
		System.out.printf("%.2f\n", polygon.getPerimemter()); // 첫번째 줄에 다각형의 둘레 출력[출력은 실수형으로]
		System.out.printf("%.2f\n", polygon.getArea()); //  두번째 줄에 다각형의 넓이 출력 [출력은 실수형으로]
		
		// 힌트: 다각형의 넓이를 구하기 위하여 신발끈 공식에 대한 링크를 첨부, 위키백과
		// https://ko.wikipedia.org/wiki/%EC%8B%A0%EB%B0%9C%EB%81%88_%EA%B3%B5%EC%8B%9D
		
	}
}
