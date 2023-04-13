import java.util.Scanner;

 class Delete
{
   public static void main(String[] args)
   {
      int i, j, size=10, element;
      int[] arr = {2,3,5,33,41,67,82,5,3,66};
      Scanner s=new Scanner(System.in);
      
      
      
      System.out.print("Enter the Element to Remove: ");
      element = s.nextInt();
      
      for(i=0; i<size; i++)
      {
         if(element==arr[i])
         {
            for(j=i; j<(size-1); j++)
               arr[j] = arr[j+1];
            System.out.println("\nRemoved the element successfully!");
            break;
         }
      }
      
      System.out.println("\nThe new array is: ");
      for(i=0; i<(size-1); i++)
         System.out.print(arr[i]+ " ");
   }
}