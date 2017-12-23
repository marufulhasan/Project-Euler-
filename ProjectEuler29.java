
package projecteuler29;
import java.util.HashSet;
import java.util.Set;
import java.math.BigInteger;



public class ProjectEuler29 {

    
    public static void main(String[] args) {
      
        Set<BigInteger>n= new HashSet<>();
        
        for (int i=2;i<=100;i++){
            for (int j=2;j<=100;j++){
                n.add(BigInteger.valueOf(i).pow(j));
                                       
            }
        }
        
        System.out.println(n.size());
               
             
    }
    
}
