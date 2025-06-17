package C01Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class C10Set {

    public static void main(String[] args) throws IOException {
//        // 중복 X, 순서 보장 X
//        Set<String> mySet = new HashSet<>();
//        mySet.add("h");
//        mySet.add("h");
//        mySet.add("e");
//        mySet.add("l");
//        mySet.add("l");
//        mySet.add("o");
//        System.out.println(mySet);

//        // BOJ - 숫자 카드
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        StringTokenizer st;
//
//        int n = Integer.parseInt(br.readLine());
//        Set<Integer> set = new HashSet<>();
//        st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < n; i++) {
//            set.add(Integer.parseInt(st.nextToken()));
//        }
//
//        int m = Integer.parseInt(br.readLine());
//        st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < m; i++) {
//            int target = Integer.parseInt(st.nextToken());
//            if (set.contains(target))
//                sb.append(1).append(" ");
//            else
//                sb.append(0).append(" ");
//        }
//
//        System.out.println(sb.toString());

        // 프로그래머스 - 폰켓몬

        

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(1);
        treeSet.add(0);
        treeSet.add(3);
        treeSet.add(1);
        System.out.println(treeSet);
    }
}
