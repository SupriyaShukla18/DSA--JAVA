import java.util.*;
public class Max_of_Array {
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int [] array= new int[n];
        for(int i=0;i<array.length;i++)
        {
            array[i]=sc.nextInt();
        }
        int larger=0;
        
       int ele= max(array,1,larger);
       System.out.println(ele);

    }
    public static int max(int [] array,int idx,int larger)
    {
       
        if(idx==array.length-1)
        {
            return array[larger];
           
        }
        if(array[larger]<array[idx])
        {
            larger=idx;
        
        }
         return max(array, idx+1,larger);
    
    }
}
