public class tenaa {
    public static void main(String[] args) {
        Add();
    }
    public static void Add() {
        int num1, num2,result;
        for (int i = 1; i < 10; i++) {
            num1 = i; 
            for(int j=10-num1; j<10; j++){
                num2=j;
                result=num1+num2;
                System.out.println("{" + num1 + ", " + "+" + ", " + num2 + ", " + result +"}");
            }
        }
    }
}