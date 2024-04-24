public class fivezero {
    public static void main(String[] args) {
        Add();
        Sub();
    }
    public static void Add() { 
        int num1, num2,result;
        for (int i = 0; i < 5; i++) {
            num1=i+1;
            num2 =0; 
            result=num1+num2;
            System.out.println("{" + num1 + "," +"+"+ "," + num2 +","+result+ "}");
        }
    }
    public static void Sub() {
        int num1, num2, result;
        for (int i = 0; i < 5; i++) { 
            num1=i+1;
            num2=0;
            result = num1 - num2;
            System.out.println("{" + num1 + "," + "-" + "," + num2 + "," + result +"}");
        }
    }
}