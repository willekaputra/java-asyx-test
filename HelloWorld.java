//*******************************************************************
// Welcome to CompileJava!
// If you experience any issues, please contact us ('More Info')  -->
//*******************************************************************

import java.lang.Math; // headers MUST be above the first class

// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    System.out.println("Sum result : "+sum(5,4));
    System.out.println("Multiply result : "+multiply(5,4));
    System.out.println("Prime number result : "+findPrimeNumber(4));
    printFibonacci(4);
  }

  private static Integer sum(int x, int y) {
  	return x+y;  
  }
  
  private static Integer multiply(int x, int y) {
  	return x*y;  
  }
  
  private static String findPrimeNumber(int x) {
    String prime = "";
    int count = 2;
    int num = 0;
    while(num < x) {
      if(checkPrime(count)) {
       	prime += count + ",";
        num++;
      }
      count++;
    }
    return prime.substring(0, prime.length() - 1);
  }
  
  private static void printFibonacci(int n) {
    int x = 0;
    int y = 1;
    int z = 0;
    System.out.print(" "+0);
    System.out.print(" "+0);
    for(int i = 2; i < n; i++) {
      z = x+y;
      System.out.print(" "+z);
      x = y;
      y = z;
    }
  }
  
  private static boolean checkPrime(int n){  
    int i,m=0,flag=0;      
    m=n/2;      
    if(n==0||n==1){  
     return false;      
    }else{  
     for(i=2;i<=m;i++){      
      if(n%i==0){      
       return false;      
      }      
     }      
     return true;  
    }//end of else  
  }    
}

