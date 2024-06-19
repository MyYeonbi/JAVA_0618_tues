package variable;

public class Var1 {
    public static void main(String[] args) {
        //int 변수 2개 선언
        // sum 이라는 변수에 2개의 합 더하기
        // 콘솔에 해당 내용 출력
        int num1 = 3; // 초기값이 없으면 에러가 뜸! 그래서 int a; 라고 하면 에러가 뜸.
        int num2 = 4;
        int sum = num1 + num2;
        System.out.println(sum);

        double pi = 3.14;
        char v = 'c'; //char은 한글자만 허용하고 ""으로 묶으면 에러뜸
        String str = "Hello World";// String은 ''으로 묶으면 에러뜸.
    }
}
