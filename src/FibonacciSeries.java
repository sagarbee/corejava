public class FibonacciSeries {

    public static void main(String[] args) {
        System.out.println(isNumberInFibonacciSeries(12));

    }

    public static boolean isNumberInFibonacciSeries(int num){
        if (num < 0){
            return false;
        }
        int n1 =0;
        int n2 = 1;
        int res;
        for (int i = 0; true ;i++){
            res = n1+n2;
            n1 = n2;
            n2 = res;

            if(n2 > num){
                return false;
            } else if (n2 == num) {
                return true;
            }

        }
    }

    public static void fibonacciRecursion(){

    }
}
