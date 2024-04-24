public class tenmutone {
    public static void main(String[] args) {

        int num1;
        int num2;
        int result;
        for (int i = 1; i < 10; i++) {
            num1 = i;
            for (int j = 1; j < 10; j++) {
                for (int k = 1; k < 10; k++) {
                    num2 = j + k * 10;
                    if (i * j <= 9 && i * k <= 9) {
                        result = num1 * num2;
                        System.out.println(num1 + " × " + num2 + " = " + result);
                    }
                }
            }
        }
    }
}