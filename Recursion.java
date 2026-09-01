import java.util.*;
public class Recursion{
    public static void main(String [] main){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        printnum(n);
        sc.close();
    }
    public static void printnum(int n){
     if(n==0){
        return;
     }
     System.out.println(n);

        printnum(n-1);

    }
}
