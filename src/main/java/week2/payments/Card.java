package week2.payments;

public class Card extends User{
    private int day, month, year;
    String ownerName,cardNumber;
    public void setCard(int day, int month, int year, BankAccount name, BankAccount nr){
        this.day=day;
        this.month=month;
        this.year=year;
        this.ownerName=name.getOwnerName();
        this.cardNumber=nr.getAttCard();
    }
    public int getDay(){
        return this.day;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }
    public String getOwnerName(){
        return this.ownerName;
    }
    public String getCardNumber(){
        return this.cardNumber;
    }


}