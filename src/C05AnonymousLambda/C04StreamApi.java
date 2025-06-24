package C05AnonymousLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C04StreamApi {

    public static void main(String[] args) {
//        int[] arr = {20, 10, 4, 12};
//        // 전통적인 방식의 데이터 접근 방법 : 메모리 주소 접근
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

//        // 함수형 프로그래밍 방식 : 데이터와 객체 중심이 아닌, 입력에 따른 출력만 존재
//        // streamApi : java에서 함수형 프로그래밍을 지원하는 라이브러리
//        // foreach는 스트림의 각 요소를 하나씩 소모하면서 동작을 수행
//        Arrays.stream(arr).forEach(a -> System.out.println(a));
//
//        // 스트림의 생성 : .stream() 메서드
//        List<String> myList = new ArrayList<>();
//        myList.add("HTML");
//        myList.add("CSS");
//        myList.add("javascript");
//        Stream<String> stream1 = myList.stream();
//        String[] myArr = new String[3];
//        myArr[0] = "HTML";
//        myArr[1] = "CSS";
//        myArr[2] = "javascript";
//        Stream<String> stream2 = Arrays.stream(myArr);
//
//        // 원시 자료형을 위한 stream 객체가 별도로 존재.
//        int[] intArr = {10, 20, 30, 40, 50};
//        IntStream stream3 = Arrays.stream(intArr);

//        // stream의 중개 연산(변환) : filter, map, sorted, distinct
//        int[] intArr = {10, 10, 30, 40, 50};
//        // 30보다 작은 값들의 종합
//        // filter : 특정 기준으로 대상을 filtering하여 새로운 스트림 반환하는 중개 연산 메서드
//        // sum : 스트림의 요소를 하나씩 소모하여 총합을 구하는 메서드
//        int total = Arrays.stream(intArr).filter(x -> x <= 30).sum();
//        System.out.println(total);
//
//        // map : 기존의 스트림을 조작하여 새로운 스트림을 반환
//        int[] intArr2 = {10, 10, 30, 40, 50};
//        IntStream intStream = Arrays.stream(intArr2).map(a -> a * 10);
//        int[] newIntArr = Arrays.stream(intArr2).map(a -> a * 10).toArray();
//        System.out.println(Arrays.toString(newIntArr));
//
//        // distinct : 중복 제거
//        int[] intArr3 = {10, 10, 30, 40, 50};
//        int total3 = Arrays.stream(intArr3).distinct().sum();
//
//        int[] intArr4 = {10, 40, 10, 30, 50};
//        int[] newArr = Arrays.stream(intArr4).sorted().toArray();
//        System.out.println(Arrays.toString(intArr4));
//
//        // mapToInt : intStream 형태로 변환해주는 map
//        String[] stArr = {"HTML", "CSS", "Java", "Python"};
//        // 모든 문자열 길이의 총합
//        int lengthTotal = Arrays.stream(stArr).mapToInt(a -> a.length()).sum();
//        System.out.println(lengthTotal);

        int[] arr = {1, 2, 3, 4, 5, 6};
        // arr에서 홀수만 담은 배열 생성 후 출력
        int[] arr1 = Arrays.stream(arr).filter(i -> i % 2 != 0).toArray();
        System.out.println(Arrays.toString(arr1));

        // arr에서 홀수만 걸러서 해당 홀수의 제곱값을 담은 배열을 생상 후 출력
        int[] arr2 = Arrays.stream(arr).filter(i -> i % 2 != 0).map(i -> i * i).toArray();
        System.out.println(Arrays.toString(arr2));

        // arr에서 홀수만 거르고, 제곱값을 구하고, 해당 숫자값을 오름차순한 순서로 배열을 생성 후 출력
        int[] arr3 = Arrays.stream(arr).filter(i -> i % 2 != 0).map(i -> i * i).sorted().toArray();
        System.out.println(Arrays.toString(arr3));

        // 스트림의 소모 : forEach(출력), sum(합계), reduce(누적 연산), max, min, count, findFirst : 스트림 첫 번째 값 return
        int[] intArr = {10, 20, 30, 40};
        Arrays.stream(intArr).forEach(a -> System.out.println(a));
        int total = Arrays.stream(intArr).sum();
        // optional 객체 : 값이 있을수도 있고, 없을수도 있음을 명시한 객체
        int max = Arrays.stream(intArr).max().getAsInt();
        int min = Arrays.stream(intArr).min().getAsInt();
        long count = Arrays.stream(intArr).count();

        // reduce : 누적 연산 -> reduce(초기값, 연산식)
        int accSum = Arrays.stream(intArr).reduce(0, (a, b) -> a + b);
        System.out.println(accSum);
        int accMultiply = Arrays.stream(intArr).reduce(1, (a, b) -> a * b);
        System.out.println(accMultiply);
        String[] stArr = {"hello", "java", "world"};
        String str = Arrays.stream(stArr).reduce("", (a, b) -> a + b);
        System.out.println(str);

        // findFirst : 첫 번째 요소 반환
        String firstSt = Arrays.stream(stArr).filter(a -> a.length() >= 5).findFirst().get();
        System.out.println(firstSt);

        // 주의사항 : 제네릭의 타입 소거
        // 자바의 런타임 시점에 <String>과 같은 제네릭의 타입 소거 발생
        // 제네릭의 타입 소거로 인해, toArray를 통해 바로 새로운 String 배열을 만드는 것은 불가
        String[] answer = Arrays.stream(stArr).filter(a -> a.length() >= 5).toArray(a -> new String[a]);
    }
}
