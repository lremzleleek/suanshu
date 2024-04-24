public class twesub {
    public static void main(String[] args) {
        Sub();
    }

    public static void Sub() {
        int num1, num2, result;
        for (int i = 0; i < 20; i++) {
            num1 = i + 1;
            for (int j = 0; j < num1 - 1; j++) {
                num2 = j + 1;
                result = num1 - num2;
                System.out.println("{" + num1 + ", " + "-" + ", " + num2 + ", " + result + "}");
            }
        }
    }
}