public class T6 {
    public static void main(String[] args) {
        //Write a java program to check whether a given number is prime or not?
     int number=18;
     boolean isPrime=true;
      if (number<=1){
         isPrime=false;
        }else{
         for (int i = 2; i <=number/2; i++) {
         if (number%i==0){
            isPrime=false;
            break;
        }
    }
}
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }


    }

