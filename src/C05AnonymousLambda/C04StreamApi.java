package C05AnonymousLambda;

import java.util.*;
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

        // 메서드 참조 : 하나의 메서드만을 호출하는 경우에 매개변수 제거한 방식. 클래스명::메서드명
        Arrays.stream(stArr).forEach(System.out::println);
        String[] answer2 = Arrays.stream(stArr).filter(a -> a.length() >= 5).toArray(a -> new String[a]);

        // 1. 모든 객체의 평균 나이
        List<Student> studentArr = new ArrayList<>();
        studentArr.add(new Student("kim", 24));
        studentArr.add(new Student("lee", 21));
        studentArr.add(new Student("park", 35));
        studentArr.add(new Student("choi", 15));

        double averageAge = studentArr.stream().mapToInt(a -> a.getAge()).average().getAsDouble();
        System.out.println(averageAge);

        // 2. 정렬을 통한 가장 나이 어린 사람 찾기
        studentArr.stream().sorted((o1, o2) -> o1.getAge() - o2.getAge())
                .findFirst()
                .ifPresent(a -> System.out.println(a.getName() + " " + a.getAge()));

//        // 3. 30대면 사람들의 이름만 모아서 새로운 String 배열 담기
//        String[] arr = studentArr.stream().filter(a -> a.getAge() >= 30).map(a -> a.getName()).toArray(String[]::new);
//        System.out.println(arr);

//        // Optional 객체 : 특정 객체에 값이 없을지도 모른다는 것을 명시적으로 표현
//        String st1 = null;
//        if (st1 != null) {
//            System.out.println(st1.compareTo("hello"));
//        } else {
//            System.out.println("값이 없습니다.");
//        }
//        Optional<String> opt1 = Optional.ofNullable(null);
//        if (opt1.isPresent()) {
//            System.out.println(opt1.get().compareTo("hello"));
//        } else {
//            System.out.println("값이 없습니다.");
//        }

        // Optional 객체 생성 방법 3가지
        Optional<String> opt1 = Optional.empty(); // 비어 있는 Optional 객체 생성
        Optional<String> opt2_1 = Optional.ofNullable(null); // 비어 있는 Optional 객체 생성
        Optional<String> opt2_2 = Optional.ofNullable("hello"); // 값이 있는 Optional 객체 생성
        Optional<String> opt3 = Optional.of("hello"); // 값이 있는 Optional 객체 생성

//        // Optional 객체 처리 방법 4가지
//        // 방법1. isPresent()로 확인 후에 get()
//        if (opt2_1.isPresent()) {
//            System.out.println(opt2_1.get());
//        } else {
//            System.out.println(opt2_1.get()); // no value present 에러 발생
//            System.out.println("값이 없습니다.");
//        }

//        // 방법2. orElse() : 값이 있으면 있는 값 return, 없으면 지정한 값 return
//        System.out.println(opt2_1.orElse("값이 없습니다."));
//        System.out.println(opt2_2.orElse("값이 없습니다."));
//
//        // 방법3. orElseGet() : 값이 있으면 있는 값 return, 없으면 람다 함수 실행
//        System.out.println(opt1.orElseGet(() -> new String("값이 없습니다.")));

        // 방법4. (가장 많이 사용) orElseThrow() : 값이 있으면 있는 값 return, 없으면 지정된 예외(에러) 강제 발생
        // 개발에서 사용자에게 적절한 메시지 전달 목적과 의도된 코드 중단을 목표로 강제로 예외 발생시키는 경우는 매우 많음.
//        System.out.println(opt2_1.orElseThrow(() -> new RuntimeException("값이 없습니다."))); // 에러 발생, 의도된 코드 중단
//        System.out.println(opt2_1.get()); // 에러 발생, 의도치 않은 에러 발생

//        // Optional 객체 예시1
        List<Student> studentList = new ArrayList<>();
//        // 평균 구하기 방법1
//        OptionalDouble age = studentList.stream().mapToInt(a -> a.getAge()).average();
//        if (age.isPresent()) {
//            System.out.println(age.getAsDouble());
//        } else {
//            throw new NoSuchElementException("값이 없습니다.");
//        }

//        // 평균 구하기 방법2
//        System.out.println(
//                studentList.stream().mapToInt(a -> a.getAge()).average()
//                        .orElseThrow(() -> new NoSuchElementException("값이 없습니다. 확인해주세요."))
//        );

        // Optional 객체 예시2
        studentList.add(new Student("kim", 24));
        studentList.add(new Student("lee", 21));
        studentList.add(new Student("park", 35));
        studentList.add(new Student("choi", 15));
        System.out.println("조회하고자 하는 student의 index 번호를 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        int indexNumber = Integer.parseInt(sc.nextLine());
        // index 범위가 list 안에 있으면 Optional.ofNullable 또는 of, ofEmpty 생성
        System.out.println(Optional.ofNullable(studentList.get(indexNumber)).orElseThrow(() -> new IndexOutOfBoundsException("해당 index 범위에 벗어났습니다. 확인해주세요.")));
        Optional<Student> optStudent;
        if (studentList.size() <= indexNumber) {
            optStudent = Optional.empty();
        } else {
            optStudent = Optional.ofNullable(studentList.get(indexNumber));
        }

//        System.out.println(studentList.get(indexNumber));
        System.out.println(optStudent.orElseThrow(() -> new NoSuchElementException("입력하신 index는 존재하지 않습니다. 다시 확인해주세요.")));
    }
}
