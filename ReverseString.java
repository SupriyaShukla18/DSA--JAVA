import java.util.*;
public class ReverseString {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
     String str= sc.nextLine();
     ReverseString(str,str.length()-1);
    }
    public static void ReverseString(String str,int idx)

    {
        
        if(idx==0){
            System.out.print(str.charAt(idx));
            return;
        }
      System.out.print(str.charAt(idx));
      ReverseString(str, idx-1);

    }
}
