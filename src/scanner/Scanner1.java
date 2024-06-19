package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자를 입력하세요 : ");
        String str = scanner.nextLine();
        System.out.println(str);

        System.out.println("정수를 입력 하세요 : ");
        double number2 = scanner.nextDouble();
        System.out.println(number2);
    }
}
