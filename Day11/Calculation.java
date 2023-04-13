import java.util.Scanner;

class Calculation {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter first number");
    int fnum = s.nextInt();
    System.out.println("Enter second number");
    int snum = s.nextInt();
    System.out.println("Enter the operator");
    char op = s.next().charAt(0);
    switch (op) {
      case '+': {
        System.out.println(fnum + snum);
        break;
      }
      case '-': {
        System.out.println(fnum - snum);
        break;
      }
      case '*': {
        System.out.println(fnum * snum);
        break;
      }
      case '/': {
        System.out.println(fnum / snum);
        break;
      }
      default: {
        System.out.println("Invalid");
        break;
      }
    }
  }
}