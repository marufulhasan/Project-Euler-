
package projecteuler07;


public class ProjectEuler07 {
    
    public static int[] primes(int n){
        boolean[] isPrime= new boolean[n+1];
        for (int i=1; i<=n;i++){
            isPrime[i]=true;
        }
        
       for (int i=2;i<=n;i+=2){
           isPrime[i]=false;
       }
       for (int j=3; j<=i; j+=2){
           if (isPrime[j]){
               for (int k=j; k*j<=n; )
           }
       }
      
    }

    public static void main(String[] args) {
        
        
    }
    
}
