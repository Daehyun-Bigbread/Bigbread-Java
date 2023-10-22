import java.io.*;
import java.util.*;

class Shape {
	protected String name;
	protected double area;
	
	public void getArea() {
		System.out.printf("%s의 넓이: %.2f\n", name, area);
	}
}
class Circle extends Shape {
	private double radius; // 반지름

	public Circle(double radius) { 
		this.name = "Circle";  // 원의 이름
		this.radius = radius; // 반지름 초기화
		this.area = radius * radius * 3.14;
	}
	
	public void getArea() { // public void getArea()를 메소드 오버라이딩
		super.getArea();
	}
}

class Rectangle extends Shape {
	private double length; // 가로
	private double width; // 세로

	public Rectangle(double length, double width) { 
		this.name = "Rectangle";  // 원의 이름
		this.length = length; // 가로 초기화
		this.width = width; // 세로 초기화
		this.area = length * width;
	}
	
	public void getArea() { // public void getArea()를 메소드 오버라이딩
		super.getArea();
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Shape[] s = new Shape[3]; // 3개의 Shape 객체를 저장하는 배열
		String command; // command 변수 선언
		
		for (int i=0; i<s.length; i++){
			command = scanner.next(); // 명령어 읽음 (circle or rectangle)
			
			if (command.equals("Circle")) {
				double radius = scanner.nextDouble();
				s[i] = new Circle(radius);
			}
			
			else if (command.equals("Rectangle")) {
				double length = scanner.nextDouble();
				double width = scanner.nextDouble();
				s[i] = new Rectangle(length, width);
			}
			
		}
		
		// 각 객체의 넓이 출력
		for (Shape shape : s)
			shape.getArea();
	}
}