import java.util.Scanner;

 class MenuProgram {
    Scanner sc = new Scanner(System.in);
    int arr[] = { 23,45,67,78,45,7,90,22 };
    int number, index, temp, deleted, noOfElements = arr.length;
    int array[] = new int[100];

    public void insertElement() {
        int choice;
        System.out.println("1. Insertion at First");
        System.out.println("2. Insertion at Last");
        System.out.println("3. Insertion at Specific Location");
        System.out.println("Please Choose your option :");
        choice = sc.nextInt();
        System.out.println("Enter Number To Insert :");
        number = sc.nextInt();

        switch (choice) {
            case 1:
                insertFirst(number);
                break;
            case 2:
                insertLast(number);
                break;
            case 3:
                System.out.println("Enter Index Position ");
                index = sc.nextInt();
                insertSpecific(number, index);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    public void deleteElement() {
        int choice;
        System.out.println("1. Delete at First");
        System.out.println("2. Delete at Last");
        System.out.println("3. Delete at Specific Location");
        System.out.println("4. Delete Specific Element");
        System.out.println("Please Choose your option :");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                deleteFirst();
                break;
            case 2:
                deleteLast();
                break;
            case 3:
                System.out.println("Enter Index Position");
                index = sc.nextInt();
                deleteSpecificIndex(index);
                break;
            case 4:
                System.out.println("Enter Number to Delete :");
                number = sc.nextInt();
                deleteSpecificNumber(number);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    public void searchElement() {
        int choice;
        System.out.println("1. Search Element in Aray");
        System.out.println("2. Frequency of Element in Array");
        System.out.println("3. Duplicate Elements in Array");
        System.out.println("4. Unique Elements in Array");
        System.out.println("5. Frequency of each Element in Array");
        System.out.println("Please Choose your option :");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter Numbere to be Searched :");
                number = sc.nextInt();
                search(number, 's', 0);
                break;
            case 2:
                System.out.println("Enter Numbere to find frequency :");
                number = sc.nextInt();
                search(number, 'f', 0);
                break;
            case 3:
                duplicateElement();
                break;
            case 4:
                uniqueElement();
                break;
            case 5:
                eachElementFrequency();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    public void deleteDuplicate() {
        int choice;
        System.out.println("1. Delete first Occurrence");
        System.out.println("2. Delete last Occurrence");
        System.out.println("3. Delete all Occurrence");
        System.out.println("Please Choose your option :");
        choice = sc.nextInt();
        System.out.println("Enter Numbere :");
        number = sc.nextInt();

        switch (choice) {
            case 1:
                firstOccurrence(number);
                break;
            case 2:
                lastOccurrence(number);
                break;
            case 3:
                allOccurrence(number);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    public void sort(){
        int choice;
        System.out.println("1. Sort in ASC order (0 ... 99)");
        System.out.println("2. Sort in DESC order (99 ... 0)");
        System.out.println("Please Choose your option :");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("After sorting in ascending order");
                sortASC();
                break;
            case 2:
                System.out.println("After sorting in descending order");
                sortDESC();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    public void addElements() {
        for (int i = 0; i < arr.length; i++) {
            array[i] = arr[i];
        }
    }

    /* ---------------- Insertion Operation Methods ------------ */
    public void insertFirst(int number) {
        if (noOfElements == 0) {
            array[0] = number;
            noOfElements++;
        } else {
            for (int i = noOfElements; i > 0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = number;
            noOfElements++;
        }
        displayArray('a');
    }

    public void insertLast(int number) {
        array[noOfElements] = number;
        noOfElements++;
        displayArray('a');
    }

    public void insertSpecific(int number, int index) {
        for (int i = noOfElements; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = number;
        noOfElements++;
        displayArray('a');
    }
    /* ----------------------- END ---------------------- */

    /* ---------------- Deletion Operation Methods ------------ */
    public void deleteFirst() {
        if (noOfElements == 0) {
            System.out.println("Array is Empty");
        } else {
            for (int i = 0; i <= noOfElements; i++) {
                if (i == 0) {
                    deleted = array[i];
                    array[i] = array[i + 1];
                }
                array[i] = array[i + 1];
            }
        }
        noOfElements--;
        System.out.println(deleted + " is deleted");
        displayArray('b');
    }

    public void deleteLast() {
        if (noOfElements == 0) {
            System.out.println("Array is Empty");
        } else {
            deleted = array[noOfElements - 1];
            noOfElements--;
        }
        System.out.println(deleted + " is deleted");
        displayArray('b');
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

    public void deleteSpecificNumber(int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                deleteSpecificIndex(i);
                break;
            }
        }
    }

    public void firstOccurrence(int number) {
        index=-1;
        for(int i=0;i<noOfElements;i++){
            if(array[i]==number){
                index=i;
                break;
            }
        }
        if(index>-1){
            for(int i=index;i<noOfElements;i++){
                for(int j=i;j<noOfElements;j++){
                    if(array[i]==array[j+1]){
                        deleteSpecificIndex(i);
                        break;
                    }
                }
                break;
            }
        }else{
                System.out.println("There is no duplicate element present for "+number);
        }
    }
    public void lastOccurrence(int number){
        index=-1;
        for(int i=noOfElements;i>0;i--){
            if(array[i]==number){
                index=i;
                break;
            }
        }
        if(index>-1){
            for(int i=index;i>0;i--){
                for(int j=i;j>0;j--){
                    if(array[i]==array[j-1]){
                        deleteSpecificIndex(i);
                        break;
                    }
                }
                break;
            }
        }else{
                System.out.println("There is no duplicate element present for "+number);
        }
    }
    public void allOccurrence(int number) {
        index=-1;
        for(int i=0;i<noOfElements;i++){
            if(array[i]==number){
                index=i;
                break;
            }
        }
        if(index>-1){
            for(int i=index;i<noOfElements;i++){
                for(int j=i;j<noOfElements;j++){
                    if(array[j]==number){
                        deleteSpecificIndex(j);
                    }
                }
                break;
            }
        }else{
                System.out.println("There is no duplicate element present for "+number);
        }
    }

    /* ----------------------- END ---------------------- */

    /* ---------------- Search Operation Methods ------------ */
    public void search(int number, char d, int index) {
        int count = 0, numberIndex = -1;
        for (int i = index; i < noOfElements; i++) {
            if (d == 's') {
                if (array[i] == number) {
                    numberIndex = i;
                    break;
                }
            } else {
                if (array[i] == number) {
                    count++;
                }
            }
        }

        if (d == 'e') {
            System.out.println("The '" + number + "' repeated '" + count + "' times in array");
        } else {
            if (numberIndex > -1) {
                System.out.println("Element found at " + numberIndex + " position");
            } else if (count > 0) {
                System.out.println("The given number repeated " + count + " times in array");
            } else {
                System.out.println("given number is not prsent in Array");
            }
        }
    }

    public void duplicateElement() {
        System.out.println("Duplicate Numbers");
        int duplicate = 0;
        for (int i = 0; i < noOfElements; i++) {
            for (int j = i; j < noOfElements; j++) {
                if (array[i] == array[j + 1]) {
                    System.out.print(array[i] + " ");
                    duplicate++;
                    continue;
                }
            }
        }
        if (duplicate == 0) {
            System.out.println("There are no duplicate elements");
        }
    }

    public void uniqueElement() {
        int count = 0;
        System.out.println("Unique Numbers");
        for (int i = 0; i < noOfElements; i++) {
            for (int j = 0; j < noOfElements; j++) {
                if (array[i] == array[j]) {
                    if(i==j){
                          continue;
                    }else{
                         count++;
                    }
                }
            }
            if (count == 0) {
                System.out.print(array[i] + ", ");
            }
            count=0;
        }  
        if (count > 0) {
            System.out.println("There are no unique elements");
        }
    }

    public void eachElementFrequency() {
        System.out.println("Repeated Numbers are");
        for (int i = 0; i < noOfElements; i++) {
            search(array[i], 'e', 0);
        }
    }
    /* ----------------------- END ---------------------- */

    /* ------------------------ SORTING ------------------*/
    public void sortASC(){
        int temp=0;
        for(int i=0;i<noOfElements;i++){
            for(int j=i;j<noOfElements;j++){
                if(array[j]<array[i]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        displayArray('s');
    }
    public void sortDESC(){
        int temp=0;
        for(int i=0;i<noOfElements;i++){
            for(int j=i;j<noOfElements;j++){
                if(array[j]>array[i]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        displayArray('s');
    }
    /* ------------------------ END ------------------*/

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
        };
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        MenuProgram mp = new MenuProgram();
        int choice;
        mp.addElements();
        mp.displayArray('c');
        do {
            System.out.println("\n1. Insertion");
            System.out.println("2. Deletion");
            System.out.println("3. Search");
            System.out.println("4. Delete duplicate");
            System.out.println("5. Sort");
            System.out.println("6. Exit");
            System.out.println("Please Choose your option :");
            choice = s.nextInt();

            switch (choice) {
                
                case 1:
                    mp.insertElement();
                    break;
                case 2:
                    mp.deleteElement();
                    break;
                case 3:
                    mp.searchElement();
                    break;
                case 4:
                    mp.deleteDuplicate();
                    break;
                case 5:
                    mp.sort();
                    break;
                case 6:
                    System.out.println("Thank You");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (true);
    }
}