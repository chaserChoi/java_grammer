package C02ClassBasic;

public class C05Scope {

    public static int v2 = 10;

    public int v3 = 10;

    public static void main(String[] args) {
        // 지역 변수의 유효 범위
        int v1 = 10;
//        scope(v1);
        System.out.println(v1); // 10

        // 객체의 유효 범위

    }

    public void scope(int v1) {

    }
}
