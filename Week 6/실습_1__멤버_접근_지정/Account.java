import java.io.*;
import java.util.*;

class Account {
	private String name = "Gil-dong";
	private int account_num = 0;
	private int balance = 0;
public Account(String name, int account_num, int balance){
	this.name = name;
	this.account_num = account_num;
	this.balance = balance;
}

public String getName() {
	return name;
}

public int getAccount_num() {
	return account_num;
}

public int getBalance() {
	return balance;
}

public void deposit(int amount) {
	this.balance += amount;
}


public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Account [] accounts = new Account[5]; // 최대 5개의 계좌를 저장
	String command;
	
	int account_count = 0; // 만들어진 계좌 수를 저장하는 변수
		
	while(true) {
		command = scanner.next();
			
		 // 새로운 계좌 만들기
			if (command.equals("new")){
				String name = scanner.next(); // 이름
				int account_num = scanner.nextInt(); // 계좌 번호
				int balance = scanner.nextInt(); // 처음 잔액

				accounts[account_count] = new Account(name, account_num, balance); // 게좌 생성 배열
				account_count++; // 계좌 수 증가
			}
			
			// 특정 계좌에 입금
			else if (command.equals("deposit")){
				int deposit_index = scanner.nextInt(); // 입금할 계좌의 index 입력
				int money_deposit = scanner.nextInt(); // 입금 금액 입력

				if (deposit_index < account_count && accounts[deposit_index] != null) {
					accounts[deposit_index].deposit(money_deposit); // 입금
				}
			}

			// 계좌 잔액 조회
			else if (command.equals("inquiry")) {
				int inquiry_index = scanner.nextInt(); // 잔액 조회할 index 입력

				if (inquiry_index < account_count && accounts[inquiry_index] != null) {
					System.out.println(accounts[inquiry_index].getName() + " 님의 " + accounts[inquiry_index].getAccount_num() + " 계좌의 잔고는 " + accounts[inquiry_index].getBalance() + "원 남았습니다.");
				}
			}
			
			// 프로그램 종료 명령
			else if(command.equals("quit")) {
				scanner.close();
				break;
			}
		
		}
	}
}
