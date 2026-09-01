import java.util.*;
public class stackHeigth {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       int x=sc.nextInt();
       int n= sc.nextInt();
       sc.close();
      int ans=  stackheight(x,n);
      System.out.println(ans);
    }
    public static int stackheight(int x, int n)
    {
        if(n==0)
        {
            return 1;
        }
        if(x==0)
        {
            return 0;
        }
       int powxnm1= stackheight(x,n-1);
       int ans= x*powxnm1;
       return ans;
    }
    
}
