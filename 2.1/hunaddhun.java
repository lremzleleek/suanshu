public class hunaddhun {
    public static void main(String[] args) {
        Add();
    }

    public static void Add() {
        int num1, num2, result;
        for (int i = 0; i < 100; i++) {
            num1 = i + 1;
            for (int j = 0; j < 100 - num1; j++) {
                num2 = j + 1;
                result = num1 + num2;
                if (result <= 100) {
                    System.out.println("{" + num1 + "," + "+" + "," + num2 + "," + result + "}");
                }
            }
        }
    }
}