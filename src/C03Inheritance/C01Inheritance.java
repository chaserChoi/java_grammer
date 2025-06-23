package C03Inheritance;

// extends 키워드를 통해 상속을 수행 -> 부모의 변수와 메서드를 자식 클래스에서 물려받는 것인지에 대한 혼선이 존재.
// java에서는 클래스의 다중 상속을 지원하지 않음.
public class C01Inheritance extends Parent {

    public int b = 20;
    public static void main(String[] args) {
        C01Inheritance c1 = new C01Inheritance();

        // 자식 클래스에서 부모 클래스의 a변수 상속
        System.out.println(c1.a);
        System.out.println(c1.b);
//        System.out.println(c1.c);

        // 메서드 상속
        c1.m1();
        c1.m2();
    }

    // 부모 메서드의 재정의(Overriding) : 부모 클래스의 메서드명과 자식 클래스의 메서드명이 동일한 상황
    @Override // override된 메서드임을 명시적으로 표현하는 표현식 = annotation => 성능 최적화를 위해서 해당 키워드를 붙여주는 것이 더 좋음
    public void m1() {
        System.out.println("자식 클래스 입니다.");
    }

    public void m2() {
        System.out.println("자식 클래스의 m2 메서드 입니다.");
    }
}

class Parent {
    public int a = 10;
    // private 접근 제어자는 클래스 내부에서만 접근 가능. 자식 클래스에서도 접근 불가.
    private int c = 20;
    public void m1() {
        System.out.println("부모 클래스의 m1 메서드 입니다.");
    }
}
