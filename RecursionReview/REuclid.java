
public class REuclid
{
   public static void Main(String[] args){
       System.out.println(GCF(252,105));
    }
    
    public  static int GCF(int a, int b){
        if(a == b) return a;
        
        int larger = Math.max(a,b);
        int smaller = Math.min(a,b);
        
        if(larger != smaller){
         return GCF(smaller, larger-=smaller);   
        }else{
         return larger;   
        }
        
        
        
        
    }
    
    
}
