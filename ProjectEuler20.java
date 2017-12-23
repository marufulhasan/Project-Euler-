
package projecteuler20;
import java.math.BigInteger;


public class ProjectEuler20 {

    
    public static void main(String[] args) {
        
        BigInteger fact= BigInteger.ONE;
        
        for (int i=2; i<=100; i++){
            fact=fact.multiply(BigInteger.valueOf(i));
        }
       BigInteger sumDigit=BigInteger.ZERO;
        while (fact!=BigInteger.ZERO){
            
          sumDigit= sumDigit.add( fact.mod(BigInteger.TEN));
            fact=fact.divide(BigInteger.TEN);
                
        }
        System.out.println(sumDigit);
    }
    
}
