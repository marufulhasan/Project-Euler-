
package projecteuler26;

import java.util.HashMap;
import java.util.Map;


public class ProjectEuler26 {
    
    public static int numDigit(int d){
    int count=0; int num=1;
    Map<Integer,Integer>digit=new HashMap<>();
    while (true){
        if (digit.containsKey(num)) return count-digit.get(num);
        else {digit.put(num, count);count++;num=num*10%d;}
      }
    }

    public static void main(String[] args) {
        int cycle=0; int num=0;
        
        for (int i=1;i<=1000;i++){
      
     int temp= numDigit(i);
     if (temp>cycle) {cycle=temp; num=i;}
        
    }
        System.out.println(num);
  }  
}
