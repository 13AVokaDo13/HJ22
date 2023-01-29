public class Main {
    public static void main(String[] args) {
        int onaccaunt = 500;
        int refill = 10000;
        int task = 1000;
        int persent = 100;
        int bonus = refill / persent;
        System.out.println("На счете:" + onaccaunt);
        System.out.println("Сумма поплнения:" + refill);
        if (refill > task) {
            System.out.println("Всего получено бонусов:" + bonus);
            System.out.println("На счете с учетом бонусов на:");
            System.out.println(onaccaunt + refill + bonus);
        } else {
            System.out.println("На счете:");
            System.out.println(onaccaunt + refill);
        }
    }
}