import java.util.Scanner;

public class PrintGrade {
    public static void main(String[] args)
    {
        //Variables
        Scanner kybd = new Scanner(System.in);
        String userInput = "y";
        int score = 0, grade = 0;

        //Loop
        while(userInput.equals("y")) {
            System.out.print("Enter an exam score: ");
            score = kybd.nextInt();

            //Giving letter grade based on numerical score
            if (score >= 97)
                System.out.print("You got an +A");
            else if (score >= 94 && score <= 96)
                System.out.print("You got an A");
            else if (score >= 90 && score <= 93)
                System.out.print("You got an -A");
            else if (score >= 87 && score <= 89)
                System.out.print("You got a +B");
            else if (score >= 84 && score <= 86)
                System.out.print("You got a B");
            else if (score >= 80 && score <= 83)
                System.out.print("You got a -B");
            else if (score >= 77 && score <= 79)
                System.out.print("You got a +C");
            else if (score >= 74 && score <= 76)
                System.out.print("You got a C");
            else if (score >= 70 && score <= 73)
                System.out.print("You got a -C");
            else if (score >= 60 && score <= 69)
                System.out.print("You got a D");
            else
                System.out.print("Go back to School!");

            System.out.println("\nWould you like to try again?(y/n)");
            userInput = kybd.next();
        }
        System.out.print("Program Ended!");
    }
}
