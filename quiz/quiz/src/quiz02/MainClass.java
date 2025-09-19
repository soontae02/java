package quiz02;

public class MainClass {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount("1234", 1000);
        bank.deposit(1000);
        bank.withdraw(500);
        double bal = bank.getBalance();
        System.out.println("잔액:" + bal);

        Car car = new Car("벤츠");
        car.accelerate();
        car.getCarInfo();
        car.brake();
        car.getCarInfo();
    }
}
