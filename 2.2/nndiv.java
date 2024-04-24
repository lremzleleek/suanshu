public class nndiv {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {

            int num1 = i; // 生成1到9之间的随机数
            for (int j = 1; j < 10; j++) {
                int num2 = j; // 生成1到9之间的随机数
                int product = num1 * num2;
                // 输出乘法式子
                System.out.println(product + " / " + num1 + " = " + num2);
            }
        }
    }
}