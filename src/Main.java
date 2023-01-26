public class Main {
    public static void main(String[] args) {

        int balance = 100; //баланс клиента начальный
        int replenishment = 500; //сумма пополнения

        int bonus;

        if (replenishment <=1000) {
            bonus = 0;
        } else {
            bonus = replenishment / 100;
        }

        int newBalanceBonus = balance + replenishment + bonus; //итоговый баланс

        System.out.println("Бонус: " + bonus + " Итоговый баланс: " + newBalanceBonus);


    }
}