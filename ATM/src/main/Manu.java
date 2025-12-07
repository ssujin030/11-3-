package main;

import java.util.Scanner;


public class Manu {
		
	public void Manual() {
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{	
		System.out.println("0번 끝내기, 1번 입금하기, 2번 출금하기, 3번 잔액조회 4.계좌이체 5.거래내역 조회");	
        System.out.print("번호를 입력:");
		int Number =sc.nextInt();
		
		Transaction transaction= new Transaction();	
		
		
		switch(Number) {
		case 0: System.out.println("이용해주셔 감사합니다 Lucky Vicky~~~~~");return;
		case 1:System.out.println("임금 금액을 입력해주세요 :");		
		transaction.deposit();	break;	
		case 2:System.out.println("출금 금액을 입력해주세요: ");
		transaction.withdraw();break;
		case 3:System.out.println("잔액조회 :");
		transaction.CheckBalance();	break;
		case 4: System.out.println("이체하실 계좌 번호를 입력해주세요");
		transaction.withdraw(1);break;
		case 5: System.out.println("현재까지 거래 내역 입니다.");
	    transaction.showLog();
	    break;
		default : System.out.println("오기 입력되었습니다.");break;
		}
		
	}
	
	
	}
	




}	


	
		
	