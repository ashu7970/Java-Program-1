import java.util.Scanner;
import java.util.Random;
import java.lang.String;
public class Game {
    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("       |-----------------------------------------|");
        System.out.println("       | Welcome To The Rock Paper Scissor World |");
        System.out.println("       |-----------------------------------------|");

        System.out.print("Enter Your Name : ");
        String nam = s1.nextLine();

        System.out.println("Select Your Weapon :-");
           System.out.println("0. Rock");
           System.out.println("1. Paper");
           System.out.println("2. Scissor");
           System.out.println("===== ");
           int a = s1.nextInt();

           switch (a) {
               case 0:
                   System.out.println("You Choose Rock\n");
                   break;
               case 1:
                   System.out.println("You Choose Paper\n");
                   break;
               case 2:
                   System.out.println("You Choose Scissor \n");
                   break;
           }

           Random random = new Random();
           System.out.println("-----------------------------\n");
           System.out.println("Let See What Computer Choose");
           int b = random.nextInt(3);
           int w = 4;

           for (int i = b; i < w; i++) {
               if (i == 0) {
                   System.out.println("Computer Choose Rock\n");
                   break;
               } else if (i == 1) {
                   System.out.println("Computer Choose Paper\n");
                   break;
               } else if (i == 2) {
                   System.out.println("Computer Choose Scissor\n");
                   break;
               }

               System.out.println("----------------------------\n");

           }

           if (a == 0 && b == 0) {
               System.out.println("Match Draw\n");
           } else if (a == 0 && b == 1) {
               System.out.println("Computer Win\n");
           } else if (a == 0 && b == 2) {
               System.out.println("You Win\n");
           } else if (a == 1 && b == 0) {
               System.out.println("You Win\n");
           } else if (a == 1 && b == 1) {
               System.out.println("Match Draw\n");
           } else if (a == 1 && b == 2) {
               System.out.println("Computer Win\n");
           } else if (a == 2 && b == 0) {
               System.out.println("Computer Win\n");
           } else if (a == 2 && b == 1) {
               System.out.println("You Win\n");
           } else if (a==  2 && b == 2) {
               System.out.println("Match Draw\n");
           }
           System.out.println("------------------------");
    }
}

