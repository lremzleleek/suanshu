public class hunmutandivkuohao {
    public static void main(String[] args) {

        // 九九乘法表
        int[][] ninenine = new int[9][9];
        int[] nine=new int[45];
        int a=0;
        for (int i = 0; i < 9; i++) {
;            for (int j = i; j <9; j++) {
                ninenine[i][j] = (i + 1) * (j + 1);
                nine[a]= (i + 1) * (j + 1);
                a++;
            }
        }
        int x,y,z;
        
        //x/(y*z)=result
        for(int i=0;i<45;i++){
            x=nine[i];
            for(int j=0;j<9;j++){
                y=j+1;
                for(int k=0;k<9;k++){
                    z=k+1;
                    if (x >= (y*z) && y*z<=9 && x%(y*z)==0) {
                        int result=x/y/z;
                        System.out.print(x +"/("+ y +"* "+ z +")="+result+'\n');//1*(56/ 8)
                    }
                }
            }
        }
        
        //x*(y/z)=result
        for(int i=0;i<9;i++){
            x=i+1;
            for(int j=0;j<45;j++){
                y=nine[j];
                for(int k=0;k<9;k++){
                    z=k+1;
                    if (y%z==0&&(y/z)<=9) {
                        int result=x*y/z;
                        System.out.print(x +"*("+ y +"/ "+ z +")="+result+'\n');//9*(21/ 7)
                    }
                }
            }
        }
    }
}
