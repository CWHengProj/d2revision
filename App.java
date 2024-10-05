public class App {
    public static void main(String[] args){
        BankAccount cw = new BankAccount("CW", 12345.12f);
        cw.deposit(100);
        cw.withdraw(10000);
        FixedDeposit hcw = new FixedDeposit("CW", 125822f);
        hcw.withdraw(5);
        hcw.deposit(6);
    }

}
