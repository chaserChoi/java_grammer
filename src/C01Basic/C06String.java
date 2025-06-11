package C01Basic;

public class C06String {

    public static void main(String[] args) {
        // 원시자료형은 스택 메모리에 저장되므로 비교 시 값 자체를 비교
        int a = 10;
        int b = 10;
        System.out.println(a == b);

        // 참조 자료형의 비교는 기본적으로 메모리 주소 값끼리 비교
        String st1 = new String("hello");
        String st2 = new String("hello");
        System.out.println(st1 == st2); // false
        System.out.println(st1.equals(st2)); // true

        // Wrapper Class : 기본형 타입을 Wrapping한 클래스
        int i1 = 10;
        Integer ig1 = 10;
        
    }
}
