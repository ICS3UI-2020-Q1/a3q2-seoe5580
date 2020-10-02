import java.util.Scanner;
/**
 * This program lets you identify which animal it is
 * @author Eric Seo
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // Asks the user if it has feathers
    System.out.println("Does the animal have feathers? (yes/no)");
    
    // Stores the answer from the user
    String featherAnswer = input.nextLine();

    // Continues on with the answer yes on feathers
    if (featherAnswer.equals("yes")){
      // Asks the user if it swims
      System.out.println("Does the animal swim?");
      // Stroes the answer from the user
      String swimAnswer = input.nextLine();

      // tells the user the answer
      if(swimAnswer.equals("yes")){
        System.out.println("This is a duck");
      }else if(swimAnswer.equals("no")){
        System.out.println("This is a hen");
      }
    }else if(featherAnswer.equals("no")){
      // Asks the user if it has legs
      System.out.println("Does the animal have legs?");
      String legAnswer = input.nextLine();

      // Tells the user the answer
      if(legAnswer.equals("yes")){
        System.out.println("This is a lizard");
      }else if(legAnswer.equals("no")){
        System.out.println("This is a snake");
      }
    }

    
  }
}
