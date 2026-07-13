import java.util.*;
public class FristOccurence {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= sc.nextInt();

        }
        int target=sc.nextInt();
        int idx =0;
       int ans= FirstOccur(arr, target,idx);
       System.out.println(ans);
        
    }
    public static int FirstOccur(int [] arr, int target,int idx){
    
        if(idx==arr.length){
       return -1;
            }
        
      if(arr[idx]==target){
        
     return idx;
      }
      
      return FirstOccur(arr, target, idx+1);
      

    }
}
