 import java.util.*;
public class revreseOfarray {
   


    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int array[]=new int[n];
    for(int i=0;i<=array.length-1;i++)
    {
     array[i]= sc.nextInt();

     }
      reverse(array,0,array.length-1);
      for( int value:array)
      {
        System.out.print(value);
      }
    

    }
    public static void reverse(int array[],int left,int right){
     if(left>=right){
      return;
     }
      int temp=array[left];
      array[left]=array[right];
      array[right]=temp;

        reverse(array, left+1, right-1);
    }
    }

    

