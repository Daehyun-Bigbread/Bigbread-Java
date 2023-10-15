import java.io.*;
import java.util.*;

public class Car{
	String carName;
	int carYear;
	int maxSpeed;
	String carColor;
	
	public Car(){
		carName = "car"; carYear = 0; maxSpeed = 0; carColor = "black";
	}
	public Car(String carName, int carYear, int maxSpeed, String carColor){
		this.carName=carName; this.carYear=carYear; this.maxSpeed=maxSpeed; this.carColor=carColor;
	}
	
	public String getCarName(){
		return carName;
	}
	
	public int getCarYear(){
		return carYear;
	}
	
	public int getMaxSpeed(){
		return maxSpeed;
	}
	
	public String getCarColor(){
		return carColor;
	}
	
	public void setMaxSpeed(int maxSpeed){
		this.maxSpeed = maxSpeed;
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Car [] c = new Car[5];
		int count = 0;
		String command = null;
		
		for (int i=0; i<c.length; i++){
			// carName = "car", carYear = 0, maxSpeed = 0, carColor = "black"으로 초기화
			// 여기에 코드 작성
			c[i] = new Car("car", 0, 0, "black");
			
			command = scanner.next(); // command 값을 읽어옵니다.
		
			if (command.equals("new")) {
				String carName = scanner.next();
				int carYear = scanner.nextInt();
				int maxSpeed = scanner.nextInt();
				String carColor = scanner.next();
				
				c[i] = new Car(carName, carYear, maxSpeed, carColor);
			}
			else if (command.equals("setspeed"))
			{
				int index = scanner.nextInt();
				int speed = scanner.nextInt();
				
				 c[index].setMaxSpeed(c[index].getMaxSpeed() + speed);
					i--; // i를 1 감소시켜서 다음 Car 객체를 초기화하지 않도록 합니다.
			}
		}

	for (int i = 0; i < c.length; i++)
	{
		System.out.println(c[i].getCarYear() + "년 된 " + c[i].getCarColor() + " 색상의 " + c[i].getCarName() + " 차량의 최고 속도는 " + c[i].getMaxSpeed() + " 입니다.");
	}

	}
}