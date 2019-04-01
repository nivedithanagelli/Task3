import java.util.*;
class DescendingWeights{
    
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		ArrayList<Integer> l=new ArrayList<>();
		for(int i=0;i<n;i++)
		    l.add(in.nextInt());
		Collections.sort(l, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                int x=a%k;
                int y=b%k;
                if(x==y)
                    return (a>b)?1:-1;
                return (x>y)?-1:1;
            }
        });
        for(int a:l)
		  System.out.print(a+" ");  
		
    }
}
