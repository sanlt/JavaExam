package DataTypes;

public class ExtendedCashRegisterTest {
    public static void main(String[] args) {
        ExtendedCashRegister register = new ExtendedCashRegister();
        register.recordPurchase(0.75);
        register.recordPurchase(1.50);
        register.payDollars(2);
        register.payDimes(3);
        System.out.println("Change: ");
        System.out.println(register.giveChange());
        System.out.println("Expected: 0.05");
    }
}