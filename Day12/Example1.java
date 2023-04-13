class Add{
  public static void main(String args[]){
    int arr[]={23,78,4,220,56,3};
    for(int i=0;i<arr.length;i++)
      {
        if(arr[i]%2==0){
          arr[i]=arr[i]+5;
            System.out.println(arr[i]);
      
        }
        else{
          arr[i]=arr[i]-5;
            System.out.println(arr[i]);
        }
      }
    
  }
}