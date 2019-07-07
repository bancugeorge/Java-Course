package week2.payments;

public class Main {

    public static void main(String[] args) {
        User X = new User();
        BankAccount cont = new BankAccount();
        Card card = new Card();
        User Y = new User();
        BankAccount fara_card = new BankAccount();
        Card inexistent = new Card();
        Pos plata = new Pos();

        X.setUser("1234-1234-1234-1234","iban");
        cont.setBankAccount("X",X,X,1000.5);
        card.setCard(10,2,2019,cont,cont);
        Y.setUser("","qwe");
        fara_card.setBankAccount("Y",Y,Y,900);
        inexistent.setCard(10,2,2019,fara_card,fara_card);
        plata.setPOS(X);
        plata.pay(123,card,cont,10,1,2019);//tranzactie aprobata
        plata.pay(1234,card,cont,10,1,2019);//fonduri insuficiente
        plata.pay(123,card,cont,11,2,2019);//card expirat
        plata.pay(123,inexistent,fara_card,10,1,2019);//card inexistent

        System.out.println(cont.getBalance());
    }
}
