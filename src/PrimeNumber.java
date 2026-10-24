public class PrimeNumber {

    public static void main(String[] args) {

        int countPrime = 0;
        for (int i = 0; i < 100; i++) {

            if(isPrime(i)) {
                countPrime++;
                System.out.print(i+" ");
            }
        }
        System.out.println("\n"+countPrime);
    }

    public static boolean isPrime(int num){
       if(num<=1) return false;
       if(num<=3) return true;
       if(num%2 == 0 || num%3==0){
           return false;
       }
       for (int i = 5; i < num/i;i+=6){
           if(num%i==0 || num % (i+2) == 0){
               return false;
           }
       }
       return true;
    }

}
