import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Welcome to Anthonys wing shop, how many sauces would you like with your wings?"); 
    int wings = scan.nextInt();//asks for user imput
    int number = 1;// depending on the number of sauces you pick, the recursion will let you choose that many sauces
    chickenWings(wings, number); //calling method right here
  }
    static boolean chickenWings(int wings, int number) {
      Scanner scan = new Scanner(System.in);
      if (number <= wings) {
        System.out.println("You have ordered " + number + " sauces. "); // says how many sauces youve ordered
        System.out.println("What sauce would you like with your wings?");;
        String sauce = scan.next();
        number ++; //counts wings
        return chickenWings(wings, number);
      } else {
        System.out.println("Come and get your wings!");
        
        return false;
      }
    }
}