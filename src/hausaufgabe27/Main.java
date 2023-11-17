package hausaufgabe27;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("123 43 6543 7890");
        bankAccount.deposit(200);
        System.out.println("Money in account " + bankAccount.getNumber() +
                " is " + bankAccount.getMoney());
        bankAccount.withdraw(400);
        System.out.println("Money in account " + bankAccount.getNumber() +
                " is " + bankAccount.getMoney());
        bankAccount.withdraw(150);
        System.out.println("Money in account " + bankAccount.getNumber() +
                " is " + bankAccount.getMoney());

    }

}