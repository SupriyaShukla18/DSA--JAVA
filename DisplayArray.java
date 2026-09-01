import java.util.*;
public class DisplayArray{
public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int [] array=new int [n];
    for(int i=0;i<array.length;i++)
    {
      array[i]=sc.nextInt();

    }
    sc.close();
    display(array,array.length-1);

}
public static void display( int [] array ,int idx)
{
    if(idx==0)
    {
        System.out.println(array[idx]);
        return;
    }
  
  display(array,idx-1);
  System.out.print(array[idx]);
}

}