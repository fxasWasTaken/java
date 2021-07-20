import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner skan = new Scanner(System.in);
        XYZ zmiennalotto = new XYZ();
        String[] funkcje = {"lottery", "Calculator (WIP)", "More coming soon", "exit"};
        String x;
        boolean loop = true;
        System.out.println("Welcome, please choose your poison: \n1. "+funkcje[0]+"\n2. "+funkcje[1]+"\n"+funkcje[2]+"\n0. "+funkcje[3]);
        while (loop==true) {

                x = skan.nextLine();
            
                switch (x) {
                    case "0":
                        System.out.println("See you next time");
                        loop=false;
                        break;

                    case "1":
                        System.out.println("You choose "+funkcje[0]);
                        zmiennalotto.menu();
                        break;

                    case "2":
                        System.out.println(funkcje[1]+" is Work In Progress, try again");
                        break;

                    default:
                        System.out.println("\nSomething went wrong, try again"+"\nRemember to type a number!");
                        break;

            
                
            }
        }
        skan.close();
    }
}
