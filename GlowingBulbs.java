import java.util.*;
public class GlowingBulbs{
    static List<Integer> switches = new ArrayList<>( 12 );
 
    public static void main( String[] args ) {
        Scanner sc = new Scanner( System.in );
        int t = sc.nextInt();
        List<Integer> result = new ArrayList<>();
 
        long a = 0;
 
        while (t > 0) {
            switches.clear();
            result.clear();
            sc.nextLine();
            String S = sc.nextLine();
            long k = sc.nextLong();
            for(int i = 0; i < S.length(); i++) {
                if(S.charAt(i) == '1')
                    switches.add(i + 1);
            }
 
            long l = 1;
            long h = 1000000000000000L;
            long m = 0;
            while (l <= h) {
                m = (l + h) >> 1;
                if(answer(m) >= k){
                    a = m;
                    h = m - 1;
 
                }       
                else  l = m + 1;
            }
 
            System.out.println(a);
            t -= 1;
        }
    }
 
    private static long answer(long m) {
        int primes = switches.size();
        long r = 0;
        for(int i = 1; i < (1 << primes); i++) {
            long pr = 1;
            int sign = -1 ;
            for(int j = 0; j < primes; j++) {
                if(((i>>j) & 1) == 1){
                    pr = pr * switches.get(j);
                    sign *= -1;
                }
            }
            r += sign*(m/pr);
        }
        return r;
    }
}
