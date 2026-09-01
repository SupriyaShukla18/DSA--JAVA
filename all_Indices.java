import java.util.*;

public class all_Indices {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int array[]= new int[n];

        for(int i=0;i<n;i++)
        {
            array[i]= sc.nextInt();
        }
        
        int target= sc.nextInt();
        all(array,0,target,0);

    }

    public static int []all(int [] array,int idx,int target,int fsf){
    //first we while traversing forward to backward we will count
    //  the number of target element present in the array and
    //  when coming from  upward to downward as in the stack do that 
    //  traversing from backward to forward we will put the length of
    //  that target as the length of the array and then add the element into array
    //fof=found so far
    
         if(idx==array.length){
            return new int[fsf];
         }
         
          
         if(array[idx]==target)
        {
          int [] iarr= all(array, idx+1, target, fsf+1);
          iarr[fsf]=idx;
          return iarr;
        }else{
            int [] iarr=all(array, idx+1, target, fsf);
            return iarr;
        }

    
       
       
       
    }
    
}
