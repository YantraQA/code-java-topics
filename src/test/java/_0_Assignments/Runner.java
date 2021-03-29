package _0_Assignments;

public class Runner {

    public static void main(String[] args){


        Calculator calc = new Calculator(2,3,5,6,7);
        System.out.println(calc.add());

        int[] arr1 = {2,3};
        Calculator calc1 = new Calculator(arr1);
        calc1.addArray();

        int[] arr2 = {2,3,5,6,7,8};
        Calculator calc2 = new Calculator(arr2);
        calc2.addArray();

    }
}
