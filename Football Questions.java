import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Football+");
        System.out.println("Labor omnia vincit");
        
        System.out.println("The Next Generation of Football");
        
        //Question 1 
        System.out.println("What is your name");
        String NAME = scanner.nextLine();
        
        // Question 2
        System.out.println("What Position do you play F,M,D,GK");
        String POSITION = scanner.nextLine();
        
        // Question 3 
        System.out.println("What is your age");
        int AGE = scanner.nextInt();
        
        //Question 4
        System.out.println("How many years of experience do you have");
        int EXP = scanner.nextInt();
        
        scanner.nextLine();
        
        //Question 5
        System.out.println("What is your favorite Football team");
        String favteam = scanner.nextLine();
        
        
        System.out.println("Welcome " +NAME);
        System.out.println("You play as a " +POSITION);
        System.out.println("You are " +AGE+ " Years old");
        System.out.println("You have been playing for " +EXP+ "Years");
        System.out.println("GOO!!! " +favteam );
        System.out.println(":)");
        



        
            
    }
}
