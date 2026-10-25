public class NumberPrograms {

    public static void main(String[] args) {
        leapYear(2000);
        powerOfNumber(2,5);
        factorialOfNumber(5);
        duckNumber(12033);
        armStrongNumer(1634);
        armStrongNumerUsingBuiltIn(4);
    }

    public static void leapYear(int year){
        if((year % 4 == 0 && year%100 !=0) || year%400 == 0){
            System.out.println("Year "+year+" is Leap Year");
        }
        else {
            System.out.println("Year"+year+" is not a Leap Year");
        }
    }

    public static void powerOfNumber(int base,int raise){
        int i = 0;
        int power = 1;
        while(i<raise){
            power = power * base;
            i++;
        }
        System.out.println(power);
    }

    public static void factorialOfNumber(int num){

        int fact = 1;
        for(int i=num;i>0;i--){
            fact = fact * i;
        }
        System.out.println("Factorial of "+num+" is :: "+fact);
    }

    public static void duckNumber(int num){
        if(num < 0)
        {
            System.out.println("Not a duck number");
            return;
        }
        int rem = 0;
        while (num>0){
            rem = num % 10;
            num/=10;
            if(rem == 0) {
                break;
            }
        }
        if(num == 0){
            System.out.println("Not Duck Number");
        }else {
            System.out.println("Duck Number");
        }
    }

    public static void armStrongNumer(int num){
        int raise = countDigits(num);
        int sum = 0;
        for (int i = num; i > 0; i/=10) {
            int rem = i % 10;
            int powerOfNum  = power(rem,raise);
            sum += powerOfNum;
        }
        System.out.println("Sum of all digits with power of number of digit is :: "+sum);
        if(sum == num){
            System.out.println("Armstrong Number");
        }else {
            System.out.println("Not Armstrong Number");
        }

    }
    public static int countDigits(int num){
        int count = 0;
        while (num>0){
            int rem = num % 10;
            num/=10;
            count++;
        }

        return count;
    }
    public static int power(int base,int raise){
        int power = 1;

        for (int i = 0; i < raise; i++) {
            power = base * power;
        }
        return power;
    }

    private static void armStrongNumerUsingBuiltIn(int num) {

    int digitCount = String.valueOf(num).length();
    int sum = 0;
    for (int i = num; i > 0 ; i/=10){
        int rem  = i % 10;
        sum += Math.pow(rem,digitCount);
    }
    if(sum == num){
        System.out.println("Armstrong Number");
    }else {
        System.out.println("Not Armstrong Number");
    }
    }
}
