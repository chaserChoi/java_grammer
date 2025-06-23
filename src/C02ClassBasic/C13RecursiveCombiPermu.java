package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;

// 조합(Combination) & 순열(Permutation)
// 주로 백트래킹 알고리즘 상황에서 사용
public class C13RecursiveCombiPermu {

    public static void main(String[] args) {
//        // 2중 for문을 활용하여 helloworld1 helloworld2 ... helloworldn 출력
//        int total = 0;
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.println("helloworld" + total);
//                total++;
//            }
//        }
//
//        // 위 for문의 반복 횟수는 동적으로 결정되지 않고, 정적으로 코딩할 수 밖에 없는 한계가 존재
//        forRecur(0, 2);

        // 재귀함수 예제 : 조합
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
//        // 숫자 1, 2, 3, 4를 가지고 만들 수 있는 숫자 조합을 이중 리스트에 담아 출력
//        // [[1, 2], [1, 3], [1, 4], [2, 3], [2, 4], [3, 4]]
//        List<List<Integer>> doubleList = new ArrayList<>();

//        for (int i = 0; i < myList.size(); i++) {
//            for (int j = i + 1; j < myList.size(); j++) {
//                List<Integer> tempList = new ArrayList<>();
//                tempList.add(myList.get(i));
//                tempList.add(myList.get(j));
//                doubleList.add(tempList);
//            }
//        }

        // 재귀 함수를 만들기 위한 for문 변형
        List<List<Integer>> doubleList = new ArrayList<>();
//        List<Integer> temp = new ArrayList<>();
//        for (int i = 0; i < myList.size(); i++) {
//            temp.add(myList.get(i));
//            for (int j = i + 1; j < myList.size(); j++) {
//                temp.add(myList.get(j));
//                doubleList.add(new ArrayList<>(temp)); // 같은 temp 쓰지 않고, 새 리스트 생성 (주소값 다르게 됨)
//                temp.remove(temp.size() - 1);
//            }
//            temp.remove(temp.size() - 1);
//        }
//        System.out.println(doubleList);

//        combi(myList, new ArrayList<>(), doubleList, 2, 0);
//        System.out.println(doubleList);

        // 1, 2, 3, 4를 n개씩 뽑은 순열 구하기
        // [[1, 2], [1, 3], [1, 4], [2, 1], [2, 3], ..., [4, 3]]
        permu(myList, new ArrayList<>(), doubleList, 2);
        System.out.println(doubleList);

        // BOJ 15649 - N과 M
        // BOJ 6603
    }

    static void permu(List<Integer> myList, List<Integer> temp, List<List<Integer>> doubleList, int target) {
        if (temp.size() == target) {
            doubleList.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < myList.size(); i++) {
            if (temp.contains(myList.get(i)))
                continue;
            temp.add(myList.get(i));
            permu(myList, temp, doubleList, target);
            temp.remove(temp.size() - 1);
        }
    }

    static int staticCount = 0;

    static void forRecur(int num, int target) {
        if (num == target) {
            System.out.println("hello world" + staticCount);
            staticCount++;
            return;
        }

        for (int i = 0; i < 3; i++) {
//            System.out.println("hello world");
            forRecur(num + 1, target);
        }
    }

    static void combi(List<Integer> myList, List<Integer> temp, List<List<Integer>> doubleList, int target, int start) {
        if (temp.size() == target) {
            doubleList.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i < myList.size(); i++) {
            temp.add(myList.get(i));
            combi(myList, temp, doubleList, target, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
