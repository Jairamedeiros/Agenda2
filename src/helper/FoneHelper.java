
package helper;






public class FoneHelper {
    public static String formatar(String fone){
      int lenght = fone.length();
      if (lenght == 10){
          fone = "(" + fone.substring(0,2) + ") " + fone.substring(2,6) + "-" + fone.substring(6);
      }else{
          fone = "(" + fone.substring(0,2) + ") " + fone.substring(2,7) + "-" + fone.substring(7);
         
      } return fone;    
        
    } 
    
    public static String clear(String fone){
        return fone = fone.replace("(", "").replace(")","").replace("-","").replace(" ","");
        
        
        
    }
    
    
}
