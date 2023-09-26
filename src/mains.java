package src;
import java.util.Scanner;

public class mains {
    static Scanner scan = new Scanner(System.in);

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
		System.out.println("[------[   OPTION 1 - LATAM    ]--------]");
		System.out.println("[------[   OPTION 2 - GOL      ]--------]");
		System.out.println("[------[   OPTION 3 - AZUL     ]--------]");

    int operation = scan.nextInt();
		
		switch(operation) {
		case 1:
			LATAM();
			break;
		case 2:
			GOL();
			break;
		case 3:
			AZUL();
			break;
		case 4:
			System.out.println("Good bye, thanks.");
			System.exit(0);
      break;
		default:
			System.out.println("Option wrong.");
			build();
			break;
          }

        }

        public static void LATAM(){

        }

        public static void GOL(){
          
        }

        public static void AZUL(){
          
        }
        
      }
