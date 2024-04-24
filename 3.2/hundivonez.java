public class hundivonez {
    public static void main(String[] args) {
        for (int dividend = 1000; dividend <= 9999; dividend++) {
            for (int divisor = 1; divisor <= 9; divisor++) {
                if (dividend % divisor == 0) {
                    int quotient = dividend / divisor;
                    if (quotient >= 10 && quotient <= 99 && quotient % 10 == 0) {
                        System.out.printf("%d / %d = %d\n", dividend, divisor, quotient);
                    }
                }
            }
        }
    }
}
