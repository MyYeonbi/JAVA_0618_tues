package scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("문자를 입력하세요.(프로그램을 종료 하려면 exit 입력) : ");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else {
                System.out.println("입력한 문자열은 : " + input);
            }
        }
    }
}
