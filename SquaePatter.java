import java.util.*; 
public class Solution {


	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int i=1,p=1;
        if(n>=0 && n<=50)
        {
        while(i<=n)
        {
            int j=1;
            p=i;
            while(j<=i)
            {
              
                
                System.out.print(p);
                
                p--;
                j++;
            }
            
            
            i++;
            System.out.println();
        }
		
	}
    }

}
