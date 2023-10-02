package src;
import java.util.Random;
import java.util.Scanner;

public class Company {
    static Scanner scan = new Scanner(System.in);
    static Random random = new Random();    

        public static void company(){

            String companyL = "LATAM";
            int idL1 = random.nextInt();
            int idL2 = random.nextInt();

            String companyG = "GOL";
            int idG1 = random.nextInt();
            int idG2 = random.nextInt();

            String companyA = "AZUL";
            int idA1 = random.nextInt();
            int idA2 = random.nextInt();
  
            System.out.println("| company | hour | value | id |");
            System.out.println("-------------------------------");
            System.out.println("|----x----|---x--|---x---|--x-|");
            System.out.println("|----x----|---x--|---x---|--x-|");
            
            System.out.println("Hour - 1: First Air Plane :|: ");
            String hourL1 = scan.nextLine();
            System.out.println("value - 1: First Air Plane :|: ");
            String valueL1 = scan.nextLine();
  
            System.out.println("| company | hour | value | id |");
            System.out.println("|  " + companyL + "  | " + hourL1 + "| " + valueL1 + " |" + idL1 + "|");
  
            System.out.println("Hour - 2: Second Air Plane :|: ");
            String hourL2 = scan.nextLine();
            System.out.println("value - 2: Second Air Plane :|: ");
            String valueL2 = scan.nextLine();
  
            System.out.println("| company | hour | value | id |");
            System.out.println("|  " + companyL + "  | " + hourL2 + "| " + valueL2 + " |" + idL2 + "|");
  
            System.out.println("|||||||||||||||||||||||||||||||");
            System.out.println("| company | hour | value | id |");
            System.out.println("|  " + companyL + "  | " + hourL1 + "| " + valueL1 + " |" + idL1 + "|");
            System.out.println("|  " + companyL + "  | " + hourL2 + "| " + valueL2 + " |" + idL2 + "|");
  
            
            System.out.println("||||||||||||||||||||||||||||||");
            System.out.println("Hour - 1: First Air Plane :|: ");
            String hourG1 = scan.nextLine();
            System.out.println("value - 1: First Air Plane :|: ");
            String valueG1 = scan.nextLine();
  
            System.out.println("| company | hour | value | id |");
            System.out.println("|   " + companyG + "   | " + hourG1 + "| " + valueG1 + " |" + idG1 + "|");
  
            System.out.println("Hour - 2: Second Air Plane :|: ");
            String hourG2 = scan.nextLine();
            System.out.println("value - 2: Second Air Plane :|: ");
            String valueG2 = scan.nextLine();
  
            System.out.println("| company | hour | value | id |");
            System.out.println("|   " + companyG + "   | " + hourG2 + "| " + valueG2 + " |" + idG2 + "|");
  
            System.out.println("|||||||||||||||||||||||||||||||");
            System.out.println("| company | hour | value | id |");
            System.out.println("|   " + companyG + "   | " + hourG1 + "| " + valueG1 + " |" + idG1 + "|");
            System.out.println("|   " + companyG + "   | " + hourG2 + "| " + valueG2 + " |" + idG2 + "|");
            
  
            System.out.println("||||||||||||||||||||||||||||||");
            System.out.println("Hour - 1: First Air Plane :|: ");
            String hourA1 = scan.nextLine();
            System.out.println("value - 1: First Air Plane :|: ");
            String valueA1 = scan.nextLine();
  
            System.out.println("| company | hour | value | id |");
            System.out.println("|  " + companyA + "   | " + hourA1 + "| " + valueA1 + " |" + idA1 + "|");
  
            System.out.println("Hour - 2: Second Air Plane :|: ");
            String hourA2 = scan.nextLine();
            System.out.println("value - 2: Second Air Plane :|: ");
            String valueA2 = scan.nextLine();
  
            System.out.println("| company | hour | value | id |");
            System.out.println("|  " + companyA + "   | " + hourA2 + "| " + valueA2 + " |" + idA2 + "|");
  
            System.out.println("|||||||||||||||||||||||||||||||");
            System.out.println("| company | hour | value | id |");
            System.out.println("|  " + companyA + "   | " + hourA1 + "| " + valueA1 + " |" + idA1 + "|");
            System.out.println("|  " + companyA + "   | " + hourA2 + "| " + valueA2 + " |" + idA2 + "|");
            
          }

    }
