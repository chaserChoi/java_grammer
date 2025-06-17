package C01Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class C06String {

    public static void main(String[] args) {
        // 원시자료형은 스택 메모리에 저장되므로 비교 시 값 자체를 비교
        // 원시자료형 : 클래스 기반 X, 스택 기반 저장
        // => 기능이 빈약 -> 과거 history & 현재 호환 -> Wrapper 사용
//        int a = 10;
//        int b = 10;
//        System.out.println(a == b);
//
//        // 참조 자료형의 비교는 기본적으로 메모리 주소 값끼리 비교
//        // 참조자료형 : 클래스(-> 객체) 기반, 힙 메모리 기반 저장
//        String st1 = new String("hello");
//        String st2 = new String("hello");
//        System.out.println(st1 == st2); // false
//        System.out.println(st1.equals(st2)); // true
//
//        // Wrapper Class : 기본형 타입을 Wrapping한 클래스
//        int i1 = 10;
////        Integer ig1 = new Integer(10);
//        // 자동 형변환 = 오토 박싱
//        // 오토 박싱 : 원시 자료형 -> wrapper 클래스 자동 형변환
//        Integer ig1 = 10;
//        // 오토 언박싱 : wrapper 클래스 -> 원시 자료형 자동 형변환
//        int i2 = ig1;
//
//        // Wrapper 클래스 기능
//        int i3 = 10;
//        String st3 = Integer.toString(i3); // (int)10 -> (String)"10"
//        String st4 = String.valueOf(i3); // (int)10 -> (String)"10"
//        int i4 = Integer.parseInt(st3);
//
//        // 배열(참조형)에는 원시 타입 자료형 세팅 가능
//        int[] arr = {10, 20, 30};
//
//        // 그 외(리스트, set, map) 등에는 참조 자료형 세팅해야 함
//        ArrayList<Integer> list1 = new ArrayList<>();
//        list1.add(10);
//        list1.add(20);
//        list1.add(30);

        // String 선언 방법 2가지
        // 객체 선언 방식
//        String st1 = new String("hello world");
//        String st2 = new String("hello world");
//        // 리터럴 방식 : java에서 추천하는 방식
//        String st3 = "hello world";
//        String st4 = "hello world";
//        System.out.println(st1 == st2); // false
//        System.out.println(st3 == st4); // true
//        System.out.println(st1 == st3); // false
//
//        //  참조 자료형의 비교는 == 지양
//        System.out.println(st1.equals(st3)); // true

        // equals : 두 문자열 비교
//        String st1 = "hello1";
//        String st2 = "hello1";
//        String st3 = "Hello1";
//        System.out.println(st1.equals(st2));
//        System.out.println(st1.equals(st3));
//        System.out.println(st1.equalsIgnoreCase(st2));

//        // length : 문자열 길이 출력
//        String st1 = "hello world java";
//        System.out.println(st1.length());
//
//        // charAt(n) : 특정 index의 문자(char)값 리턴
//        char ch1 = st1.charAt(0);
//        // 위 문자열의 소문자 알파벳의 개수 구하기: for, length, charAt 활용
//        int cnt = 0;
//        for (int i = 0; i < st1.length(); i++) {
//            if (st1.charAt(i) >= 'a' && st1.charAt(i) <= 'z') {
//                cnt++;
//            }
//        }
//        System.out.println(cnt);

        // a의 개수가 몇 개인지 출력
//        String st2 = "abcdefgabaaaa";
//        int cnt = 0;
//        for (int i = 0; i < st2.length(); i++) {
//            if (st2.charAt(i) == 'a') {
//                cnt++;
//            }
//        }
//        System.out.println(cnt);
//
//        // toCharArray : String 문자열 -> char 배열 리턴
//        char[] chArr = st2.toCharArray();
//        int cnt2 = 0;
//        for (char c : chArr) {
//          if (c == 'a') cnt2++; // 실행문이 1줄밖에 없는 경우 중괄호 생략가능
//        }

        // indexOf : 특정 문자열의 위치 반환. 가장 먼저 나오는 문자열의 위치 반환
//        String st1 = "hello java java";?
//        System.out.println(st1.indexOf("java"));

        // contains : 특정 문자열이 포함되어 있는지 여부(boolean) return
//        System.out.println(st1.contains("hello"));
//        System.out.println(st1.contains("world"));

//        // 문자열 더하기 : +=
//        String st1 = "hello";
//        st1 += " world";
//        st1 += "1"; // String에 char을 더하면 String으로 더해짐.
//        System.out.println(st1);

        // 프로그래머스 - 나머지 구하기 (플랫폼 사용방법)
        // 프로그래머스 - 특정 문자 제거하기

        // substring : a 이상 b 미만의 index의 문자를 잘라 문자열 반환
//        String st1 = "hello world";
//        System.out.println(st1.substring(0, 5));
//        System.out.println(st1.substring(6, st1.length()));

        // 프로그래머스 - 특정 문자 제거하기 (substring 활용)

        // replace(a, b) : a 문자열을 b 문자열로 대체

//        // replaceAll(a, b) : replace와 동일, 정규표현식을 쓸수 았느 점이 차이점
//        // 프로그래머스 - 특정 문자 제거하기 (replace 활용)
//        String st1 = "01abc123한글123";
//        // 한글 제거
//        String answer1 = st1.replaceAll("[가-힣]", "");
//        String answer2 = st1.replaceAll("[a-z]", "");
//        String answer3 = st1.replaceAll("[A-Za-z]", "");
//        System.out.println(answer1);
//        System.out.println(answer2);
//        System.out.println(answer3);
//
//        // 전화 번호 검증
//        String number = "010-1234-1234";
//        // 이메일 검증
//        String email = "한글1234@naver.com";
//
//        // StringBuffer : 문자열 조립 분해
//        StringBuffer sb = new StringBuffer();
//        sb.append("java\n");
//        sb.append("python\n");
//        sb.append("javascript\n");
//        String answer = sb.toString();
//        System.out.println(answer);
//        String[] arr = {"java", "python", "javascript"};
//        StringBuffer sb2 = new StringBuffer();
//        for (int i = 0; i < arr.length; i++) {
//            sb2.append(arr[i]);
//            sb2.append("\n");
//        }
//        sb2.insert(0, "++");
//        sb2.deleteCharAt(sb.length() - 1);


        // StringBuilder : 문자열 조립 객체 (가장 빠름)

//        // 문자열 뒤집기
//        String st1 = "hello";
//        StringBuilder sb = new StringBuilder();
//        for (int i = st1.length() - 1; i >= 0; i--) {
//            sb.append(st1.charAt(i));
//        }
//        System.out.println(sb.toString());

        // 문자열 비교
        String s1 = "hello";
        String s2 = "dello";
        String s3 = "hello";
        System.out.println(s1.compareTo(s2)); // 양수
        System.out.println(s2.compareTo(s1)); // 음수
        System.out.println(s1.compareTo(s3)); // 0

        // 프로그래머스 - 문자열 밀기

    }

    // 프로그래머스 - 특정 문자 제거하기 (substring 활용)
    public String solution(String my_string, String letter) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            if (!my_string.substring(i, i+1).equals(letter)) {
                answer += my_string.substring(i, i + 1);
            }
        }

        return answer;
    }

    // 프로그래머스 - 문자열 밀기
    // 문자열 "hello"에서 각 문자를 오른쪽으로 한 칸씩 밀고 마지막 문자는 맨 앞으로 이동시키면 "ohell"이 됩니다.
    // A를 밀어서 B가 될 수 있다면 밀어야 하는 최소 횟수를 return하고 밀어서 B가 될 수 없으면 -1을 return
    // StringBuilder 사용
    public int solution2(String A, String B) {
        int answer = 0;

        StringBuilder sb = new StringBuilder(A);
        sb.insert(0, sb.charAt(sb.length() - 1));
        sb.deleteCharAt(sb.length() - 1);

        if (sb.toString().equals(B)) {
            answer = 1;
        } else answer = -1;

        return answer;
    }
}
