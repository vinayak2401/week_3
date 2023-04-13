import java.util.Scanner;

class Array {
  Scanner s = new Scanner(System.in);
  int arr[] = { 23, 45, 67, 78, 45, 7, 90, 22 };
  int number, index, temp, deleted, noOfElements = arr.length;
  int array[] = new int[100];

  public void deleteDuplicate() {

    System.out.println("1.Delete first occurence");
    System.out.println("2.Delete last occurence");
    System.out.println("3.Delete all occurence");
    System.out.println("Choose your option");
    int choice = s.nextInt();
    System.out.println("Enter number");
    number = s.nextInt();
    switch (choice) {
      case 1: {
        firstOccurence(number);
        break;
      }
      case 2: {
        lastOccurence(number);
        break;
      }
      case 3: {
        allOccurence(number);
        break;
      }
      default: {
        System.out.println("Invalid option");
      }
    }
  }

  public void firstOccurence(int number) {
    index = -1;
    for (int i = 0; i < noOfElements; i++) {
      if (array[i] == number) {
        index = i;
        break;
      }
    }
    if (index > -1) {
      for (int i = index; i < noOfElements; i++) {
        for (int j = i; j < noOfElements; j++) {
          if (array[i] == array[j + 1]) {
            deleteSpecificIndex(i);
            break;
          }
        }
        break;
      }
    } else {
      System.out.println("There is no duplicate element present for " + number);
    }
  }

  public void lastOccurence(int number) {
    index = -1;
    for (int i = noOfElements; i > 0; i--) {
      if (array[i] == number) {
        index = i;
        break;
      }
    }
    if (index > -1) {
      for (int i = index; i > 0; i--) {
        for (int j = i; j > 0; j--) {
          if (array[i] == array[j - 1]) {
            deleteSpecificIndex(i);
            break;
          }
        }
        break;
      }
    } else {
      System.out.println("There is no duplicate element present for " + number);
    }
  }

  public void allOccurence(int number) {
    index = -1;
    for (int i = 0; i < noOfElements; i++) {
      if (array[i] == number) {
        index = i;
        break;
      }
    }
    if (index > -1) {
      for (int i = index; i < noOfElements; i++) {
        for (int j = i; j < noOfElements; j++) {
          if (array[j] == number) {
            deleteSpecificIndex(j);
          }
        }
        break;
      }
    } else {
      System.out.println("There is no duplicate element present for " + number);
    }
  }

  public void deleteSpecificIndex(int index) {
    for (int i = index; i < noOfElements; i++) {
      if (i == index) {
        deleted = array[i];
        array[i] = array[i + 1];
      }
      array[i] = array[i + 1];
    }
    noOfElements--;
    displayArray('b');
  }

  public void displayArray(char c) {
    if (c == 'a') {
      System.out.println("Array After Insertion Operation");
    } else if (c == 'b') {
      System.out.println("Array After Deletion Operation");
    } else {
      System.out.println("Array elements are");
    }
    System.out.print("[ ");
    for (int i = 0; i < noOfElements; i++) {
      System.out.print(array[i] + ", ");
    }
    ;
    System.out.println("]");
  }

  public void addElements() {
    for (int i = 0; i < arr.length; i++) {
      array[i] = arr[i];
    }
  }

  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    Array obj=new Array();
    obj.addElements();
    obj.displayArray('c');
    int choice;
    do{
      System.out.println("1. Delete duplicate");
      System.out.println("0. Exit");
            System.out.println("Please Choose your option :");
            choice = s.nextInt();
      switch (choice) {
                
                case 1:{
                    obj.deleteDuplicate();
                    break;
                }
                case 0:{
                    System.out.println("Thank you");
                    break;
                }
    }
    }while(true);
  }
}
