class Finding {   
  public static void main(String args[]){     
    int arr[]={23,45,12,90,55,33,10,24,78,45};       
    int max=0,secondMax=0,min=0;        
    max=arr[0];   // 23       
    min=arr[0];   // 23      
    for(int i=1;i<arr.length;i++){        
      if(max<arr[i]){    // 90<78          
        secondMax=max;    //secondmax=78          
        max=arr[i];      // max=90        
      }        
      else if(secondMax<arr[i]){  // 55<78          
        secondMax=arr[i];            //55        
      }         
      if(min>arr[i]){          
        min=arr[i];        
      }              
    }     
    System.out.println("Max value: "+max);        
    System.out.println("Second Max value: "+secondMax);            
    System.out.println("Min  value: "+min);           
  }
}