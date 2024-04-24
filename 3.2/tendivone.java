public class tendivone {
    public static void main(String[] args) {
        for (int dividend = 10; dividend <= 99; dividend++) {
            for (int divisor = 1; divisor <= 9; divisor++) {
                if (dividend % divisor == 0) {
                    System.out.printf("%d / %d = %d\n", dividend, divisor, dividend / divisor);
                }
            }
        }
    }
}

