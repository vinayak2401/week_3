class GivenArray { 
  public static void main(String args[]){ 
    int arr[]={23,45,12,90,55,33,10,24,78,45};
    int evencount=0,oddcount=0,evensum=0,oddsum=0,sum=0; 
    for(int i=0;i<arr.length;i++){ 
      if(arr[i]%2==0){
        evencount++;
        evensum=evensum+arr[i];
      }
      else{
        
      
        oddcount++;
        oddsum=oddsum+arr[i];
      }
      sum=sum+arr[i];
    }
    System.out.println("Number of even values: "+evencount); 
    System.out.println("Number of odd values: "+oddcount);
    System.out.println("Sum of even values: "+evensum);
    System.out.println("sum of odd values: "+oddsum);
    System.out.println("Sum of all the values: "+sum);
  }
}