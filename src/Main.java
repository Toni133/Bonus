public class Main {
    public static void main(String[] args) {
        int account = 100;
        int refill = 1000;
        if (refill < 1001) {
            account = account + refill;
        }
        if (refill > 1001) {
            int bonus = refill / 100;
            account = account + refill + bonus;
        }
        System.out.println(account);
    }
}