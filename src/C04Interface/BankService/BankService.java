package C04Interface.BankService;

public interface BankService {

    void deposit(long money, BankAccount bankAccount);

    boolean withdraw(long money, BankAccount bankAccount);

    static void test() {

    }
}
