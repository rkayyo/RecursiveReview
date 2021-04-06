public class RTriangle{
    
   public static void main (String[] args){
        System.out.print(triangle(5));
        System.out.println("");
        reverseTriangle(7);
    }
    
    public static String triangle(int n) {
        if (n == 0) return "";
        printStars(n);
        return triangle(n-1);
    }
    
    public static String reverseTriangle(int n) {
        if (n == 0) return "";
        String line = reverseTriangle(n-1);
        line += "*";
        System.out.println(line);
        return line;
    }
    
    public static void printStars(int n) {
        for (int i = 0; i < n; i++){ 
            System.out.print("*");
        }
        System.out.println("");
    }
      
   }

    

    
    
    
    
    
    
    
    
    
