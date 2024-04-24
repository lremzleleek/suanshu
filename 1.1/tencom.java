public class tencom {
    public static void main(String[] args) {
        int num1;
        int num2;
        for (int i = 0; i <10; i++) {
            num1=i+1;
            for(int j=0;j<10;j++){
                num2=j+1;
                char symbol;
                if (num1 > num2) {
                    symbol = '>';
                } 
                else if (num1 == num2) {
                    symbol = '=';
                } 
                else {
                    symbol = '<';
                }
                System.out.println("{" + num1 + ", " + symbol + ", " + num2 + "}");
            }  
        }
    }
}