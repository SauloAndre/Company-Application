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
            build();
            }
          else{
            System.out.println("Try again other time...");
            interactionCeo();
          }
          }

          public static void build(){
            
          }

        }
