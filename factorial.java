import java.util.*;
public class factorial {
    public static void main(String[] args)
 {
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int print=printFacto(n);
    System.out.println(print);
    sc.close();

 }
 public static int printFacto(int n){
if(n==1||n==0)
{
    return 1;
   }
   int facto=printFacto(n-1);
   return n*facto;


 }
 

 }    

