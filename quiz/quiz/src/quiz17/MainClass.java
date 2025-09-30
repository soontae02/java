package quiz17;

public class MainClass {
    public static void main(String[] args) {
        BankQueueSystem system = new BankQueueSystem();

        system.takeTicket("김");
        system.takeTicket("나");
        system.takeTicket("박");

        System.out.println("현재 대기: " + system.getWaitingCount());

        System.out.println("다음 차례: " + system.peekNextCustomer());

        System.out.println("호출 고객: " + system.callNextCustomer());

        System.out.println("호출 고객: " + system.callNextCustomer());

        System.out.println("호출 고객: " + system.callNextCustomer());
    }
}
