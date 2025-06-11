package C01Basic;

import java.util.Scanner;

public class C04IfStatement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 도어락 키 예제
//        int answer = 154;
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        if (answer == input) {
//            System.out.println("문이 열렸습니다.");
//        } else {
//            System.out.println("비밀번호가 틀렸습니다.");
//        }

        // 버스 카드 예제
        // 현재 가지고 있는 돈으 얼마인지 묻는다
        // 입력값을 받아서, 10000 이상이면 택시를 타라고 출력
        // 3000 ~ 10000 사이면 버스 타라고 출력
        // 그렇지 않으면 걸어가시오 출력
//        System.out.print("현재 금액: ");
//        int money = Integer.parseInt(sc.nextLine());

        // if, else if 구문에서 조건식은 택 1 로서, 한 조건에 해당하면 실행 후 구문 밖으로 빠져나감.
//        if (money >= 10000) {
//            System.out.println("택시를 타시오.");
//        } else if (money >= 3000 && money < 10000) {
//            System.out.println("버스를 타시오.");
//        } else {
//            System.out.println("걸어가시오.");
//        }

        // if문이 독립적으로 존재할 경우 정확한 범위 지정을 하지 않으면 모든 if문이 중복되어 실행될 가능성이 존재
//        if (money >= 10000) {
//            System.out.println("택시를 타시오.");
//        }
//        if (money >= 3000 && money < 10000) {
//            System.out.println("버스를 타시오.");
//        }
//        if (money < 3000) {
//            System.out.println("걸어가시오.");
//        }

        // 삼항연산자 : 결과값=조건식?반환값1:반환값2
        // 조건식이 참인 경우 반환값1이 결과값에 담기고, 거짓인 경우 반환값2가 결과값에 담김
//        System.out.print("도어락 비밀번호 입력: ");
//        int answer = 1234;
//        int input = sc.nextInt();
//        String result = (answer == input) ? "문이 열렸습니다." : "비밀번호가 틀렸습니다.";
//        System.out.println(result);


        // switch문 : if, else if, else 등 여러 조건식이 있을 때 조건문을 가독성있게 표현한 구문
        // 원하시는 서비스 번호를 입력해주세요.
        // 1. 대출 업무입니다. 2. 예금 업무입니다. 3. 적금 업무입니다. 4. 상담사 연결입니다. 그 외. 잘못된 입력입니다.
        System.out.print("원하시는 서비스 번호를 입력해주세요. : ");
        int serviceNumber = sc.nextInt();
        // if
//        if (serviceNumber == 1) {
//            System.out.println("대출 업무입니다.");
//        } else if (serviceNumber == 2) {
//            System.out.println("예금 업무입니다.");
//        } else if (serviceNumber == 3) {
//            System.out.println("적금 업무입니다.");
//        } else if (serviceNumber == 4) {
//            System.out.println("상담사 연결입니다.");
//        } else {
//            System.out.println("잘못된 입력입니다.");
//        }

        // switch
        switch (serviceNumber) {
            case 1:
                System.out.println("대출 업무입니다.");
                break;
            case 2:
                System.out.println("예금 업무입니다.");
                break;
            case 3:
                System.out.println("적금 업무입니다.");
                break;
            case 4:
                System.out.println("상담사 연결입니다.");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }
    }
}
