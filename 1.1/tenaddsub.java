public class tenaddsub {
    public static void main(String[] args) {
        int num1, num2, num3, result;

        //1+1+1
        for (int i = 0; i <= 10; i++) {
            num1 = i;
            for (int j = 0; j <= 10 - num1; j++) {
                num2 = j;
                for (int k = 0; k <= 10 - num1 - num2; k++) {
                    num3 = k;
                    result = num1 + num2 + num3;
                    //if (result<=10) {
                    System.out.println("{" + num1 + "+" + num2 + "+" + num3 + "=" + result + "}");
                    //}
                }
            }
        }
        //1+1-1
        for (int i = 0; i <= 10; i++) {
            num1 = i;
            for (int j = 0; j <= 10 - num1; j++) {
                num2 = j;
                for (int k = 0; k <= num1 + num2; k++) {
                    num3 = k;
                    result = num1 + num2 - num3;
                    System.out.println("{" + num1 + "+" + num2 + "-" + num3 + "=" + result + "}");
                }
            }
        }
        //1-1+1
        for (int i = 0; i <= 10; i++) {
            num1 = i;
            for (int j = 0; j <= num1; j++) {
                num2 = j;
                for (int k = 0; k <= 10 - num1 + num2; k++) {
                    num3 = k;
                    result = num1 - num2 + num3;
                    System.out.println("{" + num1 + "-" + num2 + "+" + num3 + "=" + result + "}");
                }
            }
        }
        //1-1-1
        for (int i = 0; i <= 10; i++) {
            num1 = i;
            for (int j = 0; j <= num1; j++) {
                num2 = j;
                for (int k = 0; k <= num1 - num2; k++) {
                    num3 = k;
                    result = num1 - num2 - num3;
                    System.out.println("{" + num1 + "-" + num2 + "-" + num3 + "=" + result + "}");
                }
            }
        }
    }
}