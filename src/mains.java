package src;
import java.util.Random;
import java.util.Scanner;

public class mains {
    static Scanner scan = new Scanner(System.in);
    static Random random = new Random();
    static Company comp = new Company();

    public static void main(String[] args) {
			interactionCeo();
		}

        public static void interactionCeo(){

          System.out.println("We need to prove that you are who you say you are...");
          System.out.println("Prove writing: 'Yes'... ");
          String answer = scan.nextLine();

          String CorrAnswer = "yes";

          if(answer.equalsIgnoreCase(CorrAnswer)){
            verify();
          }
          else{
            System.out.println("Try again other time...");
             interactionCeo();
          }
        }

        public static void verify(){
          String loginC = "Saulo Andre";
          int passwordC = 321;

          System.out.println("||||||||||||||||||||||");
          System.out.println("--- We go verify... --");
          System.out.println("---- Login page -----");
          System.out.println("------ Login: -------");
          String login = scan.nextLine();
          System.out.println("----- password: ----");
          int password = scan.nextInt();

          if(login.equalsIgnoreCase(loginC) && password == passwordC){
            System.out.println("Welcome, " + loginC + "!");
            normal();
            }
          else{
            System.out.println("Try again other time...");
            interactionCeo();
          }
          }

          public static void normal(){
            System.out.println("|||||||||||");
            System.out.println("User: Root;");
            System.out.println("Master: Admin;");
            System.out.println("CEO?");
            System.out.println("------- Y&$");
            build();
          }

          public static void build(){
    System.out.println("[------------------------------------------------]");
		System.out.println("[-------- WELCOME TO THE CENTRAL COMPANY --------]");
		System.out.println("[-*** CHOOSE THE OPTION FOR THE APPLICATIONS ***-]");
		System.out.println("[------------------------------------------------]");
		System.out.println("    [------[   FIRST - LATAM    ]--------]");
		System.out.println("    [------[   SECOND - GOL     ]--------]");
		System.out.println("    [------[   THIRD - AZUL     ]--------]");

    System.out.println("write 'I'm not a Robot':");
    String res = scan.nextLine();

    if(res.equalsIgnoreCase("I'm not a Robot")){
      comp.company();
    }
    else{
      normal();   
    }
          }
        
        public static void Finally(){

          System.out.println("|||||||||||||||||||||||||||||||");
          System.out.println("| company | hour | value | id |");
          System.out.println("|  " + comp.companyL + "  | " +  comp.hourL1 + "| " + comp.valueL1 + " |" + comp.idL1 + "|");
          System.out.println("|  " + comp.companyL + "  | " + comp.hourL2 + "| " + comp.valueL2 + " |" + comp.idL2 + "|");

        }
        
      }
