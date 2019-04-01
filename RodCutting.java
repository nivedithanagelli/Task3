import java.util.*;
public class RodCutting{
    public static int specialrod(int y){
        int c=0;
        while(y>0){
            y--;
            y=y/2;
            c++;
        }
       return c;
    }
    public static void main(String args[] ) throws Exception {
   Scanner s=new Scanner(System.in);
   int y,z;
   z=s.nextInt();
   while(z>0){
       y=s.nextInt();
       System.out.println(specialrod(y)-1);
       z--;
   }
}
 
}
