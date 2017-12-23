
package projecteuler27;


public class ProjectEuler27 {
    
    public static boolean isPalindrome(String s){
     return s.equals(new StringBuffer(s).reverse().toString());
    }

    
    public static void main(String[] args) {
        int sum=0;
        for (int i=1;i<1000000;i++){
            if(isPalindrome(Integer.toString(i,10)) &&isPalindrome(Integer.toString(i,2))) sum+=i;
        }
     System.out.println(sum);
    }
}
