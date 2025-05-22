public class Encapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        System.out.println("Current Balance : "+ account.getBalance());

        account.deposit(500);
        System.out.println("Updated Balance : "+ account.getBalance());
    }
}
class BankAccount{
    private double balance; //Private varible can not be accessed directly 

    //constructor 
    public BankAccount(double initialBalnce){
        if(initialBalnce >0){
            this.balance = initialBalnce;
        }else{
            System.err.println("Balance must be positive");
        }
    } 

    // Getter method to check balance
    public double getBalance(){
        return balance;
    }

    // Setter method to modify balance securely
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Amount : "+ amount);
        }else{
            System.out.println("Deposit amount must be positive");
        }
    }
}