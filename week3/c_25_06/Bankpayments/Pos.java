package Bankpayments;

public class Pos {
    private String BankAccounts;
    public void setPOS(User BA){
        this.BankAccounts=BA.getBA();
    }
    public String getBankAccounts(){
        return this.BankAccounts;
    }
    public void pay(double amount,Card X,BankAccount Y,int day, int month, int year){
        boolean checkDate=true;
        if(X.getYear()<year){
            checkDate=false;
        }else if(X.getYear()==year){
            if(X.getMonth()<month){
                checkDate=false;
            }else if(X.getMonth()==month){
                if(X.getDay()<day){
                    checkDate=false;
                }
            }
        }
        if(X.getCardNumber()!=""){
            if(checkDate==true){
                if(Y.getBalance()>=amount){
                    Y.WithdrawMoney(amount);
                }else{
                    System.out.println("Fonduri insuficiente ");
                }
            }else{
                System.out.println("Card expirat ");
            }
        }else{
            System.out.println("Card inexistent ");
        }
    }
}