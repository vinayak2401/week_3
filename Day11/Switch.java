import java.util.Scanner;

class Example1 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter week number to print week day");
    int week_num = s.nextInt(); // 4    
    switch (week_num) {
      case 1: {
        System.out.println("Monday");
        break;
      }
      case 2: {
        System.out.println("Tuesday");
        break;
      }
      case 3: {
        System.out.println("Wednesday");
        break;
      }
      case 4: {
        System.out.println("Thursday");
        break;
      }
      case 5: {
        System.out.println("Friday");
        break;
      }
      case 6: {
        System.out.println("Saturday");
        break;
      }
      case 7: {
        System.out.println("Sunday");
        break;

      }
    }
  }
}