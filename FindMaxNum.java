package MyPackage;
public class FindMaxNum
{
  public static void main(String args[])
  {
     int arr[] = {20, 90, 500, 105, 555, 0};
     int max = arr[0];
     for(int i=0; i<arr.length; i++)
     {
       if(max < arr[i])
       {
           max = arr[i]; 
        } 

     }
    System.out.print(max); 
  }
}