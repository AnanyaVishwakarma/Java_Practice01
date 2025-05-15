public class primeNumber {
public boolean isPrime(int num){
  if(num <= 1) return false; 
  for(int i = 2; i <= num/2; i++){
      if (num % i == 0) {
          return false;
          }
  }
    return true;
}    
  
    public static void main(String[] args) {
       int numberToCheck = 29;
    }
}
