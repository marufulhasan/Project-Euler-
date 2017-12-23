
package projecteuler21;

public class ProjectEuler21 {
     
    public static boolean isAmicable (int n){
        int sum1=0; int sum2=0;
        
       for (int i=1; i<=n/2;i++){
            if (n%i==0) sum1+=i;
        }
    for (int i=1; i<=sum1/2;i++){
            if (sum1%i==0) sum2+=i;
        }
               
      return (n==sum2 && n!=sum1);
    }
    public static void main(String[] args) {
        
    int result21=0;
        for (int i=1;i<=10000;i++ ){
            if (isAmicable(i)) result21+=i;
        }
   System.out.println(result21);
}
}
