package C05AnonymousLambda;

import java.util.*;

public class C03ComparatorComparable {

    public static void main(String[] args) {
        // 자바에서는 비교를 위한 인테페이스가 대표적으로 2개가 제공
        // Comparable 인터페이스 : compareTo 메서드 선언
        // Comparator 인터페이스 : compare 메서드 선언 (추천 : 직관적이고 쉬움)

        // String 클래스에 compareTo 메서드 내장
        // String 클래스 및 java의 많은 클래스에서 Comparable을 상속하여 compareTo 메서드룰 구현
        String a = "hello";
        String b = "world";
        System.out.println(a.compareTo(b)); // 마이너스

        List<String> myList = new ArrayList<>();
        myList.add("java");
        myList.add("python");
        myList.add("javascript");
        Collections.sort(myList); // Comparable
        // String 안의 compareTo 메서드를 사용하여 정렬이 이뤄짐.
        myList.sort(Comparator.naturalOrder()); // Comparator

        // 직접 만큼 Student를 List에 담아 정렬
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("kim", 24));
        studentList.add(new Student("lee", 21));
        studentList.add(new Student("park", 35));
        studentList.add(new Student("choi", 15));
        studentList.add(new Student("kim", 30));

        // 정렬 방법1. Student 객체에서 Comparable을 직접 구현한 방식
        // 단점 : Student 객체를 직접 수정해야 하므로, 유연성이 떨어짐.
        // Collections.sort에서 Comparable을 구현한 객체를 요구
//        Collections.sort(studentList);
//        System.out.println(studentList);

        // 정렬 방법2. Comparator를 구현한 익명 객체 사용
        // Comparator 활용도가 높은 이유는 많은 정렬 메서드에서 Comparator 객체를 요구하기 때문
        studentList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println(studentList);

        String[] stArr = {"hello", "java", "C++", "world"};
        Arrays.sort(stArr);
        Arrays.sort(stArr, Comparator.reverseOrder());
        System.out.println(Arrays.toString(stArr));

        // 글자 길이를 기준으로 내림차순 정렬
        Arrays.sort(stArr, (o1, o2) -> o2.length() - o1.length());
        System.out.println(Arrays.toString(stArr));

        // 백준 : 단어 정렬
        Set<String> treeSet = new TreeSet<>((o1, o2) -> {
            if (o1.length() == o2.length()) {
                return o1.compareTo(o2);
            } else {
                return o1.length() - o2.length();
            }
        });

        Queue<String> pq = new PriorityQueue<>((o1, o2) -> o1.length() - o2.length());

        // 백준 - 절대값 힙
        // 백준 - 선 긋기
        // arr[0] 기준으로 정렬
        // 3가지의 경우 수 따라 total 길이 계산

    }
}

//class Student implements Comparable<Student> {
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + ", age=" + age + '}';
    }

    // 정렬은 결국 2개의 값을 비교하는 것으로, A와 B 대상 2개만 있으면 충분
    // 두 수(또는 문자)의 비교의 경우 음수, 0, 양수 세 값중에 하나만 return. 이를 통해 정렬 수행
    // this가 앞에 있을 땐 오름차순, this가 뒤에 있으면 내림차순으로 내부적으로 정렬 로직 동작
//    @Override
//    public int compareTo(Student o) {
////        return this.getName().compareTo(o.getName()); // 오름차순
////        return o.getName().compareTo(this.getName()); // 내림차순
//        return this.getAge() - o.getAge();
//    }
}
