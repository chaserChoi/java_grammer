package C07ExceptionFileParsing.MemberException;

import java.util.Scanner;

// 사용자의 입출력을 받아 처리하는 계층
public class MemberController {

    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. 회원 가입, 2. 회원 상세 조회, 3. 회원 목록 조회, 0. 종료");
            String input = sc.nextLine();
            if (input.equals("1")) {
                // 이름, 이메일, 패스워드 입력받아서 service에 전달해서 회원 가입
                // 예외 발생 시 적절한 문구를 사용자에게 출력
                System.out.print("이름 : ");
                String name = sc.nextLine();
                System.out.print("이메일 : ");
                String email = sc.nextLine();
                System.out.print("비밀번호 : ");
                String password = sc.nextLine();

                if (password.length() < 8) {
                    System.out.println("비밀번호가 너무 짧습니다.");
                    continue;
                }

                try {
                    memberService.register(name, email, password);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    continue;
                }

                // 내 코드
//                try {
//                    memberService.register(name, email, password);
//                } catch (IllegalArgumentException e) {
//                    System.out.println("회원 가입 중 오류가 발생했습니다. " + e.getMessage());
//                    e.printStackTrace();
//                } catch (Exception e) {
//                    throw new RuntimeException(e);
//                }
//                if (memberService.findByEmail(email).getEmail() == email) {
//                    System.out.println("회원 가입이 완료되었습니다. " + name + "님 환영합니다.");
//                } else {
//                    System.out.println("회원 가입에 실패했습니다. 다시 시도해주세요.");
//                }
            } else if (input.equals("2")) {
                // 회원 정보 출력
                // 적절한 예외 처리 필요
                System.out.print("조회할 회원의 Email을 입력하세요. : ");
                String searchEmail = sc.nextLine();
                try {
                    Member findEmail = memberService.findByEmail(searchEmail);
                    System.out.println(findEmail.getEmail() + "님의 회원 정보: " + findEmail);
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                    throw new IllegalArgumentException("해당 이메일이 존재하지 않습니다.");
                } catch (NullPointerException e) {
                    System.out.println("잘못된 이메일 형식입니다.");
                    e.printStackTrace();
                }
            } else if (input.equals("3")) {
                // 회원 목록 정보 출력
                if (!memberService.findAll().isEmpty()) {
                    System.out.println("=== 회원 목록 ===");
                    System.out.println("ID\t이름\t이메일\t비밀번호");
                    for (Member member : memberService.findAll()) {
                        System.out.println(member);
                    }
                } else {
                    System.out.println("등록된 회원이 없습니다.ㅠㅠ");
                }
            } else if (input.equals("0")) {
                System.out.println("프로그램을 종료합니다.");
                sc.close();
                return;
            }
        }
    }
}
