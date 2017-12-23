
package projecteuler25;
import java.math.BigInteger;


public class ProjectEuler25 {

public static int dig(BigInteger n) {
     String s=n.toString();
     return s.length();
 } 
  public static void main(String[] args) {
       
        BigInteger F1= BigInteger.ONE;
        BigInteger F2= BigInteger.ONE;
        Integer result25=2;
   while (true)  {
       BigInteger F3= F1.add(F2);
       ++result25;
       if (dig(F3)==1000) break;
       F1=F2;F2=F3;
   }
   System.out.println(result25);
  }
    
}

