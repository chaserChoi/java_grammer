package C02ClassBasic;

public class C04PersonMain {

    public static void main(String[] args) {
//        // 회원 가입 예시
//        String name1 = "hong1";
//        String email1 = "hong1@naver.com";
//        int age1 = 30;
//        printMember1(name1, email1, age1);
//
//        String name2 = "hong2";
//        String email2 = "hong2@naver.com";
//        int age2 = 35;
//        printMember1(name2, email2, age2);
        // 위와 같은 방식의 문제점
        // 어떤 요소들이 그룹화되어 있지 않다보니, 중복과 코드의 가독성이 저하됨

        // 위와 같은 문제점을 해결하기 위해 클래스에 속성을 정의하고, 객체로 생성하여 그룹화
        C04Person p1 = new C04Person();
        p1.name = "hong1";
        p1.email = "hong1@naver.com";
        p1.age = 30;
    }

    public static void printMember1(String name, String email, int age) {
        System.out.println("이름은 : " + name + " 이메일은 : " + email + " 나이는 : " + age);
    }

    public static void printMember2(String name, String email, int age) {
        System.out.println("이름은 : " + " 이메일은 : " + " 나이는 : ");
    }
}
