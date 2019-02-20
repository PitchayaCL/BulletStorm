import java.io.*;
import java.util.Scanner;


public class BulletStorm {
    public static void main(String[] args) {
            Item item = new Item();
            Scanner sc = new Scanner(System.in);
            int Number;
            System.out.println("==============================================");
            System.out.print("Plese Enter Your Name : " );
            String name = sc.next();
            
            Novice novice = new Novice(name);
            System.out.println("*==============================================*");
            System.out.println("   What you want to do " + novice.name + " ?");
            System.out.println("*==============================================*");
            System.out.println(" | Enter 1 for Kill Monter 3:)                |");
            System.out.println(" | Enter 2 for Used HP Potion                 |");
            System.out.println(" | Enter 3 for Used SP Potion                 |");
            System.out.println(" | Enter 4 for open Bag                       |");
            System.out.println(" | Eneter 0 for End Game                      |");
            System.out.println("*==============================================*");

            do {
                System.out.println("\n" + novice.name + ": Enter number to do ");
                Number = sc.nextInt();

                if (Number == 1) {
                    System.out.print("*==============================================*\n");
                    System.out.println("LEVEL" + novice.Kill_Monter());
                    System.out.print("*==============================================*\n");
                } 
                else if (Number == 2) {
                    System.out.print("*==============================================*\n");
                    System.out.println("Enter index");
                    System.out.print("*====================HP Potion=================*\n");
                    System.out.println("HP = " + novice.HP_Potion(sc.nextInt()) );
                    System.out.println("SP = " + novice.SP );
                    System.out.print("*==============================================*\n");
                } 
                else if (Number == 3) {
                    System.out.print("*==============================================*\n");
                    System.out.print("*====================SP Potion=================*\n");
                    System.out.println("Enter index");
                    System.out.println("SP = " + novice.SP_Potion(sc.nextInt()) );
                    System.out.print("*==============================================*\n");
                }
                else if (Number == 4) {
                    System.out.print("*======================BAG=====================*\n");
                    System.out.println("Idex: " + ""); novice.bag.showBag();
                    System.out.print("*==============================================*\n");
                }
            } while (Number != 0);   
    }
}
