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
					i++;
					
					if (i == 3) { // circle 3개면 바로 출력
						for (Circle circle : c) {
							System.out.printf("%s의 넓이: %.2f\n", circle.name, circle.area);
						}
						break;
					}
				}

				else if (command.equals("Break")) {
					for (int k = 0; k < c.length; k++) {
						System.out.printf("%s의 넓이: %.2f\n", c[k].name, c[k].area);
					}
					scanner.close();
					break;
				} 

			}

	}
}