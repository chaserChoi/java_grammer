package C02ClassBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class C09BankService {

    public static void main(String[] args) throws IOException {
        // 자료 구조 : BankAccount 객체를 담아 둘 자료 구조 선언 (List, Map)
        Map<String, BankAccount> accountMap = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            // 계좌 개설
            System.out.print("서비스 번호를 입력하세요. 1.개설 2.조회 3.입금 4.출금 5.송금 0.종료 : ");
            int serviceNumber = Integer.parseInt(br.readLine());

            switch (serviceNumber) {
                case 1: // 계좌 개설
                    System.out.print("성함을 입력해주세요. : ");
                    String name = br.readLine();
                    System.out.print("계좌 번호를 입력해주세요. : ");
                    String accountNumber = br.readLine();
                    System.out.print("현재 잔액을 입력해주세요. : ");
                    int balance = Integer.parseInt(br.readLine());
                    if (accountMap.containsKey(accountNumber)) {
                        System.out.println("이미 존재하는 계좌 번호입니다. 다른 계좌 번호를 입력해주세요.");
                    } else {
                        accountMap.put(accountNumber, new BankAccount(name, accountNumber, balance));
                        System.out.println("계좌가 개설되었습니다. 성명: " + name + ", 계좌 번호: " + accountNumber + ", 잔액: " + balance);
                    }
                    break;
                case 2: // 계좌 조회
                    System.out.print("계좌 조회 서비스입니다. 계좌 번호를 입력해주세요. : ");
                    accountNumber = br.readLine();

                    if (accountMap.containsKey(accountNumber)) {
                        printAccountInfo(accountMap.get(accountNumber));
                    } else {
                        printNotFoundMessage();
                    }
                    break;
                case 3: // 입금
                    System.out.println("게좌 입금 서비스입니다. 계좌 번호와 입금 금액을 입력해주세요.");
                    System.out.print("계좌 번호 : ");
                    accountNumber = br.readLine();
                    System.out.print("입금 금액 : ");
                    int money = Integer.parseInt(br.readLine());

                    if (accountMap.containsKey(accountNumber)) {
                        BankAccount account = accountMap.get(accountNumber);
                        account.deposit(money);
                        System.out.println("입금이 완료되었습니다. 현재 잔액 : " + accountMap.get(accountNumber).getBalance());
                    } else {
                        printNotFoundMessage();
                    }
                    break;
                case 4: // 출금
                    System.out.println("계좌 출금 서비스입니다. 계좌 번호와 출금 금액을 입력해주세요.");
                    System.out.print("계좌 번호 : ");
                    accountNumber = br.readLine();
                    System.out.print("출금 금액 : ");
                    money = Integer.parseInt(br.readLine());

                    if (accountMap.containsKey(accountNumber)) {
                        if (accountMap.get(accountNumber).withdraw(money)) {
                            System.out.println("출금이 완료되었습니다. 남은 금액은 " + accountMap.get(accountNumber).getBalance() + " 원 입니다.");
                        } else {
                            System.out.println("잔액이 부족합니다! 남은 금액은 " + accountMap.get(accountNumber).getBalance() + " 원 입니다.");
                        }
                    } else {
                        printNotFoundMessage();
                    }
                    break;
                case 5: // 송금
                    System.out.print("송금 서비스입니다. 본인의 계좌 번호를 입력해주세요. : ");
                    accountNumber = br.readLine();
                    System.out.print("보내고자 하는 상대방의 계좌 번호를 입력해주세요. : ");
                    String targetAccountNumber = br.readLine();
                    System.out.print("송금 금액을 입력해주세요. : ");
                    money = Integer.parseInt(br.readLine());

                    if (accountMap.containsKey(accountNumber)) {
                        if (accountMap.containsKey(targetAccountNumber)) {
                            if (accountMap.get(accountNumber).withdraw(money)) {
                                accountMap.get(accountNumber).transfer(accountMap.get(targetAccountNumber), money);
                                System.out.println("송금이 완료되었습니다. 남은 금액은 " + accountMap.get(accountNumber).getBalance() + " 원 입니다.");
                            } else {
                                System.out.println("잔액이 부족합니다! 남은 금액은 " + accountMap.get(accountNumber).getBalance() + " 원 입니다.");
                            }
                        } else {
                            System.out.println("상대방의 계좌 번호를 찾을 수 없습니다!");
                        }
                    } else {
                        printNotFoundMessage();
                    }

                    break;
                case 0: // 종료
                    System.out.println("서비스를 종료합니다.");
                    break;
                default: // 잘못된 서비스 번호 입력 시
                    System.out.println("잘못된 서비스 번호입니다! 다시 입력해주세요.");
            }

            if (serviceNumber == 0) {
                break;
            }
        }
    }

    public static void printAccountInfo(BankAccount account) {
        System.out.println("=== 계좌 정보 ===");
        System.out.println("성명 : " + account.getName());
        System.out.println("계좌 번호 : " + account.getAccountNumber());
        System.out.println("잔액 : " + account.getBalance());
        System.out.println("================");
    }

    public static void printNotFoundMessage() {
        System.out.println("해당 계좌 번호는 존재하지 않습니다!");
    }
}

class BankAccount {
    // 필드
    private static Long id = 1L; // static 필드 선언 => auto_increment 역할
    private String name;
    private String accountNumber;
    private int balance;

    // 생성자
    public BankAccount(String name, String accountNumber, int balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        id++; // 계좌 개설마다 id 증가 (auto_increment)
    }

    // getter 생성
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    // setter 생성 -> 의도를 명확히 한 메서드 생성
    public void deposit(long money) {
        this.balance += money;
    }

    public boolean withdraw(long money) {
        if (this.balance >= money) {
            this.balance -= money;
            return true;
        } else {
            return false;
        }
    }

    // 매개변수로 BankAccount 또는 String의 accountNumber 둘 다 가능
    public void transfer(BankAccount targetAccount, long money) {
        targetAccount.deposit(money);
    }
}
