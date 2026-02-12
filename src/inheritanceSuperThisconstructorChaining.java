import java.util.*;

class Account {
    String accountNumber;
    double balance;
    String accountHolderName;

    Account(double balance, String accountHolderName){
        this.balance = balance;
        this.accountNumber = generateAccountNumber();
        this.accountHolderName = accountHolderName;
    }
    void deposit(double amount) {
        this.balance+=amount;
        System.out.println("Deposited:" + this.balance);
    }
    void withdraw(double amount) {
        this.balance-=amount;
        System.out.println("withdrawn:" + amount);
    }

    double getBalance(){
        return this.balance;
    }

    public static String generateAccountNumber() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            int digit = random.nextInt(10); // 0–9
            sb.append(digit);
        }

        return sb.toString();
    }
}
// this(),this(int a, int b)   is used to call the own constructor okay, we call it constructor chaining
// every constructor first line is super method okay
// if this method is there and there would no super method(both have the ego)
// Avoid re-declaring the variable in child class okay.
class SavingAccount extends Account {
    static double interestRate = 5.5;
    static String bankName = "SBI";
    String aadharNumber;
    String panNumber;
    public SavingAccount(String accountHolderName, String aadharNumber, String panNumber, double amount){
        super(amount, accountHolderName);
        this.aadharNumber = aadharNumber;
        this.panNumber = panNumber;
    }
    void addInterest() {
        double interest = (balance*interestRate)/100.0;
        balance+=interest;
        System.out.println("Interest added: " + balance);
    }

    public void getPassbook(){
        System.out.println("BankName : "+ bankName);
        System.out.println("AccounHolderName : "+ this.accountHolderName);
        System.out.println("AccountNumber : "+ this.accountNumber);
        System.out.println("adharNumber: "+ this.aadharNumber);
        System.out.println("panNumber: "+ this.panNumber);
        System.out.println("balance : "+ this.balance);

    }
}

public class inheritanceSuperThisconstructorChaining {

    public static void main(String[] args) {
       System.out.println("Welcome to the Saving Account opener counter");
       System.out.println("Please Enter your following details:: Your Name, adhar number, pan number");
       Scanner scn = new Scanner(System.in);

       System.out.println("Please Enter your name");
       String AccountHolderName = scn.nextLine();

       System.out.println("Please Enter your Aadhar number");
       String aadharNumber = scn.nextLine();

       System.out.println("Please Enter your Pan number");
       String panNumber = scn.nextLine();

       System.out.println("Please enter your opening balance amount");
       double amount = scn.nextDouble();

       SavingAccount acc = new SavingAccount(AccountHolderName,aadharNumber,panNumber,amount);

       acc.getPassbook();

    }
}
