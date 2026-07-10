import java.util.*;
public class StackHeigthLogn {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      int x= sc.nextInt();
     int ans= printHeigth(x,n);
     System.out.println(ans);

    }
    public static int printHeigth(int x,int n)
    {
        if(n==0){
            return 1;
        }
        if(x==0)
        {
            return 0;
        } 
        int halfpow=printHeigth(x, n/2)*printHeigth(x,n/2);
if(n%2==0)
{
  return halfpow;
}
  else{
return halfpow*x;
  }

    }
    
}
