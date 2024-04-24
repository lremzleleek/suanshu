public class thoaddtwo {
    public static void main(String[] args) {
        Add();
    }
 
    public static void Add() {
        int num1, num2, num3, num4, num5, num6, num7, num8, result;
        for (int a = 1; a < 10; a++) {
            num1 = a;
            for (int b = 1; b < 10; b++) {
                num2 = b;
                for (int c = 0; c < 10; c++) {
                    num3 = c;
                    for (int d = 10 - num3; d < 10; d++) {
                        num4 = d;
                        for (int e = 0; e < 10; e++) {
                            num5 = e;
                            for (int f = 10 - num4; f < 10; f++) {
                                num6 = f;
                                num7 = num1 * 100 + num3 * 10 + num5;
                                num8 = num2 * 100 + num4 * 10 + num6;
                                result = num7 + num8;
                                if (result < 1000) {
                                    System.out.println("{" + num7 + "," + "+" + "," + num8 + "," + result + "}");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}