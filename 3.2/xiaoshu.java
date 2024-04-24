public class xiaoshu {
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    double num1 = i + 0.1 * k;

                    for (int r = 1; r <= 9; r++) {
                        double num2 = j + 0.1 * r;
                        if (num1 > num2) {
                            System.out.printf("%.1f > %.1f\n", num1, num2);
                        } else if (num1 < num2) {
                            System.out.printf("%.1f < %.1f\n", num1, num2);
                        } else {
                            System.out.printf("%.1f = %.1f\n", num1, num2);
                        }
                    }
                }

            }
        }
    }
}