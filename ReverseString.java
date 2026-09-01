import java.util.*;
public class ReverseString {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
     String str= sc.nextLine();
     reverseString(str,str.length()-1);
     sc.close();
    }
    public static void reverseString(String str,int idx)

    {
        
        if(idx==0){
            System.out.print(str.charAt(idx));
            return;
        }
      System.out.print(str.charAt(idx));
      reverseString(str, idx-1);

    }
}
