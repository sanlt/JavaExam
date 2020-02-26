package DataTypes;

import java.math.BigDecimal;

public class ExtendedCashRegister {

    public static final BigDecimal PENNY_VALUE = new BigDecimal("0.01");
    public static final BigDecimal NICKEL_VALUE = new BigDecimal("0.05");
    public static final BigDecimal DIME_VALUE = new BigDecimal("0.10");
    public static final BigDecimal QUARTER_VALUE = new BigDecimal("0.25");

    private BigDecimal purchase = BigDecimal.ZERO;
    private BigDecimal payment = BigDecimal.ZERO;


    public void payCash(int dollars, int quarters, int dimes, int nickles, int pennies) {
        payment = BigDecimal.valueOf(dollars).add(QUARTER_VALUE.multiply(BigDecimal.valueOf(quarters)))
                .add(DIME_VALUE.multiply(BigDecimal.valueOf(dimes)))
                .add(NICKEL_VALUE.multiply(BigDecimal.valueOf(nickles)))
                .add(PENNY_VALUE.multiply(BigDecimal.valueOf(pennies)));
    }


    public void recordPurchase(double amount) {
       purchase = purchase.add(BigDecimal.valueOf(amount));
    }


    public void payDollars(int dollars) {
        payment = payment.add(BigDecimal.valueOf(dollars));

    }

    public void payQuarters(int quarters) {
        payment = payment.add(QUARTER_VALUE.multiply(BigDecimal.valueOf(quarters)));
    }

    public void payDimes(int dimes) {
        payment = payment.add(DIME_VALUE.multiply(BigDecimal.valueOf(dimes)));
    }

    public void payNickles(int nickels) {
        payment = payment.add(NICKEL_VALUE.multiply(BigDecimal.valueOf(nickels)));
    }

    public void payPennies(int pennies) {
        payment = payment.add(PENNY_VALUE.multiply(BigDecimal.valueOf(pennies)));
    }

    public double giveChange(){
        BigDecimal change = payment.subtract(purchase);
        purchase = BigDecimal.ZERO;
        payment = BigDecimal.ZERO;
        return change.doubleValue();

    }
    public double changeToQuarters(int dollars) {
        return dollars / QUARTER_VALUE.doubleValue();
    }



}
