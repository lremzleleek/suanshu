public class tenadd {
    public static void main(String[] args) {
        Add();
    }
    public static void Add() { 
        int num1, num2,result;
        for (int i = 0; i < 10; i++) {
            num1=i+1;
            for(int j=0;j<10-num1;j++){
            num2 = j + 1; 
            result=num1+num2;
            System.out.println("{" + num1 + "," +"+"+ "," + num2 +","+result+ "}");
            }
        }
    }
}