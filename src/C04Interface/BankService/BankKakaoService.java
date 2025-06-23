package C04Interface.BankService;

public class BankKakaoService implements BankService {

    @Override
    public void deposit(long money, BankAccount bankAccount) {
        // 현재 얼마 있는지 조회
        long balance = bankAccount.getBalance();

        // 그 금액과 money와 합산하여 updateBalance
        bankAccount.updateBalance(balance + money);
    }

    @Override
    public boolean withdraw(long money, BankAccount bankAccount) {
        // 현재 얼마 있는지 조회
        long balance = bankAccount.getBalance();

        // 그 금액과 money와 차감하여 updateBalance
        if(balance - money < 0) {
            return false;
        }

        bankAccount.updateBalance(balance - money);
        return true;
    }
}
