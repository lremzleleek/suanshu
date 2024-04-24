public class fenshucom {
    
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

    public static void main(String[] args) {
        for (int denominator1 = 1; denominator1 <= 9; denominator1++) {
            for (int numerator1 = 1; numerator1 <= denominator1; numerator1++) {
                for (int denominator2 = 1; denominator2 <= 9; denominator2++) {
                    for (int numerator2 = 1; numerator2 <= denominator2; numerator2++) {
                        if (isSimplestForm(numerator1, denominator1) && isSimplestForm(numerator2, denominator2)) {
                            double value1 = (double) numerator1 / denominator1;
                            double value2 = (double) numerator2 / denominator2;
                            String fraction1 = formatFraction(numerator1, denominator1);
                            String fraction2 = formatFraction(numerator2, denominator2);
                            if (value1 < value2) {
                                System.out.printf("%s < %s\n", fraction1, fraction2);
                            } else if (value1 > value2) {
                                System.out.printf("%s > %s\n", fraction1, fraction2);
                            } else {
                                System.out.printf("%s = %s\n", fraction1, fraction2);
                            }
                        }
                    }
                }
            }
        }
    }
}
