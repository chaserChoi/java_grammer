package C01Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08List {

    public static void main(String[] args) {
//        // add : 리스트에 값을 하나씩 추가하는 메서드
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(0, 30); // List는 중간 데이터 삽입은 성능 비효율적
//        System.out.println(myList);

//        // get(index) : 특정 index의 요소 반환
//        System.out.println(myList.get(0));
//
//        // size() : 리스트개수(길이) 반환
//        System.out.println(myList.size());
//
//        // for문 활용해서 myList값 하나씩 모두 출력
//        for (int i = 0; i < myList.size(); i++) {
//            System.out.println(myList.get(i));
//        }
//
//        // for-each문 활용
//        for (Integer i : myList) {
//            System.out.println(i);
//        }

        // remove : 요소 삭제
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(20);
        myList.add(30);

//        // 1) index를 통한 삭제
//        myList.remove(0);
//        System.out.println(myList);
//
//        // 2) value를 통한 삭제(일반적이지 않음)
//        myList.remove(0);
//        myList.remove(Integer.valueOf(30));
//        System.out.println(myList);
//
//        // clear : 요소 전체 삭제
//        myList.clear();
//        System.out.println(myList.isEmpty());

        // indexOf : 특정값을 찾아 index return (가장 먼저 나오는 값)
        List<Integer> myList2 = new ArrayList<>();
        myList2.add(10);
        myList2.add(20);
        myList2.add(30);
        myList2.add(30);
        System.out.println(myList2.indexOf(30));

        // contains : 값이 있는지 없는지 여부 리턴
        System.out.println(myList2.contains(20));

        // n의 배수 고르기 - 프로그래머스


//        // 정렬
//        // 1. Collections 클래스 사용 2. 객체 사용
//        List<Integer> myList4 = new ArrayList<>();
//        myList2.add(10);
//        myList2.add(20);
//        myList2.add(30);
//        myList2.add(30);

        // 이중 리스트 : 리스트 안의 리스트
        List<List<Integer>> myList4 = new ArrayList<>();
        List<Integer> myList5 = new ArrayList<>();
        myList4.add(myList5);
        myList4.add(new ArrayList<>());
        myList4.get(0).add(1);
        myList4.get(1).add(2); // [[1, 2], []]
        myList4.get(0).add(3);
        myList4.get(1).add(4); // [[1, 2], [3, 4]]

        // for문 이용해서 [[1, 2, 3], [4, 5, 6], [7, 8, 9], [10, 11, 12]] 이중 리스트 조회
        List<List<Integer>> doubleList = new ArrayList<>();
        int num = 1;
        for (int i = 0; i < 4; i++) {
            doubleList.add(new ArrayList<>());
            for (int j = 0; j < 3; j++) {
                doubleList.get(i).add(num);
                num++;
            }
        }
        System.out.println(doubleList);

        // 리스트 안에 배열
        // [{1, 2}, {1, 2, 3}, {1, 2, 3, 4}]
        List<int[]> myList6 = new ArrayList<>();
        myList6.add(new int[2]);
        myList6.get(0)[0] = 1;
        myList6.get(0)[1] = 2;
        myList6.add(new int[3]);
        myList6.get(1)[0] = 1;
        myList6.get(1)[1] = 2;
        myList6.get(1)[2] = 3;
        myList6.add(new int[]{1, 2, 3, 4});

        for (int i = 0; i < myList6.size(); i++) {
            System.out.println(Arrays.toString(myList6.get(i)));
        }

        for (int[] m : myList6) {
            System.out.println(Arrays.toString(m));
        }
    }
}
