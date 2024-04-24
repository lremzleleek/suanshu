public class hunaddorsub {
    public static void main(String[] args) {
        Add();
        Sub();
    }

    public static void Add() {
        int num1, num2, result;
        for (int i = 0; i < 10; i++) {
            num1 = i + 1;
            for (int j = 0; j < 10 - num1; j++) {
                num2 = j + 1;
                result = num1 + num2;
                System.out.println("{" + num1 * 10 + "," + "+" + "," + num2 * 10 + "," + result * 10 + "}");
            }
        }
    }

    public static void Sub() {
        int num1, num2, result;
        for (int i = 0; i < 10; i++) {
            num1 = i + 1;
            for (int j = 0; j < num1 - 1; j++) {
                num2 = j + 1;
                result = num1 - num2;
                System.out.println("{" + num1 * 10 + ", " + "-" + ", " + num2 * 10 + ", " + result * 10 + "}");
            }
        }
    }
}