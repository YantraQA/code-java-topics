package _0_Assignments;

public class _4_ArrayLoopIfElse {

    public static void main(String[] args){

        int[] arr = {1,3,5,6,7,8,-1,-5,343242,232,34,456,2,4,45};

        System.out.println("-----------Print arr---------------");
        for(int i=0; i<arr.length;i++){
            System.out.println("Index: " + i + " value: " + arr[i]);
        }

        System.out.println("-----------Print Even Numbers---------------");
        //print even numbers
        for(int i=0; i<arr.length;i++){
            if (arr[i]%2==0){
                System.out.println("Even Numbers: " + arr[i]);
            }
        }

        System.out.println("-----------Print Odd Numbers---------------");
        //Odd numbers
        for(int i=0; i<arr.length;i++){
            if (arr[i]%2 != 0){
                System.out.println("Odd Numbers: " + arr[i]);
            }
        }

        System.out.println("-----------Print Max Number---------------");
        int maxNum=0;
        for(int i=0; i<arr.length;i++){
            if (arr[i] > maxNum){
                maxNum = arr[i];

            }
        }
        System.out.println("Max Number is: " + maxNum);

        System.out.println("-----------Print Minimum Number---------------");
        int minNumber=2147483647;
        for(int i=0; i<arr.length;i++){
            if (arr[i] < minNumber){
                minNumber = arr[i];
            }
        }
        System.out.println("Min Number is: " + minNumber);

    }
}
