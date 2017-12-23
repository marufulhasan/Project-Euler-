
package projecteuler30;


public class ProjectEuler30 {
    public static boolean fifthPower(int n){
        int sum=0;
        int nStore=n;
        while (n>0){
            sum+=Math.pow(n%10, 5);
            n/=10;
        }
        
        return nStore==sum;   
    }
   
    public static void main(String[] args) {
        // highest we need to check is 6*95 = 354294
      int sumFifth=0;
      for (int i=2;i<=354294;i++){
          if (fifthPower(i)) sumFifth+=i;
      }
      System.out.println(sumFifth);
    }
    
}
