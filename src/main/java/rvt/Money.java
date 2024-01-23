package rvt;

public class Money {
    private final int euros;
    private final int cents;
    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }
    public Money(int euros) {
        this(euros, 0);
        
    }
    public Money() {
        this(0,0);
    }
    public int euros(){
        return euros;
    }
    public int cents(){
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + " eur";
    }
    public Money plus(Money addition) {
        int centsnew = cents() + cents();
        int CentToEur = 0;
        int AdditionCents = 0;

        if (centsnew >= 100){
            CentToEur = centsnew / 100;
            AdditionCents = centsnew % 100;
        }
        int NewEur = euros() + addition.euros() + CentToEur;
        int newcent = AdditionCents;
        
        
        
        Money newMoney = new Money(NewEur, newcent); // create a new Money object that has the correct worth
        
        // return the new Money object
        return newMoney;
    }
    public boolean lessThan(Money addition){
        double first = euros() * 100 + cents();
        double second = addition.euros() * 100 + cents();
        if (first > second){
            return true;
        }else{
            
            return false;
        }
    }
    public Money minus(Money addition){
        int money = euros() * 100 + cents();
        int money2 = addition.euros() * 100 + cents();
        int newcents = 0;
        int neweur = 0;
        if (money - money2 < 0){  
            newcents = 0;
            neweur = 0;
        }else{
            int money3 = money - money2;
            neweur = money3 % 100;
            newcents = money3 / 100;
        }
        Money result = new Money(newcents, neweur);
        return result;
        
    }
}
