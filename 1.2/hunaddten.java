public class hunaddten {
    public static void main(String[] args) {
        Add();
    }

    public static void Add() {
        int num1, num2, result;
        for (int i = 10; i < 100; i++) {
            num1 = i;
            for (int j = 0; j < 10; j++) {
                num2 = j + 1;
                result = num1 + num2 * 10;
                if (result <= 100) {
                    System.out.println("{" + num1 + ", " + "+" + ", " + num2 * 10 + ", " + result + "}");
                }
            }
        }
    }
}