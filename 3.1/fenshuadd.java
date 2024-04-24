public class fenshuadd {

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

    // 分数相加
    public static double addFractions(int numerator1, int denominator1, int numerator2, int denominator2) {
        return (double) (numerator1 * denominator2 + numerator2 * denominator1) / (denominator1 * denominator2);
    }

    public static void main(String[] args) {
        for (int denominator = 1; denominator <= 9; denominator++) {
            for (int numerator1 = 1; numerator1 <= denominator; numerator1++) {
                for (int numerator2 = 1; numerator2 <= denominator; numerator2++) {
                    if (isSimplestForm(numerator1, denominator) && isSimplestForm(numerator2, denominator)) {
                        double sum = addFractions(numerator1, denominator, numerator2, denominator);
                        if (sum <= 1 && sum >= 0) {
                            int sumNumerator = numerator1 * denominator + numerator2 * denominator;
                            int sumDenominator = denominator * denominator;
                            if (sumNumerator <= sumDenominator) {
                                int gcdValue = gcd(sumNumerator, sumDenominator);
                                sumNumerator /= gcdValue;
                                sumDenominator /= gcdValue;
                                System.out.printf("%s + %s = %s\n", formatFraction(numerator1, denominator), formatFraction(numerator2, denominator), formatFraction(sumNumerator, sumDenominator));
                            }
                        }
                    }
                }
            }
        }
    }
}
