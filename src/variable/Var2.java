package variable;

public class Var2 {
    public static void main(String[] args) {
        double a = 2.3;
        //int b = a; //에러가 뜨는 이유?  명시적 형변환을 넣어주지 않아서
          int b = (int) a;
        System.out.println(b);

        int c = 3;
        int d = 2;
        double e = c / d; //1.0이 나오는 이유는 double로 형변환을 넣어주지앟아서 소수점이 안나옴
        System.out.println(e);
        double f = (double) c / d;
        System.out.println(f);//형변환 double로 넣어줬기 때문에 소수점까지 나옴.
    }
}
