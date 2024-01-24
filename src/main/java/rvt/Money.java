package rvt;

public class Money {
    private final int euros;
    private final byte cents;
    public Money(int euros, byte cents) {
        this.euros = euros;
        this.cents = cents;
    }
    public Money(int euros) {
        this(euros, (byte) 0);
        
    }
    public Money(byte cents) {
        this(0, cents);
    }
    public int euros(){
        return euros;
    }
    public byte cents(){
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
        int centsnew = cents() + addition.cents;
        int CentToEur = 0;
        int AdditionCents = 0;
        int newcent = 0;
        if (centsnew >= 100){
            CentToEur = centsnew / 100;
            AdditionCents = centsnew % 100;
            newcent = AdditionCents; 
        }else{
            newcent = cents() + addition.cents(); 
        }
        int NewEur = euros() + addition.euros() + CentToEur;
           
        
        
        Money newMoney = new Money(NewEur, (byte) newcent); // create a new Money object that has the correct worth
        
        // return the new Money object
        return newMoney;
    }
    public Money plus(int euros){
        int neweur = euros() + euros;
        Money newMoney = new Money(neweur, cents());
        return newMoney;
    }
    public Money plus(byte cents){
        int newcents = cents() + cents;
        int neweur = 0;
        
        if (newcents >= 100){
            newcents = newcents - 100;
            neweur = euros() + 1;
        }else{
            neweur = euros();
        }
        Money newMoney = new Money(neweur, (byte) newcents);
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
        Money result = new Money(neweur, (byte) newcents);
        return result;   
    }


    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Money)) {
            return false;
        }
        Money comparedMoney = (Money) compared;
        
        if (this.euros == comparedMoney.euros && this.cents == comparedMoney.cents){
            return true;
        }
        return false;
    }
}
