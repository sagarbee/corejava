import java.util.Arrays;

public class SwapNumber {

    public static void main(String [] args){

        int[] a = swapTwoNumbers(10,30);
        System.out.println(Arrays.toString(a));
    }
    //Swap number without temporary variable
    public static int[] swapTwoNumbers(int num1, int num2){
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        int num[] = {num1,num2};
        return num;
    }



}
