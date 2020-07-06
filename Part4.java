 
/**
 * Write a description of pert4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.io.File;
import java.lang.*;

public class Part4 {
 public String findLink(String s){
String ans = "";
String youtube = "youtube.com";
int index1 = s.toLowerCase().indexOf(youtube.toLowerCase());
    
    if(index1 != -1){
 int index2 = s.lastIndexOf("\"", index1);
    
        if(index2 != -1){
        int index3 = s.indexOf("\"", index1+11); 
        ans = s.substring(index2,index3+1);
     
}
}  
return ans;
    
   } 
public void test(){
    String link = "https://www.dukelearntoprogram.com/course2/data/manylinks.html";
    URLResource ur = new URLResource(link);
    for(String word:ur.words()){
    
    String ans = findLink(word);
    
    
     System.out.println("youtube links: "+ans);
    }
    
}

    public static void main (String[] args)
    {
     Part4 p4 = new Part4();
     p4.test();
     System.out.println("++++++++++++++++++++++++++++++++++");
        
    }


}