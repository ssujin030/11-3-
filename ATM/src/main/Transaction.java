package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Transaction {
    Scanner sc = new Scanner(System.in);
    
    //로그 저장 
    static ArrayList<String> transactionLog = new ArrayList<>();
  
    
    static int bank = 10000;
    
    // 입금 메서드
    public void deposit() {
        System.out.print("입금 금액: ");
        
        
        int mony = sc.nextInt();
        
        if (mony > 0) {
            bank += mony;
            
            transactionLog.add("입금: +" + mony + "원 | 잔액: " + bank + "원");
            System.out.println("✅ 입금 완료!");

        } else {
            System.out.println("오기 입력되었습니다. 다시 입력해주세요");
        }
    }
    
    // 출금 메서드
    public void withdraw() {
        System.out.print("출금 금액: ");
        int mony = sc.nextInt();

        // ✅ 5만원 초과하면 바로 차단
        if (mony >= 50000) {  
            System.out.println("❌ 5만원 초과 금액은 출금할 수 없습니다.");
            return;   // 여기서 메서드 바로 종료 (진짜로 '멈춤')
        }

        if (bank > mony) {
            bank -= mony;
            
            transactionLog.add("출금: -" + mony + "원 | 잔액: " + bank + "원");
            System.out.println("✅ 출금 완료!");
 
        } 
        else if (bank < mony) {
            System.out.println("잔액 부족하여 더이상 출금이 불가능 합니다.");
            System.out.println("잔액"+bank);
        } 
        else {
            System.out.println("오기 입력되었습니다.");
        }
    }


    
    /// 계좌 이체하기
    public void withdraw(int x) {
      
        
     
        String bankLog;
        
        
        while (true) {
            System.out.print("계좌 번호 입력: ");
            bankLog = sc.nextLine();

            if (bankLog.length() != 8) {
                System.out.println("계좌번호는 8자리 입니다. 다시 입력해주세요");
            } else {
                System.out.println(bankLog + " 로 이체 하겠습니다");
                break;
            }
        }
        
        System.out.print("이체 금액: ");
        int mony = sc.nextInt();
        
        if (mony > 50000) {  
            System.out.println("❌ 5만원 초과 금액은 이체할 수 없습니다.");
            return;   // 
        }
        if (bank >= mony) {
            bank -= mony;
            
            transactionLog.add("이체: -" + mony + "원 | 출금 계좌: " + bankLog + " | 잔액: " + bank + "원");
            System.out.println("✅ 이체 완료!");
            
        } 
        else if (bank < mony) {
            System.out.println("잔액 부족하여 더이상 이체가 불가능 합니다.");
            System.out.println("현재 잔액: " + bank);
        } 
        else {
            System.out.println("오기 입력되었습니다.");
        }
    }
    
    // 거래내역 조회
    public void showLog() {
        System.out.println("===== 거래 내역 =====");

        if (transactionLog.size() == 0) {
            System.out.println("거래 내역이 없습니다.");
        } else {
            for (String log : transactionLog) {
                System.out.println(log);
            }
        }
    }

        

    // 잔액 조회
    public void CheckBalance() {
        System.out.println("현재 잔액은" + bank + "원입니다");
    }
}


