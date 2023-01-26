public class Main {
    public static void main(String[] args) {

        int balance = 200; //баланс клиента начальный
        int replenishment = 1004; //сумма пополнения
        int bonus = replenishment / 100;//бонус за пополнение
        int newBalance = balance + replenishment;
        int newBalanceBonus = balance + replenishment + bonus;

        if (replenishment >= 1000) {
            System.out.println("Баланс:" + newBalanceBonus);
        } else
            System.out.println("Баланс:" + newBalance);

    }
}