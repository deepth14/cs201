package lab4;

public class CoffeeApp {
    public static void main(String[] args) {
        CoffeeBag dunkin = new CoffeeBag(32,5);

        System.out.println( dunkin.totalPriceWithTax());
    }
}
