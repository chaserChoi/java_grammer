package C01Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class C07Array {

    public static void main(String[] args) throws IOException {
// Arrays.fill : 배열에 모든 값을 변경
//        String[] arr = new String[5];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = "";
//        }
//        Arrays.fill(arr, "");

        // 85, 65, 90으로 구성된 int 배열을 선언하고, 총합과 평균을 구해보새요.
//        int[] arr = {85, 65, 90};
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        double average = (double) sum / arr.length;
//        System.out.println("총합 = " + sum);
//        System.out.println("평균 = " + average);

//        // 배열의 최대값, 최소값
//        int[] arr2 = {10, 20, 30, 12, 8, 17};
//        int max = arr2[0];
//        int min = arr2[0];
//        for (int i = 0; i < arr2.length; i++) {
//            if (arr2[i] > max) {
//                max = arr2[i];
//            }
//            if (arr2[i] < min) {
//                min = arr2[i];
//            }
//        }
//        System.out.println("max = " + max);
//        System.out.println("min = " + min);

//        // 배열 뒤집기
//        int[] arr = {10, 20, 30, 40, 50};
//        int[] newArr = new int[arr.length];
//        int index = 0;
//        for (int i = arr.length - 1; i >= 0; i--) {
//            newArr[index] = arr[i];
//            index++;
//        }
//        System.out.println(Arrays.toString(newArr));

        // 배열의 정렬
//        int[] arr = {17, 12, 20, 10, 15};
//        Arrays.sort(arr); // 오름차순 정렬 \ 복잡도 = O(n log n)
////        Arrays.sort(arr, Comparator.reverseOrder()); // 원시 자료형은 Comparator 사용 불가능
//
//        System.out.println(Arrays.toString(arr));
//        String[] stArr = {"abc", "aaa", "acb", "abb"};
//        Arrays.sort(stArr, Comparator.reverseOrder()); // 내림차순
//        System.out.println(Arrays.toString(stArr));

        // 선택 정렬 알고리즘 직접 구현
        // 쉽지만 비효율적 => 사용 X
        // 선택정렬 알고리즘 직접구현 : 1)min값찾기 2)자리change 3)2중for문(index주의)
//        int[] arr = {17,12,20,10,15};
//        // 자리를 결정
//        for (int i = 0; i < arr.length; i++) {
//            // min값을 찾기위한 for문
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));

        // 이해하기 좋은 ver.
//        int[] arr = {17,12,20,10,15};
//        for (int i = 0; i < arr.length - 1; i++) {
//            int min = arr[i];
//            int minIndex = i;
//            // min 값을 찾기 위한 for문
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j] < min) {
//                    min = arr[j];
//                    minIndex = j;
//                }
//            }
//
//            // 자리 change 로직
//            int temp = arr[i];
//            arr[i] = arr[minIndex];
//            arr[minIndex] = temp;
//        }
//        System.out.println(Arrays.toString(arr));

          // 프로그래머스 - 두 개 뽑아서 더하기 (조합 + 즐벅 제거)

//        // 배열의 검색
//        int[] arr = {5, 3, 1, 8, 7};
//        int target = 8;
//        // 8이 몇 번째 index에 있는지 출ㅕ력
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == target) {
//                System.out.println("찾은 값의 index : " + i);
//                break;
//            }
//        }

//        // 이분 탐색(이진 검색) - binary search
//        // 사전에 데이터가 오름차순 정렬 되어 있을 결우, 이분 탐색 가능
//        int[] arr = {1,3,6,8,9,11,15};
//
//        System.out.println(Arrays.binarySearch(arr, 15)); // O(log n)

        // 백준 - 수 찾기 (1920)
        // 값이 있으면 해당 index 리턴
        // 값이 없으면 마이너스 값
        // 1. 이중 for문 사용 => O(n^2)으로 시간 초과
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        StringBuilder sb = new StringBuilder();
//        int n = Integer.parseInt(br.readLine());
//        int[] array = new int[n];
//        st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < array.length; i++) {
//            array[i] = Integer.parseInt(st.nextToken());
//        }
//        Arrays.sort(array);
//        int m = Integer.parseInt(br.readLine());
//        int[] target = new int[m];
//        st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < target.length; i++) {
//            target[i] = Integer.parseInt(st.nextToken());
//        }
//        for (int i = 0; i < target.length; i++) {
//            int isFound = 0;
//            for (int j = 0; j < array.length; j++) {
//                if (target[i] == array[j]) {
//                    isFound = 1;
//                    sb.append(isFound).append("\n");
//                    break;
//                }
//            }
//            if (isFound == 0) {
//                sb.append(isFound).append("\n");
//            }
//        }
//        System.out.println(sb);

//        // 2. 이분 탐색 사용 => O(log n)으로 통과
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        StringBuilder sb = new StringBuilder();
//        int n = Integer.parseInt(br.readLine());
//        int[] array = new int[n];
//        st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < array.length; i++) {
//            array[i] = Integer.parseInt(st.nextToken());
//        }
//        Arrays.sort(array);
//        int m = Integer.parseInt(br.readLine());
//        int[] target = new int[m];
//        st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < target.length; i++) {
//            target[i] = Integer.parseInt(st.nextToken());
//        }
//        for (int i = 0; i < target.length; i++) {
//            int index = Arrays.binarySearch(array, target[i]);
//            if (index >= 0)
//                sb.append(1).append("\n");
//            else
//                sb.append(0).append("\n");
//        }
//        System.out.println(sb);
//
//        // 배열 값 비교
//        int[] arr1 = {10, 20, 30};
//        int[] arr2 = {10, 20, 30};
//        System.out.println(arr1 == arr2);
//        System.out.println(Arrays.equals(arr1, arr2));

//        // 2차원 배열의 선언과 값 할당
//        // {{1, 2}, {3, 4}, {5, 6}}
//        int[][] arr = new int[3][2];
////        int[][] arr = new int[3][]; // 가변형
//        arr[0][0] = 1;
//        arr[0][1] = 2;
//        arr[1][0] = 3;
//        arr[1][1] = 4;
//        arr[2][0] = 5;
//        arr[2][1] = 6;
//        // 리터럴 방식
//        int[][] arr2 = {{1, 2}, {3, 4}, {5, 6}};
//
//        // 가변 배열 : 배열의 전체 길이는 반드시 할당
//        int[][] arr3 = {{1, 2}, {1, 2, 3}, {1, 2, 3, 4}};
//        // 2차원 배열의 출력
//        System.out.println(arr3); // 2차원 배열의 주소값
//        System.out.println(Arrays.toString(arr3)); // 각 1차원 배열의 주소값 모음
//        System.out.println(Arrays.deepToString(arr3)); // 각 1차원 배열의 값 출력
//
//
//        int[][] arr4 = new int[3][];
//        arr4[0] = new int[2];
//        arr4[1] = new int[3];
//        arr4[2] = new int[4];

//        // [3][4] 사이즈 선언하고 1~12까지 숫자 값을 각 배열에 순차적으로 할당
//        // {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}
//        int[][] arr = new int[3][4];
//        int num = 1;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = num;
//                num++;
//            }
//        }
//
//        System.out.println(Arrays.deepToString(arr));
//
//        // 가변 배열 값 채우기
//        int[][] arr2 = new int[3][];
//        int num2 = 1;
//        for (int i = 0; i < arr2.length; i++) {
//            arr2[i] = new int[4];
//            for (int j = 0; j < arr2[i].length; j++) {
//                arr2[i][j] = num2;
//                num2++;
//            }
//        }

        // 배열 복사
//        Arrays.copyOf(배열ㅕaud, )

    }

    // 행렬의 덧셈 - 프로그래머스
    class Solution {
        public int[][] solution(int[][] arr1, int[][] arr2) {
            int[][] answer = new int[arr1.length][arr1[0].length];

            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[i].length; j++) {
                    answer[i][j] = arr1[i][j] + arr2[i][j];
                }
            }

            return answer;
        }
    }

    // K 번째 수

}
