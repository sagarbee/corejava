import java.util.Arrays;

public class SecondHighestNumber {
    public static void main(String[] args) {

        int [] numArray1 = {1,5,3,9,0,6,4,2,34,57,323,22,1,8};
        int[] numArray2 = {5, 5, 4, 3, 2, 1};
        secondHighestInArray(numArray1);
        secHighest(numArray2);

    }

    public static void secondHighestInArray(int [] numArray){

        int highest = 0;
        int secHighest = 0;

        for(int i=0;i<numArray.length-1;i++){

            if(numArray[i] < numArray[i+1]){
                if(highest<numArray[i+1]){
                    highest = numArray[i+1];
                }
                else if(secHighest<numArray[i]){
                    secHighest = numArray[i];
                }
            }

        }
        System.out.println("Second Highest ::: "+secHighest);
    }

    public static void secHighest(int [] arr){
        int highest = Integer.MIN_VALUE;
        int secHighest = Integer.MIN_VALUE;
        if(arr == null || arr.length<2){
            System.out.println("Array must have atleat 2 elements");
        }
        for (int num : arr){
            if(num > highest){
                secHighest = highest;
                highest = num;
            }
            if(num > secHighest && num != highest){
                secHighest = num;
            }
        }
        System.out.println("Second Highest ::: "+ secHighest);
    }
}
