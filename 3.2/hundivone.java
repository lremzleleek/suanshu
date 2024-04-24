public class hundivone {
    public static void main(String[] args) {
        for (int dividend = 100; dividend <= 999; dividend++) {
            for (int divisor = 1; divisor <= 9; divisor++) {
                if (dividend % divisor == 0 && dividend / divisor >= 10 && dividend / divisor <= 99) {
                    System.out.printf("%d / %d = %d\n", dividend, divisor, dividend / divisor);
                }
            }
        }
    }
}
