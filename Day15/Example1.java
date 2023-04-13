import java.util.Scanner; 
public class SecondExample {
  public static void main(String[] args) {     // int arr[]= {1,2};//1 dimensional array
    int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 } };// 2 dimensional array     // arr[0][2]=10;
    // arr[1][1]=15;
    for (int i = 0; i < arr.length; i++)
      {
      for (int j = 0; j < arr[i].length; j++)     
        System.out.print(arr[i][j]+" ");       
        System.out.println();
      }
  }
}