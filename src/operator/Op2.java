package operator;

public class Op2 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "def";

        boolean a = str1.equals(str2);
        System.out.println(a);

        boolean b = str1.equals("abc");
        System.out.println(b);

        boolean c = !"abc".equals("abc");
        System.out.println(c);
    }
}
