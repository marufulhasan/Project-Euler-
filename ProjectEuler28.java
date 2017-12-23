
package projecteuler28;


public class ProjectEuler28 {

   
    public static void main(String[] args) {
       
        // right top corner is (2n+1)^2, going counter clockwise (2n+1)^-2n and so on..
        //so total 4 corner will be add up to 4*n*n-6*n+6
        int sum=1;// let's start with 2nd spiral, start with 1
       
        for (int i=3;i<=1001;i+=2){
                                                  
        sum+= 4*i*i-6*i+6;
    }
    System.out.println(sum);
    } 
}
