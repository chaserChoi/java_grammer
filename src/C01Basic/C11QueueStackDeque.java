package C01Basic;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class C11QueueStackDeque {

    public static void main(String[] args) throws IOException {
//        // Queue 인터페이스를 LinkedList가 구현한 아래와 같은 방식을 가장 많이 사용
//
//        long startTime2 = System.currentTimeMillis();
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        for (int i = 0; i < 100000; i++) {
//            arrayList.add(0, i);
//        }
//        long endTime2 = System.currentTimeMillis();
//        System.out.println("ArrayList에 값 중간 add 시에 소요시간 : " + (endTime2 - startTime2));
//
//        //
//        Queue<String> myQueue = new LinkedList<>();
//        myQueue.add("문서1");
//        myQueue.add("문서2");
//        myQueue.add("문서3");
//        myQueue.add("문서4");
//
//        // queue는 일반적으로 while을 통해 요소 소모
//        while (!myQueue.isEmpty()) {
//            System.out.println(myQueue.poll());
//            // 2개씩 poll할 경우에는 queue가 empty가 되지 않도록 유의
//        }
//
////        // Queue 문제
////        // BOJ2164 - 카드2
////        // BOJ11866 - 요세푸스 문제 0
//
//        // 길이 제한 큐
//        Queue<String> blockingQueue = new ArrayBlockingQueue<>(3);
////        blockingQueue.add("문서1");
////        blockingQueue.add("문서2");
////        blockingQueue.add("문서3");
////        blockingQueue.add("문서4"); // 길이 초과 시 에러 발생
//        // offer : 길이 제한될 경우 제한된 길이까지만 insert
//        blockingQueue.offer("문서1");
//        blockingQueue.offer("문서2");
//        blockingQueue.offer("문서3");
//        blockingQueue.offer("문서4");
//        System.out.println(blockingQueue);

//        // 우선순위 큐 : 데이터를 poll할 때 정렬된 데이터 결과값 보정
//        // 전체 데이터가 계속해서 변경되면서 지속적으로 최소값을 추출해야 하는 경우.
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
////        pq.add(40);
////        pq.add(50);
////        while (!pq.isEmpty()) { // add할 때 까지는 전혀 정렬이 돼 있지 않음
////            System.out.println(pq.poll()); // 1개씩 poll할 때마다 최소값을 뽑아낸다. O(log n)
//        }

//        // BOJ 1927 - 최소 힙
//
//        // 최대 힙
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//        System.out.println(pq);
//        while (!pq.isEmpty()) { // add할 때 까지는 전혀 정렬이 돼 있지 않음
//            System.out.println(pq.poll()); // 1개씩 poll할 때마다 최소값을 뽑아낸다. O(log n)
//        }

        // 프로그래머스 : 더 맵게


//        // stack : 후입 선출
//        Stack<Integer> stack = new Stack<>();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
//        System.out.println(stack.size());
//        System.out.println(stack.isEmpty());

        // 프로그래머스 - 같은 숫자는 싫어

        // deque : addLast, pullLast, pollFirst, pollFirst, peekFirst, peekLast
        Deque<Integer> d1 = new ArrayDeque<>();
        d1.addLast(10);
        d1.addLast(20);
        d1.addFirst(30);
        System.out.println(d1.pollLast()); // 20
        System.out.println(d1.pollFirst()); // 30
        System.out.println(d1.peekLast()); // 10
    }
}
