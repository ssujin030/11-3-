package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lucky Vicky 은행 오신여러분 환영 합니다.~~~");
		
		Acount account = new Acount();
	    if (account.countNumber()) {
            Manu manu = new Manu();
            manu.Manual();
        }
		//ATM → 메뉴 처리
	    System.out.println("프로그램 종료");
}	 
		//TransactionLog → 로그 저장
		//=============================================================================================
		/*  1. 비밀번호 3회 틀릴시 프로그램 종료.
		 *  2. 4자리가/4자리지만 비밀번호가 다를때
		 *  3. 입금하기/
		 *  4. 출금하기-현재 잔액보다 더큰금액을 인출할시 금지
		 *  --하루최대 출금금액 5만원 이상은 금지
		 *  5.이체하기도 동일
		 *  6.현재 잔액 조회
		 *  7.지금 까지 거래내역 조회 //거래 성공/실패 로그 저장
		 *  8.끝내기. 프로그램종료
		 *  
		 *
		 */
				

		
	}
