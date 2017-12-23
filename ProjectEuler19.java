
package projecteuler19;

public class ProjectEuler19 {
    
    public static int day( int q, int m, int y){
       
        int k= y%100;
        int j=y/100;
        int temp= (q+((13*(m+1))/5)+k+(k/4)+ (j/4)+5*j)%7;
        return temp;
        
     
    }

    
    public static void main(String[] args) {
       
  int num=0;
  for (int y=1901; y<=2000;y++){
      for (int m=3;m<=14;m++ ){  // zeller congruence month custom, please go ahead and normalize to 1 to 12
          if (day(1,m,y)==1) num++;
      }
  }
    
  System.out.println(num);
        
    }
    
}
