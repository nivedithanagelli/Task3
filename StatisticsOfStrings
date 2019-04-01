
 import java.util.Scanner;
class StatisticsOfStrings {
    int array[]=new int[25];
	public int solve()
	{
		long p=1;
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<25;i++)
			 array[i]=0;
		int n = scanner.nextInt();
		int ans=0;
		int power=(int) (Math.pow(10, 5)+7);
		int a = scanner.nextInt();
		power = scanner.nextInt();	
		for(int i=1;i<n;i++){
			for (long j=1,s; j<(1<<(n-i)); j++) { s=-1;
			    for (int k=0; k<n; k++) 
			        array[k]=k;
			    for (int k=1; k<=n-i; k++){ 
            	 if((j&(1<<(k-1)))>0){
            		 s=-s;
            		 for (int l=0; l<i; l++){ 
            			 if (find(l)!=find(k+l)){
            				 array[find(k+l)]=find(l);
            	    }
            		 }
            	  }
                }
			   
			    if (s<0) 
			        s+=power;
                for (int k=0; k<n; k++)
                    if (find(k)==k) { s=p*(s*a)%power;}
                        ans=(int) ((ans+s)%power);
            }
			
			
		}
		return ans;
	}
	
    int find(int x) {
		return array[x]==x? x : (array[x] = find(array[x]));
	}
	public static void main(String[] args) {
		System.out.println(new StatisticsOfStrings().solve());
		}
} 
