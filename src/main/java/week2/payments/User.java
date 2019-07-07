package week2.payments;

public class User {
    private String Cards, BankAccounts;
    public void setUser(String Cards, String BankAccounts){
        this.Cards=Cards;
        this.BankAccounts=BankAccounts;
    }
    public String getCards(){
        return Cards;
    }
    public String getBA(){
        return BankAccounts;
    }
    public void setCards(){
        this.Cards=Cards;
    }
    public void setBA(){
        this.BankAccounts=BankAccounts;
    }

}
