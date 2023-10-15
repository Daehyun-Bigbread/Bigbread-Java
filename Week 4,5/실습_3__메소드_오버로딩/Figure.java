import java.io.*;
import java.util.*;

class Figure {
	String name;
	double radius;
	double length;
	double width;
	double area;
	
	public Figure(String name, double radius) {
		this.name = name;
		this.radius = radius;
		getArea(radius);
	}
	
	public Figure(String name, double length, double width) {
		this.name = name;
		this.radius = radius;
		this.width = width;
		getArea(length, width);
	}
	
	public void getArea(double radius) {
		area = radius * radius * 3.14;
	}
	public void getArea(double length, double width) {
		area = length * width;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Figure [] f = new Figure[4];
		int count = 0;
		String command = null;
		
		for(int i = 0; i<f.length; i++){
			command = scanner.next();
			
			if (command.equals("Circle")){
				String name ="Circle";
				double radius = scanner.nextDouble();
				
				f[i] = new Figure(name, radius);
			}
			else if (command.equals("Rectangle")){
				String name = "Rectangle";
				double length = scanner.nextDouble();
				double width = scanner.nextDouble();
				
				f[i] = new Figure(name, length, width);
			}
		}
		for (int i=0; i <f.length; i++){
			System.out.println(f[i].name + "의 넓이: " + String.format("%.2f", f[i].area));
		}
	}
}