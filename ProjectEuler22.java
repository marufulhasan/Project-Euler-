
package projecteuler22;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ProjectEuler22 {
    
    public static int nameScore(String name){
        String s="0ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int result =0;
        for (int i=0;i<name.length();i++){
            result+=s.indexOf(name.charAt(i));
        }
        return result;
    }

    
        public static void main(String[] args) throws FileNotFoundException {
        File file=new File("C:\\Users\\maruf\\Desktop\\eulerDocs\\p022_names.txt");
        Scanner sc=new Scanner(file).useDelimiter("[\",]+");          
        ArrayList<String>names=new ArrayList<>();
            
       while (sc.hasNext()){
           names.add(sc.next());
       }
       Collections.sort(names);
       
       int sum=0;
       
       for (int i=0; i<names.size();i++){ 
               sum+=nameScore(names.get(i))*(i+1);            
       } 
      System.out.println(sum);
   }

}
