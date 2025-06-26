package C06EtcClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

// <> : 제네릭
public class C04GenericMain {

    public static void main(String[] args) {
        String[] stArr = {"java", "python", "C"};
        stChange(stArr, 0, 1);
        System.out.println(Arrays.toString(stArr)); // 자리가 change된 객체 출력

        Integer[] intArr = {10, 20, 30};
        intChange(intArr, 0, 1);
        System.out.println(Arrays.toString(intArr));

        allChange(stArr, 0, 1);
        allChange(intArr, 0, 1);

        // 일반 객체 생성 시
        Person p1 = new Person("hongildong");
        GenericPerson<String> p2 = new GenericPerson<>("hongildong");
        GenericPerson<Integer> p3 = new GenericPerson<>(10);

        // 제네릭 사용 예시
        List<String> myList = new ArrayList<>();
        Stream<String> myStream;
        Optional<Student> optStudent;
    }

    // 제네릭 메서드는 반환 타입 왼쪽에 <T>라고 선언
    // 이때, T에는 참조형 변수인 객체 타입만을 허용
    static <T> void allChange(T[] arr, int index1, int index2) {
        T temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    private static void stChange(String[] stArr, int index1, int index2) {
        String temp = stArr[index1];
        stArr[index1] = stArr[index2];
        stArr[index2] = temp;
    }

    private static void intChange(Integer[] intArr, int index1, int index2) {
        Integer temp = intArr[index1];
        intArr[index1] = intArr[index2];
        intArr[index2] = temp;
    }
}

// 제네릭 클래스는 클래스명 옆에 <T> 선언
class GenericPerson<T> {
    private T value;

    public GenericPerson(T name) {
        this.value = name;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

class Person {
    private String value;

    public Person(String name) {
        this.value = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
