package operator;

public class Op1 {
    public static void main(String[] args) {
        String str = "a + b = ";
        int c = 10;
        System.out.println(str + c); //str과 숫자의 합의 결과값은? 숫자열이 문자열로 변한다.

        char e = 'e';
        System.out.println(c + e); // char과 숫자와 만나면 char의 한글자는 숫자열로 변한다.

        int f = 1;
        int g = 0;

        g = f++;
        System.out.println("f = " + f + ", g = " + g);
        //대입먼저 해서 . 후위연산자

    }
}
