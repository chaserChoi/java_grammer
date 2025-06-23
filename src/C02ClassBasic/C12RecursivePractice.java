package C02ClassBasic;

public class C12RecursivePractice {

    public static void main(String[] args) {
         // for문으로 1~10까지 누적 합계
        int total = 0;
        for (int i = 1; i < 11; i ++) {
            total += i;
        }
        System.out.println(total);

        // 재귀 함수로 1~10까지 누접 합계
        sumAcc(1, 10);

        // 재귀 함수로 factorial 값 구하기
        System.out.println(factorial(5));

        // 피보나치 수열 10번째 값 구하기 (재귀 함수 없이 풀이)
        int target = 10;
        int n1 = 1, n2 = 1;
        int result = 0;

        for (int i = 3; i <= target; i++) {
            result = n1 + n2;
            n1 = n2;
            n2 = result;
        }
        System.out.println(result);

        // 피보나치 수열 10번째 값 구하기 (DP 사용)
        // DP(Dynamic Programming) : 기억하기(메모이제이션) 알고리즘을 활용한 풀이법 -> 성능 좋음
        int[] fib = new int[target + 1];
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i < target; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        System.out.println(fib[target - 1]);

        // 피보나치 수열 10번째 값 구하기 (재귀 함수 사용)
        System.out.println(fibonacci(10));
    }

    public static int sumAcc(int n, int target) {
        // 종료 조건
        if (n > target) {
            return 0;
        }
        return n + sumAcc(n + 1, target);
    }

    // 재귀 함수로 factorial값 구하기 : 1 ~ n까지 모두 곱한 값
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        System.out.print(n);
        if (n == 1)
            System.out.print(" = ");
        else
            System.out.print(" * ");

        return n * factorial(n - 1);
    }

    // 피보나치 수열 : f(n - 1) + f(n - 2) = F(n)
    // 1 + 1 + 2 + 3 + 5 + 8 + 13 ...
    // 재귀 함수 단점 : 계산 중복 문제 => 성능 저하 => DP로 대체
    public static int fibonacci(int target) {
        if (target == 1 || target == 2) {
            return 1;
        }
        return fibonacci(target - 1) + fibonacci(target - 2);
    }
}
