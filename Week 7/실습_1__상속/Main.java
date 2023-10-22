import java.io.*;
import java.util.*;

class Person {
	public String name;	// public 필드, 이름
	protected int age;	// protected 필드, 나이
	private String note = "None";	// private 필드, note(전공?)
	String job = "Unemployed";	// 디폴트 필드, 직업
	
	public void setNote(String note) {
		this.note = note; // 메모
	}

	
	public String getNote() {
		return this.note; // 메모 반환
	}
}

class Student extends Person { // 학생 정보 저장하는 클래스, Person으로 부터 상속받음
	// 학생 정보 설정하는 Method
	public void set(String name, int age) {
		this.name = name;
		this.age = age;
		this.job = "Student";
	}
}


class StudentResearcher extends Person { // 학부 연구생 저장하는 클래스, Person으로 부터 상속받음
	// 학부 연구생 정보 설정하는 Method
	public void set(String name, int age, String note) {
		this.name = name;
		this.age = age;
		this.job = "Student Researcher";
		setNote(note); // 메모 설정
	}
}

public class Main {
	public static void main(String[] args) {
		int n = 0; // 입력 받는 사람들의 수
		
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNextInt()) {
			n = scanner.nextInt(); // 사람수를 입력 받음
		}
		
		for(int i = 0; i < n; i++) {
			String name = scanner.next(); // 이름 입력 
			String job = scanner.next().replace('_',' '); // 직업 입력
			
			// 직업이 학생 or 학부연구생이 아닌 경우 계속 입력 받음
			while (!job.equals("Student") && !job.equals("Student Researcher")) {
				System.out.println("다시 입력해주세요.");
				scanner.nextLine();
				name = scanner.next(); // kim
				job = scanner.next().replace('_',' ');
			}
			
			// 직업이 학생인 경우
			if (job.equals("Student")) {
				int age = scanner.nextInt(); // age
				Student student = new Student(); 
					
				student.set(name,age); // Student class의 set method 호출(name-name, age-age, student-job)
				System.out.println("Name: " + student.name + " | Job: " + student.job + " | Age: " + student.age + " | Note: " + student.getNote());
				
			}
			
			// 직업이 학부연구생인 경우
			else if (job.equals("Student Researcher")) {
				int age = scanner.nextInt(); // age
				String note = scanner.next(); // note
				
				StudentResearcher researcher = new StudentResearcher();
				researcher.set(name, age, note); // Student class의 set method 호출(name-name, age-age, note-note, Student Researcher-job)
				System.out.println("Name: " + researcher.name + " | Job: " + researcher.job + " | Age: " + researcher.age + " | Note: " + researcher.getNote());
			}
			
		}
		scanner.close();
	}
}
