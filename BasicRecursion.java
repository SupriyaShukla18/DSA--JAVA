import java.util.*;
public class BasicRecursion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        num(n);
        sc.close();
    }
    public static void num(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return;
        }
      num(n-1);
      System.out.println(n);
    }

    
}
