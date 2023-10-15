import java.io.*;
import java.util.*;

class Calc {
	// static 함수 두개 선언 1) abs(double a) 2) getArea(double radius)
	// 1. abs(double a) 함수 작성
	// 2. Circle 클래스의 PI를 사용하여 Circle의 넓이를 구하는 getArea(double radius)함수 작성
	public static double abs(double a) {
		 if (a < 0) {
			 return -a;
    }
		return a;
	}
	
	public static double getArea(double radius) {
		return Circle.PI * Calc.abs(radius) * Calc.abs(radius);
	}
}

class Circle {
	// final 변수 PI = 3.14 선언
	String name;
	double radius;
	double area;
	public static final double PI = 3.14;
	
	public Circle() {
		this.name = "Circle";
		this.radius = 0;
		this.area = Calc.getArea(this.radius);
	}
	
	public Circle(String name, double radius) {
		this.name = name;
		this.radius = radius;
		this.area = Calc.getArea(this.radius);
	}

	public static void main(String[] args) {
		// 크기가 3인 Circle 객체 배열 c 선언 후 이름이 Circle이고 radius가 0인 객체로 초기화
		Scanner scanner = new Scanner(System.in);
		Circle[] c = new Circle[3];
		
		for (int j=0; j<c.length; j++){
			c[j] = new Circle();
		}
		
		String command;
		int i = 0;
		
			while(scanner.hasNext()) {
				command = scanner.next();
				
				if (command.equals("Circle") && i < c.length) {
					double radius = scanner.nextDouble();
					c[i] = new Circle("Circle", radius);
					System.out.printf("%s의 넓이: %.2f\n", c[i].name, c[i].area);
					i++;
				}

				else if (command.equals("Break")) {
					c[i] = new Circle();
					System.out.printf("%s의 넓이: %.2f\n", c[i].name, c[i].area);
					
					scanner.close();
					break;
				} 
			}

	}
}