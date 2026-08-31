import java.util.*;
public class lastOccurence{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int array[]= new int[n];
        for(int i=0;i<array.length;i++)
        {
            array[i]= sc.nextInt();

        }
        int find=sc.nextInt();
        sc.close();
        int ans =occur(array,array.length-1,find);
        System.out.println(ans);

    }
    public static int occur(int array[],int idx,int find)
    {
      if(array[idx]== find)
      {
        return idx;
      }
      
        if(idx==0)
        {
            return -1;
        }
      else{
         return occur(array, idx-1, find);
        
      }
    }
}