
package projecteuler24;

import java.util.Arrays;


public class ProjectEuler24 {

   public static int[] nextPermute(int[] n){
        int i=n.length-1;
        while (n[i-1]>=n[i]) i--;
        int j=n.length-1;
        while (n[j]<=n[i-1]) j--;
        
        int temp=n[i-1];
        n[i-1]=n[j];
        n[j]=temp;
        
        j=n.length-1;
        
        while(i<j){
            temp=n[i];
            n[i]=n[j];
            n[j]=temp;
            i++;j--;
        }
        return n;
        
    }
    
    public static void main(String[] args) {
        int [] perm= {0,1,2,3,4,5,6,7,8,9};
        
      
        for (int i=1;i<1000000;i++){
            perm= nextPermute(perm);
            
        }
        
     String s="";
     for (int i=0;i<perm.length;i++){
         s+=perm[i];
         
     }
      System.out.println(s);
    }
    
}
