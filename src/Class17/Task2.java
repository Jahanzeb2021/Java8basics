package Class17;

public class Task2 {
    /*

     */

    boolean isPrime(int number){
      boolean isPrime=true;
      for( int i = 2; i<number/2; i++){
          if(number%i==0){
              isPrime=false;
              break;

          }
      }
      return isPrime;
    }
}
