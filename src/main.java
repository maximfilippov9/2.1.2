public class main {
    public static void main(String[] args) {
        int balance = 200;
        int payment = 2000;
        boolean accrued = true;
        int bonus;
        if (payment > 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }
        int bon = balance + payment + bonus;
        System.out.println(bon);
    }
}
