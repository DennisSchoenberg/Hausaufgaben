package hausaufgabe38.task1;

public class Customer extends Person {

    private double money;

    public Customer(String name, double money) {
        super(name);
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public boolean pay(double amount) {
        if (money < amount) {
            System.out.println("Costumer: I don't have money");
            return false;
        }
        money -= amount;
        System.out.println("Customer: Sure i will pay");
        return true;
    }
    public void buyProduct(Seller seller, String productName, int amount) {
        System.out.println("Customer: I want to buy " + amount + " " + productName + " please");
        double price = seller.getProductPrice(productName, amount);
        //TODO: finish rest of transaction in this method
        if (price == -1) {
            return;
        }
        boolean success = pay(price);
        if (!success) {
            return;
        }

        seller.sell(productName, amount);
        System.out.println("Customer: Thanks!");
    }
}
