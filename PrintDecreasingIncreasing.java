import java.util.*;
public class PrintDecreasingIncreasing {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
   printDecrIncr(n);
    }
    public static void printDecrIncr(int n){

        if(n==1)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDecrIncr(n-1);
        
       // printDecrIncr(n-1);
        System.out.println(n);
        

        
    }
    
}
