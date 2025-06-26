package C07ExceptionFileParsing;

import java.sql.SQLException;
import java.util.Scanner;

public class C01Exception {

    public static void main(String[] args) {
//        // 일반적인 예외 처리 방식
//        System.out.println("나눗셈 프로그램입니다.");
//        Scanner sc = new Scanner(System.in);
//        // 예외 처리 : 예외 발생할 갓으로 예상되는 코드를 try로 감싼다.
//        try {
//            System.out.println("분자를 입력해주세요.");
//            int head = Integer.parseInt(sc.nextLine());
//            System.out.println("분모를 입력해주세요.");
//            int tail = Integer.parseInt(sc.nextLine());
//            int result = head / tail; // 여기서 예외 발생 시 try ㅣ내부의 하단의 코드는 실행되지 않음
//            System.out.println("두 수를 나눈 결과 값은 " + result);
//            // catch를 통해 예상되는 예외 클래스를 분기 처리한다.
//        } catch (ArithmeticException e) {
//            System.out.println("0으로 나누시면 안됩니다.");
//            // 아래와 같은 방식으로 시스템 로그를 기록
//            e.printStackTrace();
//        } catch (NumberFormatException e) {
//            System.out.println("에상치 못한 에러가 발생했습니다.");
//            e.printStackTrace();
//        } finally {
//
//        }

        // 의도된 예외 강제 발생 : 특정 시점에 프로그램 강제 중지
        System.out.println("로그인을 위한 비밀번호를 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
//        login(input);

        // checked exception의 경우에는 예외 처리를 위임받게 되면, 반드시 예외 처리를 하거나, 다시 throws 해야함
        try {
            login2(input);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("환영합니다.");
    }

    // throws 키워드를 통해 예외 위임.
    // 다만, Unchecked 예외에서는 예외 처리가 강제가 아니므로, throws가 큰 의미 없음.
    // 그러나, Checked 예외에서는 예외 처리가 강제되므로, throws가 의미 있음.
    static boolean login(String password) throws IllegalArgumentException {
        if (password.equals("1234"))
            return true;
        else {
            // 예외를 강제 발생시킴으로서 이 시점에서 해당 메서드 강제 종료
            // 예외는 기본적으로 해당 메서드를 호출한 쪽으로 전파
            throw new IllegalArgumentException("비밀번호를 잘못 입력하였습니다.");
        }
    }

    static boolean login2(String password) throws SQLException {
        if (password.equals("1234"))
            return true;
        else {
            // checked exception은 예외 처리 강제
            // 해당 메서드 내에서 예외 처리를 하든, 아니면 명시적으로 throws를 통해 호출 메서드 쪽에 위임
            throw new SQLException("비밀번호를 잘못 입력하였습니다.");
        }
    }
}
