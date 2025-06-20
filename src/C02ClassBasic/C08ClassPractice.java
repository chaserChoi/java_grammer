package C02ClassBasic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C08ClassPractice {

    public static void main(String[] args) {
        // 객체 선언 및 List에 2개 정도 add
        List<Account> myList = new ArrayList<>();
        // 계좌 개설이 이미 된 상황
        Account a1 = new Account("hong1", "01234", 100000);
        Account a2 = new Account("hong2", "54323", 200000);
        myList.add(a1);
        myList.add(a2);

        // 계좌 번호 목록 조회
        for (Account a : myList) {
            System.out.println(a.getAccountNumber());
        }

        // 사용자1이 사용자2에게 송금(50000)
        for (Account a : myList) {
            if (a.getAccountNumber().equals("01234")) {
                a.setBalance(a.getBalance() - 50000);
            }
            if (a.getAccountNumber().equals("54323")) {
                a.setBalance(a.getBalance() + 50000);
            }
        }

        // 계좌 상세 조회 : 계좌 번호와 잔고 조회
        for (Account a : myList) {
            System.out.println("계좌 번호 : " + a.getAccountNumber() + " 잔고 : " + a.getBalance());
        }

        // Map을 자료 구조로 사용
        Map<String, Account> accountMap = new HashMap<>();
        // 계좌 개설
        accountMap.put("12345", new Account("hong1", "12345", 1000000));
        accountMap.put("54321", new Account("hong2", "54321", 1000000));

        // 송금
        Account a = accountMap.get("12345");
        Account b = accountMap.get("12345");
        a.setBalance(a.getBalance() - 50000);
        b.setBalance(b.getBalance() + 50000);

        // 계좌 조회
        for (String ac : accountMap.keySet()) {
            System.out.println(accountMap.get(ac).getAccountNumber());
        }
    }
}

// Account 클래스, 계좌주명(name-String), 계좌 번호(accountNumber-String), 잔액(balance-int)
class Account {
    private String name;
    private String accountNumber;
    private int balance;

    public Account(String name, String accountNumber, int balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}