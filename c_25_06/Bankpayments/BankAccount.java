package Bankpayments;

public class BankAccount extends User {
    private
    String ownerName, iban, attachedCardNumber;
    double balance;
    public void setBankAccount(String name, User iban, User nr, double balance){
        this.ownerName=name;
        this.iban=iban.getBA();
        this.attachedCardNumber=nr.getCards();
        this.balance=balance;
    }
    public String getOwnerName(){
        return this.ownerName;
    }
    public String getiban(){
        return this.iban;
    }
    public String getAttCard(){
        return this.attachedCardNumber;
    }
    public double getBalance(){
        return this.balance;
    }

    public double addMoney(double amount){
        System.out.println("Old balance was: "+this.balance);
        this.balance+=amount;
        System.out.println("New balance is: "+this.balance+"\nTranzactie aprobata!");
        return this.balance;
    }
    public double WithdrawMoney(double amount){
        System.out.println("Old balance was: "+this.balance);
        this.balance-=amount;
        System.out.println("New balance is: "+this.balance+"\nTranzactie aprobata!");
        return this.balance;
    }
}