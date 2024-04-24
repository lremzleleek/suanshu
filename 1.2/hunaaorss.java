public class hunaaorss {
    public static void main(String[] args) {
        addadd();
        addsub();
        subadd();
        subsub();
    }

    //1+1=1+1
    public static void addadd() {
        int num1, num2, result;
        for (int i = 0; i < 100; i++) {
            num1 = i + 1;//确定第一个数

            for (int j = 0; j < 100 - num1; j++) {
                num2 = j + 1;//确定第二个数

                result = num1 + num2;

                int num3, num4, result2;
                for (int a = 0; a < 100; a++) {
                    num3 = a + 1;//确定第三个数

                    for (int b = 0; b < 100 - num3; b++) {
                        num4 = b + 1;//确定第四个数

                        result2 = num3 + num4;

                        if (result > result2) {
                            System.out.println("{" + result + "," + ">" + "," + result2 + "}");
                        } else if (result < result2) {
                            System.out.println("{" + result + "," + "<" + "," + result2 + "}");
                        } else if (result == result2) {
                            System.out.println("{" + result + "," + "=" + "," + result2 + "}");
                        }
                    }
                }
            }
        }
    }

    //1+1=1-1
    public static void addsub() {
        int num1, num2, result;
        for (int i = 0; i < 100; i++) {
            num1 = i + 1;//确定第一个数

            for (int j = 0; j < 100 - num1; j++) {
                num2 = j + 1;//确定第二个数

                result = num1 + num2;

                int num3, num4, result2;
                for (int a = 0; a < 100; a++) {
                    num3 = a + 1;//确定第三个数

                    for (int b = 0; b < num3 - 1; b++) {
                        num4 = b + 1;//确定第四个数

                        result2 = num3 - num4;

                        if (result > result2) {
                            System.out.println("{" + result + "," + ">" + "," + result2 + "}");
                        } else if (result < result2) {
                            System.out.println("{" + result + "," + "<" + "," + result2 + "}");
                        } else if (result == result2) {
                            System.out.println("{" + result + "," + "=" + "," + result2 + "}");
                        }
                    }
                }
            }
        }
    }

    //1-1=1+1
    public static void subadd() {
        int num1, num2, result;
        for (int i = 0; i < 100; i++) {
            num1 = i + 1;//确定第一个数

            for (int j = 0; j < num1 - 1; j++) {
                num2 = j + 1;//确定第二个数

                result = num1 - num2;

                int num3, num4, result2;
                for (int a = 0; a < 100; a++) {
                    num3 = a + 1;//确定第三个数

                    for (int b = 0; b < 100 - num3; b++) {
                        num4 = b + 1;//确定第四个数

                        result2 = num3 + num4;

                        if (result > result2) {
                            System.out.println("{" + result + "," + ">" + "," + result2 + "}");
                        } else if (result < result2) {
                            System.out.println("{" + result + "," + "<" + "," + result2 + "}");
                        } else if (result == result2) {
                            System.out.println("{" + result + "," + "=" + "," + result2 + "}");
                        }
                    }
                }
            }
        }
    }

    //1-1=1-1
    public static void subsub() {
        int num1, num2, result;
        for (int i = 0; i < 100; i++) {
            num1 = i + 1;//确定第一个数

            for (int j = 0; j < num1 - 1; j++) {
                num2 = j + 1;//确定第二个数

                result = num1 - num2;

                int num3, num4, result2;
                for (int a = 0; a < 100; a++) {
                    num3 = a + 1;//确定第三个数

                    for (int b = 0; b < num3 - 1; b++) {
                        num4 = b + 1;//确定第四个数

                        result2 = num3 - num4;

                        if (result > result2) {
                            System.out.println("{" + result + "," + ">" + "," + result2 + "}");
                        } else if (result < result2) {
                            System.out.println("{" + result + "," + "<" + "," + result2 + "}");
                        } else if (result == result2) {
                            System.out.println("{" + result + "," + "=" + "," + result2 + "}");
                        }
                    }
                }
            }
        }
    }
}