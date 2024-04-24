public class mutaddsub {
    public static void main(String[] args) {
        int num1, num2, num3, num4, result;

        //1*1+1
        for (int i = 1; i < 10; i++) {
            num1 = i;
            for (int j = 1; j < 10; j++) {
                num2 = j;
                for (int k = 0; k <= 100; k++) {
                    num3 = k;
                    result = num1 * num2 + num3;
                    if (result <= 100) {
                        System.out.println("{" + num1 + "*" + num2 + "+" + num3 + "=" + result + "}");
                        System.out.println("{" + num3 + "+" + num1 + "*" + num2 + "=" + result + "}");
                    }
                }
            }
        }

        //1*1-1
        for (int i = 1; i < 10; i++) {
            num1 = i;
            for (int j = 1; j < 10; j++) {
                num2 = j;
                for (int k = 0; k <= num1 * num2; k++) {
                    num3 = k;
                    result = num1 * num2 - num3;
                    System.out.println("{" + num1 + "*" + num2 + "-" + num3 + "=" + result + "}");
                }
                for (int r = 0; r >= num1 * num2; r++) {
                    num4 = r;
                    result = num4 - (num1 * num2);
                    System.out.println("{" + num4 + "-" + num1 + "*" + num2 + "=" + result + "}");
                }
            }
        }
    }
}