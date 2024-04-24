public class hunzdivone {
    public static void main(String[] args) {
        for (int dividend = 100; dividend <= 990; dividend += 10) {
            for (int divisor = 1; divisor <= 9; divisor++) {
                if (dividend % divisor == 0) {
                    System.out.printf("%d / %d = %d\n", dividend, divisor, dividend / divisor);
                }
            }
        }
    }
}
