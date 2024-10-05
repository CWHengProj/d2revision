public class FixedDeposit extends BankAccount{
    private Float interest;
    private Integer duration;
    
    public FixedDeposit(String accName, float balance) {
        super(accName, balance);
        this.interest= 3.0f;
        this.duration = 6;
    }

    public FixedDeposit(String accName, Float interest, Integer duration) {
        super(accName);
        this.interest = interest;
        this.duration = 6;
    }

    public FixedDeposit(String accName, float balance, Float interest, Integer duration) {
        super(accName, balance);
        this.interest = interest;
        this.duration = duration;
    }

    public FixedDeposit(String accName, float balance, Float interest) {
        super(accName, balance);
        this.interest = interest;
    }

    //once balance set, it cannot be changed
    @Override
    public void withdraw(Integer amount) {
        System.out.println("You cannot withdraw.");
    }
    @Override
    public void deposit(Integer amount){
        System.out.println("You cannot deposit.");
    }
    @Override
    public float getBalance(){
        return this.getBalance()+this.interest;
    }

}
