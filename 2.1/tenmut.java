public class tenmut {
    public static void main(String[] args) {

        int num1;
        int num2;
        int result;
        for (int i = 1; i < 10; i++) {
            num1 = i;
            for (int j = 1; j < 10; j++) {
                num2 = j;
                result = num1 * num2;
                System.out.println(num1 + " × " + num2 + " = " + result);
            }
        }

    }
}