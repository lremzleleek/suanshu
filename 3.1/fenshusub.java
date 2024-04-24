public class fenshusub {

    // 计算最大公约数
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 判断是否为最简分数
    public static boolean isSimplestForm(int numerator, int denominator) {
        int gcdValue = gcd(numerator, denominator);
        return (gcdValue == 1);
    }

    // 将分数格式化为字符串
    public static String formatFraction(int numerator, int denominator) {
        return String.format("%d/%d", numerator, denominator);
    }

    // 分数相减
    public static double subtractFractions(int numerator1, int denominator1, int numerator2, int denominator2) {
        return (double) (numerator1 * denominator2 - numerator2 * denominator1) / (denominator1 * denominator2);
    }

    public static void main(String[] args) {
        for (int denominator1 = 1; denominator1 <= 9; denominator1++) {
            for (int numerator1 = 1; numerator1 <= denominator1; numerator1++) {
                for (int denominator2 = 1; denominator2 <= 9; denominator2++) {
                    for (int numerator2 = 1; numerator2 <= denominator2; numerator2++) {
                        if (isSimplestForm(numerator1, denominator1) && isSimplestForm(numerator2, denominator2)) {
                            double difference = subtractFractions(numerator1, denominator1, numerator2, denominator2);
                            if (difference > 0 && denominator1 * denominator2 <= 9) {
                                int differenceNumerator = numerator1 * denominator2 - numerator2 * denominator1;
                                int differenceDenominator = denominator1 * denominator2;
                                int gcdValue = gcd(differenceNumerator, differenceDenominator);
                                differenceNumerator /= gcdValue;
                                differenceDenominator /= gcdValue;
                                System.out.printf("%s - %s = %s\n", formatFraction(numerator1, denominator1), formatFraction(numerator2, denominator2), formatFraction(differenceNumerator, differenceDenominator));
                            }
                        }
                    }
                }
            }
        }
    }
}
