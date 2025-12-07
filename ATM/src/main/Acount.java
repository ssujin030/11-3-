package main;

import java.util.Scanner;

public class Acount {

    static String AcountNumber = "1234";
    static int count = 3;

    public boolean countNumber() {

        Scanner sc = new Scanner(System.in);

        while (count > 0) {

            System.out.print("비밀번호 : ");
            String Acount = sc.nextLine();

            if (Acount.length() != 4) {
                count--;
                System.out.println("비밀번호 4자리여야 합니다. 남은 기회: " + count);

            } else if (Acount.equals(AcountNumber)) {
                System.out.println("✅ 고객님!! 환영 합니다!!");
                return true;   // ✅ 성공 즉시 종료

            } else {
                count--;
                System.out.println("❌ 비밀번호가 다릅니다. 남은 기회: " + count);
            }
        }

        // ✅ 3회 모두 실패했을 때만 여기까지 내려옴
        System.out.println("🚫 3회 실패로 종료");
        return false;
    }
}
