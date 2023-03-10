public class Main {
    public static void main(String[] args) {
        int account = 100;
        int refill = 1200;
        if (refill < 1000) {
            account = account + refill;
        }
        if (refill > 999) {
            int bonus = refill / 100;
            account = account + refill + bonus;
        }
        System.out.println(account);
    }
}