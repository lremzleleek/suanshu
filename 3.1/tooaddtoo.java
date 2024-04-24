public class tooaddtoo {
    public static void main(String[] args) {
        Add();
    }

    public static void Add() {
        int num1, num2, result;
        for (int i = 10; i < 100; i++) {
            num1 = i;
            for (int j = 10; j < 100 - num1; j++) {
                num2 = j;
                result = num1 + num2;
                System.out.println("{" + num1 * 10 + "," + "+" + "," + num2 * 10 + "," + result * 10 + "}");
            }
        }
    }
}
