package C02ClassBasic;

import java.util.List;

public class C11RecursiveBasic {

    public static void main(String[] args) {
//        recur0(0, 3);
//        recur1(0, 3);
//        recur2();
    }


    public static void recur0(int count, int max) {
//        System.out.println("재귀 호출");
//        recur0(); // StackOverflowError 발생 => 무한히 실행되는 재귀 호출을 방지하기 위해 '특정 반복 횟수 지정'

        // 고정 횟수
//        if (count == 10) {
//            return;
//        }

        // 동적
        if (count == max) {
            return;
        }
        System.out.println("재귀 호출 전 count : " + count); // 0(첫 번째) -> 1(두 번째) -> 2(세 번째)
        recur0(count + 1, max);
        System.out.println("재귀 호출 후 count : " + count); // 0(여섯 번째) -> 1(다섯 번째) -> 2(네 번째)
    }

    // 출력 순서 : 전c:0 -> 전c:1 -> 전c:2 -> 후c:3 -> 후c:2 -> 후c:1
    public static void recur1(int count, int max) {
        if (count == max) {
            return;
        }
        System.out.println("재귀 호출 전 count : " + count);
        count = count + 1;
        recur1(count + 1, max);
        System.out.println("재귀 호출 후 count : " + count);
    }

    // 객체를 매개변수로 활용한 재귀 함수 : 객체는 힙 메모리를 통해 원본 객체가 변경될 수 있으므로, 재귀 함수 간에 값이 일치
    public static void recur2(List<Integer> myList, int num, int target) {
        if (myList.size() == target) {
            return;
        }
        myList.add(num);
        recur2(myList, num + 1, target);
        System.out.println(myList);
    }
}
