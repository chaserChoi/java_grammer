package C01Basic;

import java.util.Scanner;

public class C05LoopStatement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int a = 0;
//        while (a < 10) {
//            System.out.println("Hello world");
//            a++;
//        }

        // while 문을 활용하여 2 ~ 10까지 출력
//        int b = 2;
//        while (b <= 10) {
//            System.out.println(b);
//            b++;
//        }

        // 도어락 키 예제 -> 무한 반복되는 도어락 키 예제 -> 입력 횟수 제한 있는 도어락 키 예제 -> 5회 입력 횟수 제한 있는 도어락 키 예제 (5회 이상 초과했습니다.)
//        int answer = 154;
//        int attempt = 1;
//        while (true) {
//            System.out.print("비밀번호 입력 : ");
//            int input = sc.nextInt();
//            if (answer == input) {
//                System.out.println("문이 열렸습니다.");
//                // break 키워드를 통해 가장 가까이에 있는 반복문을 즉시 종료
//                break;
//            } else {
//                System.out.println("비밀번호가 틀렸습니다.");
//            }
//            attempt++;
//            if (attempt == 5) {
//                System.out.println("5회 이상 초과했습니다.");
//                break;
//            }
//        }

        // 입력한 숫자의 구구단 단수 출력
        // ex) 2 -> 2X1 = 2, 2X2 = 4, ...
//        while (true) {
//            System.out.print("구구단 단수를 입력해주세요. : ");
//            int input = sc.nextInt();
//            int cnt = 1;
//            while (cnt < 10) {
//                System.out.println(input + " X " + cnt + " = " + (input * cnt));
//                cnt++;
//            }
//        }

        // do while문 : 무조건 1번은 실행되는 while문
//        int a = 100;
//        do {
//            System.out.println(a);
//        } while (a < 10);

        // for 문: 초기식, 조건식, 증감식 모두 포함된 반복문
        // for문은 사용했던 변수
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Hello world " + (i + 1));
//        }

        // 1 ~ 10 중 홀수만 출력
//        for (int i = 1; i <= 10; i++) {
//            if (i % 2 == 1) {
//                System.out.println(i);
//            }
//        }

        // 두 수의 최대공약수 찾기
//        int a = 24;
//        int b = 36;
//        int min = a > b ? b : a;
//        int answer = 0;
//        for (int i = 1; i <= min; i++) {
//            if (a % i == 0 && b % i == 0) {
//                answer = i;
//            }
//        }
//        System.out.println(answer);
//        for (int i = min; i >= 0; i--) {
//            if (a % i == 0 && b % i == 0) {
//                System.out.println(i);
//                break;
//            }
//        }

        // 소수 구하기 : 1과 자신을 제외한 숫자로 나누어지지 않는 수
        // 사용자가 입력한 값이 소수인지 아닌지 판별해주는 프로그램
//        int input = sc.nextInt();
//        boolean isPrime = true;
//        if (input < 2) {
//            isPrime = false;
//        } else {
//            for (int i = 2; i * i <= input; i++) {
//                if (input % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//        }
//        if (isPrime) { // isPrime == true
//            System.out.println(input + " : 소수입니다.");
//        } else {
//            System.out.println(input + " : 소수가 아닙니다.");
//        }

        // continue : 반복문의 조건식으로 이동하는 명령어
        // 홀수만 출력
//        for (int i = 1; i < 11; i++) {
//            if (i % 2 == 0) {
//                // continue는 코드의 직관성과 가독성을 위해 사용
//                continue;
//            }
//            System.out.println(i);
//        }

        // 향상된(enhanced) for문 = for-each문
//        int[] arr = {1, 3, 5, 7};
//        // 일반 for문
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
//        for (int a : arr) {
//          a += 10;
//        }

        // 자바 변수의 유효 범위 : {}
//        int num = 10;
//        if (true) {
//            num = 20;
//            int num2 = 20;
//        }
//        num2 = 30; // if문 중괄호 내에서 정의된 변수는 해당 중괄호 밖에서는 사용 불가
//        System.out.println(num);

        // 다중 반복문
        // 2~9단까지 한꺼번에 출력 + 각 단마다 몇단입니다. 출력
//        for (int i = 2; i < 10; i++) {
//            System.out.println(i + "단입니다.");
//            for (int j = 1; j < 10; j++) {
//                System.out.println(i + " X " + j + " = " + (i * j));
//            }
//        }

        // 라벨문 : 반복문에 이름을 붙이는   것
//        loop1:
//        for (int i = 0; i < 10; i++) {
//            loop2:
//            for (int j = 0; j < 10; j++) {
//                if (true) {
//                    break loop1; // 원하는 for문을 라벨링 통해 종료시킬 수 있음
//                }
//            }
//        }

//        int[][] arr = {{1, 2, 3}, {4, 5, 11}, {7, 8, 9}, {10, 11, 12}};
//        System.out.println(arr[1][2]); // 1번째 배열에 2번째 값을 찾는 것
//        // 숫자 11이 위치한 배열의 index 값() 출력
//        // 가장 먼저 찾아지는 11의 위치만 출력
//        // 라벨링 없는 풀이
//        boolean check=false;
//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j<arr[i].length; j++){
//                if(arr[i][j]==11){
//                    check = true;
//                    System.out.println("위치는 " + i + ", " + j + "입니다.");
//                    break ;
//                }
//            }
//            if(check){
//                break;
//            }
//        }
//
//        // 라벨링 적용 풀이
//        loop1:
//        for(int i = 0; i < arr.length; i++) {
//            for(int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] == 11) {
//                    System.out.println("찾는 숫자 11의 위치 : " + i + ", " + j);
//                    break loop1;
//                }
//            }
//        }

        // 라벨링 활용 문제풀이
        // 100~200까지 수 중에서 가장 작은 소수 출력
        for (int i = 100; i <= 200; i++) {
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            System.out.println("100~200 가장 작은 소수는 " + i + "입니다.");
            break;
        }


    }
}
