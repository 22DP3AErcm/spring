package lv.rvt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import rvt.Money;

public class MoneyTest {
    @Test
    public void IsMoneyEqual(){
        Money mon1 = new Money(5, (byte) 50);
        Money mon2 = new Money(5, (byte) 50);
        assertEquals(mon1, mon2);
       
    }
    @Test
    public void plusMoney(){
        Money mon1 = new Money(5, (byte) 50);
        Money mon2 = new Money(5, (byte) 60);
        Money result = mon1.plus(mon2);

        assertEquals(new Money(11, (byte) 10), result);
    }
    @Test
    public void plusMoney2(){
        Money mon1 = new Money(5, (byte) 60);
        Money result = mon1.plus(5);

        assertEquals(new Money(10, (byte) 60), result);
    }
    @Test
    public void plusMoney3(){
        Money mon1 = new Money(5, (byte) 70);
        Money result = mon1.plus((byte) 50);

        assertEquals(new Money(6, (byte) 20), result);
    }
    @Test
    public void minusMoney(){
        Money mon1 = new Money(5, (byte) 60);
        Money mon2 = new Money(5, (byte) 50);
        Money result = mon1.minus(mon2);

        assertEquals(new Money(0, (byte) 10), result);
    }



}
