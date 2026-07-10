import java.util.*;

public class SumOfFirst_nNatural_no {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int i=1;
        int n= sc.nextInt();
        int sumof=0;
        sum(i,n,sumof);
    }
    public static void sum(int i,int n,int sumof)
    {
    if(i==n)
    {
        sumof+=i;
        System.out.println(sumof);
       return;

    }

 sumof+=i;


 sum(i+1,n,sumof);
 

    }
    
}
