package _0_Assignments;

public class Calculator {

    //Attributes/ instance variables
    int var1 = 0;
    int var2;
    int var3;
    int var4;
    int var5;

    int[] arr;
    public Calculator(){

    }
    public Calculator(int[] arr){
        this.arr = arr;
    }

    //Constructor
    public Calculator(int var1, int var2, int var3, int var4, int var5){
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
        this.var4 = var4;
        this.var5 = var5;
    }
    //methods
    public int add(){
        int result = 0;
        result = var1+var2+var3+var4+var5;
        return result;
    }

    public int addArray(){
        int result = 0;
        //{2,3,5,6,7,8};
        //result = arr[0]+arr[1]+arr[2]+arr[3]+arr[4];

        for(int i=0;i<arr.length;i++){
            result = arr[i] + result;
        }


        return result;
    }

}
