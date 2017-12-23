
package projecteuler23;
import java.util.ArrayList;
import java.util.Arrays;

public class ProjectEuler23 {

    public static boolean isAbundant (int n){
        int sumDiv=0;
        for (int i=1; i<=n/2;i++){
            if (n%i==0) sumDiv+=i;
        }
        return sumDiv>n;
    }
    
public static void main(String[] args) {
    
    ArrayList<Integer>abundants= new ArrayList<>();
        for (int i=1; i<=28123;i++){
            if (isAbundant(i)) abundants.add(i);
        }
 boolean[] canShown= new boolean [28130];
 for (int i=0; i<canShown.length;i++){
     canShown[i]=false;
 }
 
 for (int i=0; i<abundants.size();i++){
     for (int j=i; j<abundants.size(); j++){
        int temp= abundants.get(i)+abundants.get(j);
        if (temp<=28123) canShown[temp]=true;           
      }
    }
 int result23=0;
 for (int i=0;i<=28123;i++){
     if (canShown[i]==false) result23+=i;
 }
 
 System.out.println(result23);
 }    
}
