import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;


public class BankAccount{
    private final String accName;
    private final String accNumber;
    private float balance;
    private List<String> transactionList;
    private boolean isClosed;
    private String accCreated;
    private String accClosed;

    public BankAccount(String accName) {
        this.accName = accName;
        this.isClosed = false;
        this.balance = 0;
        this.accNumber = genAccNumber();
    }
    
    public BankAccount(String accName, float balance) {
        this.accName = accName;
        this.balance = balance;
        this.accNumber = genAccNumber();
    }

    public String genAccNumber(){
        return "assdfsdhjkf"; //create random number generator here for unique value
    }
    public String getAccName() {
        return accName;
    }
    public String getAccNumber() {
        
        return accNumber;
    }
    public float getBalance() {
        return balance;
    }
    public void setBalance(float balance) {
        this.balance = balance;
    }
    public List<String> getTransactionList() {
        return transactionList;
    }
    public void setTransactionList(List<String> transactionList) {
        this.transactionList = transactionList;
    }
    public boolean isClosed() {
        return isClosed;
    }
    public void setClosed(boolean isClosed) {
        this.isClosed = isClosed;
    }
    public String getAccCreated() {
        return accCreated;
    }
    public void setAccCreated(String accCreated) {
        this.accCreated = accCreated;
    }
    public String getAccClosed() {
        return accClosed;
    }
    public void setAccClosed(String accClosed) {
        this.accClosed = accClosed;
    }
    public void deposit (Integer amount){
        //if valid, add to transactions list
        if (transactionList==null){//todo understand what is the cause of the errors with list
            transactionList = new ArrayList<>();
        }
        if (amount>0){
            String amt = amount.toString();
            LocalDateTime time = LocalDateTime.now();
            String currentTime = time.toString();
            transactionList.add("$" +amt+ "added at" + currentTime);
            this.balance = amount + balance;
        }
        else{
            throw new IllegalArgumentException("Please deposit a positive value.");
        }

        
    }
    public void withdraw (Integer amount){
        //if valid, add to transactions list
        if (amount>0){
            String amt = amount.toString();
            LocalDateTime time = LocalDateTime.now();
            String currentTime = time.toString();
            transactionList.add("$" +amt+ "withdrawn at" + currentTime);
            this.balance = amount - balance;
        }
        else{
            throw new IllegalArgumentException("Please deposit a positive value.");
        }

        
    }
}