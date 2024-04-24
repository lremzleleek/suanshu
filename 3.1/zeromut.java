public class zeromut {
    public static void main(String[] args) {

        int num1;
        int num2;
        int result;
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j <= 9; j++) {
                num1 = (int) (j * Math.pow(10, i));
                for (int k = 0; k < 3; k++) {
                    for (int r = 1; r <= 9; r++) {
                        num2 = (int) (r * Math.pow(10, k));
                        result = (int) (num1 * num2);
                        if (result <= 1000) {
                            System.out.println(num1 + " × " + num2 + " = " + result);
                        }
                    }
                }
            }
        }
    }
}