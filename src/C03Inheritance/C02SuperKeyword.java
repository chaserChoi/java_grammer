package C03Inheritance;

// 부모 클래스를 상속 받을 때, 부모 클래스에 기본 생성자가 없으면 자식 클래스에서 상속 시 기본적으로 에러 발생.
public class C02SuperKeyword extends SuperParent {

    int a;

    C02SuperKeyword() {
        // super() : 부모 클래스의 생성자를 호출하는 메서드
        super(20);
        this.a = 10;
    }

    public static void main(String[] args) {
        C02SuperKeyword c2 = new C02SuperKeyword();
        c2.display();
    }

    public void display() {
        System.out.println("자식의 변수 : " + a);
        System.out.println("부모의 변수 : " + super.a);
    }
}

class SuperParent {
    int a;

    public SuperParent(int a) {
        this.a = a;
    }

    public SuperParent() {
    }
}
