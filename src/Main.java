public class Main {
    public static void main(String[] args) {
        int a = 100;
        int am = 1200;
        if (am < 1000) {
            a = a + am;
        }
        if (am > 999) {
            int bon = am / 100;
            a = a + am + bon;
        }
        System.out.println(a);
    }
}