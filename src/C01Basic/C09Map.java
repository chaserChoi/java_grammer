package C01Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class C09Map {

    public static void main(String[] args) throws IOException {
//        // key, value로 이루어진 자료 구조
//        // key값은 중복이 있으면 value 덮어쓰기
//        Map<String, Integer> sports = new HashMap<>();
//        sports.put("농구", 2);
//        sports.put("배구", 1);
//
//        // map은 key를 통해 value를 get
//        // map에서 key값을 통한 검색 복잡도는 O(1)
//        System.out.println(sports.get("농구"));

        // map의 전체 데이터 출력
        // map의 key 값 접근 시에 인텓그 사용 불가능(순서가 없음)
        // keySet() : key 목록을 리턴하는 메서드
        // values() : map의 value 목록 리턴
//        Map<String, String> sports = new HashMap<>();
//        sports.put("soccer", "축구");
//        sports.put("baseball", "야구");
//        sports.put("basketball", "농구");

//        int total = 0;
//        for (int v : sports.values()) {
//          total += sports.get(k);
//        }
//
//        sports.remove("농구");
//
//        // containsKey : 키가 있으면 true, 없으면 false
//        System.out.println(sports.containsKey("tennis"));
//        System.out.println(sports.containsKey("tennis"));
//
//        // map 츨력 방법 2가지
//        // 1) foreach문
//        for (String s : sports.keySet()) {
//            System.out.println(s);
//            System.out.println(sports.get(s)); // value
//        }
//        Set<String> mySet = sports.keySet();
//        for (String s : mySet) {
//            System.out.println(s);
//        }
//
//        // 2) iterator 횔용
//        Iterator<String> iterator = sports.keySet().iterator();
//        // next 메서드는 데이터를 하나씩 소모시키면서 값을 반환
//
//        // Map은 key의 value 수를 count하는 목적으로 많이 활용
//        String[] arr = {"농구", "축구", "농구", "야구", "축구"};
//        // 농구:2, 축구:2, 야구:1
//        Map<String, Integer> myMap = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
////            if (myMap.containsKey(arr[i])) {
////                myMap.put(arr[i], myMap.get(arr[i] + 1));
////            } else {
////                myMap.put(arr[i], 1);
////            }
//
//            // getOrDefault(키값, 초기값) : key 값이 없을 경우 초기값 리턴
//            myMap.put(arr[i], myMap.getOrDefault(arr[i], 0) + 1);
//        }
//        System.out.println(myMap);

//        Map<String, Integer> myMap = new HashMap<>();
//        String[] removeArr = {"농구", "농구", "농구", "야구", "축구"};
        // 축구:1
//        for (int i = 0; i < removeArr.length; i++) {
//            if (myMap. containsKey(removeArr[i])) {
//                myMap.remove(removeArr[i]);
//            }
//        }
//        for (String r : removeArr) {
//          if (myMap.containsKey(r)) {
//              if (myMap.get(r) == 1)
//                  myMap.remove(r);
//              else
//                  myMap.put(r, myMap.get(r) - 1);
//          }
//        }
//        Map<String, Integer> myMap = new HashMap<>();
//        myMap.put("축구" ,3);
//        myMap.put("농구" ,2);
//        myMap.put("야구" ,1);
//        // 가장 value가 큰 key값 찾기
//        int max = Integer.MIN_VALUE;
//
//        String maxKey = "";
//        for (String s : myMap.keySet()) {
//            if (myMap.get(s) > max) {
//                max = myMap.get(s);
//                maxKey = s;
//            }
//        }
//        System.out.println(maxKey);

//        // BOJ1302 - 베스트셀러
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        int n = Integer.parseInt(br.readLine());
//        Map<String, Integer> books = new HashMap<>();
//
//        for (int i = 0; i < n; i++) {
//            String book = br.readLine();
//            books.put(book, books.getOrDefault(book, 0) + 1);
//        }
//
//        int max = Integer.MIN_VALUE;
//        String maxKey = "";
//
//        for (String s : books.keySet()) {
//          if (books.get(s) > max) {
//              max = books.get(s);
//              maxKey = s;
//          } else if (books.get(s) == max) {
//              if (s.compareTo(maxKey) < 0) {
//                  maxKey = s;
//              }
//          }
//        }
//
//        sb.append(maxKey);
//        System.out.println(sb.toString());
//
//        // 프로그래머스 : 완주하지 못한 선수

//        // LinkedHashMap : 데이터 삽입 순서 (유지)
//        Map<String, Integer> linkedMap = new LinkedHashMap<>();
//        linkedMap.put("hello1", 1);
//        linkedMap.put("hello2", 2);
//        linkedMap.put("hello3", 3);
//        linkedMap.put("hello4", 4);
//        linkedMap.put("hello5", 5);
//        for (String l : linkedMap.keySet()) {
//            System.out.println(l);
//        }
//
//        // TreeMap : key를 정렬(오름차순)하여 map 저장 (유지)
//        Map<String, Integer> treeMap = new TreeMap<>();
//        treeMap.put("hello5", 1);
//        treeMap.put("hello4", 2);
//        treeMap.put("hello3", 3);
//        treeMap.put("hello2", 4);
//        treeMap.put("hello1", 5);
//        for (String t : treeMap.keySet()) {
//            System.out.println(t);
//        }

//        // BOJ - 파일 정리
//        // 문자열 자르기 : .은 특수문자 취급되어 "." -> "\\."
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        int n = Integer.parseInt(br.readLine());
//
//        Map<String, Integer> files = new TreeMap<>();
//
//        for (int i = 0; i < n; i++) {
//            String fileName = br.readLine();
//
//            String[] parts = fileName.split("\\.");
//            files.put(parts[1], files.getOrDefault(parts[1], 0) + 1);
//        }
//
//        for (Map.Entry<String, Integer> entry : files.entrySet()) {
//          String extension = entry.getKey();
//          int cnt = entry.getValue();
//          sb.append(extension).append(" ").append(String.valueOf(cnt)).append("\n");
//        }
//
//        System.out.println(sb.toString());


    }
}
